package graphs;

import java.util.*;

class PrimsAlgorithm {
    static class Edge implements Comparable<Edge> {
        int to, weight;

        public Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge other) {
            return Integer.compare(this.weight, other.weight);
        }
    }

    static List<List<Edge>> graph;

    static void addEdge(int from, int to, int weight) {
        graph.get(from).add(new Edge(to, weight));
        graph.get(to).add(new Edge(from, weight));
    }

    static void primMST(int start) {
        PriorityQueue<Edge> minHeap = new PriorityQueue<>();
        boolean[] visited = new boolean[graph.size()];

        minHeap.add(new Edge(start, 0));

        while (!minHeap.isEmpty()) {
            Edge current = minHeap.poll();

            if (visited[current.to]) {
                continue;
            }

            visited[current.to] = true;
            System.out.println("Edge: " + start + " - " + current.to + " | Weight: " + current.weight);

            for (Edge neighbor : graph.get(current.to)) {
                if (!visited[neighbor.to]) {
                    minHeap.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        int vertices = 5;
        graph = new ArrayList<>(vertices);

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        addEdge(0, 1, 2);
        addEdge(0, 3, 1);
        addEdge(1, 2, 3);
        addEdge(1, 3, 2);
        addEdge(1, 4, 4);
        addEdge(2, 4, 5);
        addEdge(3, 4, 7);

        System.out.println("Minimum Spanning Tree (Prim's Algorithm):");
        primMST(0);
    }
}