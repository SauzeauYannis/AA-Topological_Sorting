package src;

import src.Vertex.Color;

/**
 * Main class to make the topological sorting
 * @author Yannis Sauzeau
 */
public class TopologicalSorting {

    private static Graph graph;
    private static MyStack vertices;
    
    /** 
     * This is the main function where the topological sorting
     * is make with the graph detecting in the standard input
     * 
     * @param args  Programm arguments
     */
    public static void main(String[] args) {
        graph = new Graph();
        vertices = new MyStack();

        Boolean hasCircuit = false;

        for (Vertex vertex : graph.getVertices()) {
            if (vertex.getMark() == Color.GREEN) {
                try {
                    DFS(vertex);
                } catch (Exception e) {
                    System.out.print("Circuit detected => ");
                    hasCircuit = true;
                    break;
                }
            }
        }

        if (!hasCircuit) System.out.print("Topological sort => ");
        System.out.println(vertices.popAll());
    }
    
    /** 
     * Depth-first search (DFS) algorithm on one vertex
     * 
     * @param vertex  The vertex where the DFS is done
     */
    private static void DFS(Vertex vertex) {
        vertex.setMark(Color.ORANGE);

        for (int successorsNum : vertex.getSuccessors()) {
            Vertex successor = graph.getVertices()[successorsNum - 1];
            
            if (successor.getMark() == Color.GREEN) {
                successor.setExplorer(vertex.getNumber());
                DFS(successor);
            } else if (successor.getMark() == Color.ORANGE) {
                System.err.println("[ERROR] - One circuit has been detected in the graph");
                vertices.clear();
                int startCycle = successor.getNumber();
                vertices.push(vertex.getNumber());
                int explorer = vertex.getExplorer();
                vertices.push(explorer);
                while (explorer != startCycle) {
                    explorer = graph.getVertices()[explorer - 1].getExplorer();
                    vertices.push(explorer);
                }
                throw new RuntimeException();
            }
        }

        vertex.setMark(Color.RED);
        vertices.push(vertex.getNumber());
    }

}
