package src;

import java.util.Scanner;

public class TopologicalSorting {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int order = scanner.nextInt();

        AdjacencyList adjacencyList = new AdjacencyList(order);

        scanner.close();
    }

}
