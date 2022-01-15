package src;

import java.util.Scanner;

/**
 * Graph class represented by a adjacencyList of vertex
 * @author Yannis Sauzeau
 */
public class Graph {

    private Vertex[] vertices;

    public Graph() {
        Scanner scanner = new Scanner(System.in);

        int verticesNum = scanner.nextInt();

        this.vertices = new Vertex[verticesNum];
        int[] buffer = new int[verticesNum]; // This buffer is usefull to create the successors array

        for (int i = 0; i < verticesNum; i++) {
            int vertex = scanner.nextInt();
            int successorNum = 0;
            int successor = scanner.nextInt();

            while (successor != 0) {
                buffer[successorNum] = successor;
                successor = scanner.nextInt();
                successorNum++;
            }

            int[] successors = new int[successorNum];
            System.arraycopy(buffer, 0, successors, 0, successorNum); // Copy the content of buffer with the good size
            this.vertices[vertex - 1] = new Vertex(vertex, successors);
        }

        scanner.close();
    }

    public Vertex[] getVertices() { return this.vertices; }

}
