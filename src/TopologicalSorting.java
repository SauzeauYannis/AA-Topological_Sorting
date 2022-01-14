package src;

import java.util.Stack;

import src.Vertex.Color;

public class TopologicalSorting {
    
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        Graph graph = new Graph();

        for (Vertex vertex : graph.getVertices()) {
            if (vertex.getColor() == Color.GREEN)
                DFS(stack, graph, vertex);
        }

        while (!stack.isEmpty())
            System.out.println(graph.getVertices()[stack.pop() - 1].getNumber());
    }

    private static void DFS(Stack<Integer> stack, Graph graph, Vertex vertex) {
        vertex.setColor(Color.ORANGE);

        for (int neighboursN : vertex.getNeighbours()) {
            Vertex neighbour = graph.getVertices()[neighboursN - 1];
            
            if (neighbour.getColor() == Color.GREEN) {
                neighbour.setExplorer(vertex.getNumber());
                DFS(stack, graph, neighbour);
            } else if (neighbour.getColor() == Color.ORANGE) {
                System.err.println("Detected one circuit");
            }
        }

        vertex.setColor(Color.RED);
        stack.push(vertex.getNumber());
    }

}
