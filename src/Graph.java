package src;

import java.util.Scanner;

public class Graph {

    private Vertex[] vertices;

    public Graph() {
        Scanner scanner = new Scanner(System.in);

        int verticesN = scanner.nextInt();

        this.vertices = new Vertex[verticesN];
        int[] buffer = new int[verticesN];

        for (int i = 0; i < verticesN; i++) {
            int vertex = scanner.nextInt();
            int neighbourN = 0;
            int neighbour = scanner.nextInt();

            while (neighbour != 0) {
                buffer[neighbourN] = neighbour;
                neighbour = scanner.nextInt();
                neighbourN++;
            }

            int[] neighbours = new int[neighbourN];
            System.arraycopy(buffer, 0, neighbours, 0, neighbourN);
            this.vertices[vertex - 1] = new Vertex(vertex, neighbours);
        }

        scanner.close();
    }

    public Vertex[] getVertices() { return this.vertices; }

}
