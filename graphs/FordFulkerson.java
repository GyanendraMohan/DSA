package graphs;

import java.util.*;

public class FordFulkerson {

    // Returns true if there is a path from s to t in residual graph.
    // Also fills parent[] to store the path.
    private boolean bfs(int[][] rGraph, int s, int t, int[] parent) {
        int V = rGraph.length;
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        visited[s] = true;
        parent[s] = -1;

        while (!queue.isEmpty()) {
            int u = queue.poll();

            for (int v = 0; v < V; v++) {
                if (!visited[v] && rGraph[u][v] > 0) {
                    queue.add(v);
                    parent[v] = u;
                    visited[v] = true;
                    if (v == t)
                        return true;
                }
            }
        }
        return false;
    }

    // Returns the maximum flow from s to t in the given graph
    public int fordFulkerson(int[][] graph, int s, int t) {
        int u, v;

        // Create a residual graph and fill the residual graph with
        // given capacities in the original graph as residual capacities.
        int V = graph.length;
        int[][] rGraph = new int[V][V];

        for (u = 0; u < V; u++)
            for (v = 0; v < V; v++)
                rGraph[u][v] = graph[u][v];

        int[] parent = new int[V]; // Array to store the path
        int max_flow = 0; // No flow initially

        // Augment the flow while there is a path from source to sink
        while (bfs(rGraph, s, t, parent)) {
            // Find minimum residual capacity of the path found by BFS.
            int path_flow = Integer.MAX_VALUE;
            for (v = t; v != s; v = parent[v]) {
                u = parent[v];
                path_flow = Math.min(path_flow, rGraph[u][v]);
            }

            // update residual capacities and reverse edges along the path
            for (v = t; v != s; v = parent[v]) {
                u = parent[v];
                rGraph[u][v] -= path_flow;
                rGraph[v][u] += path_flow;
            }

            // Add path flow to overall flow
            max_flow += path_flow;
        }

        return max_flow;
    }

    // Example usage (Driver)
    public static void main(String[] args) {
        int graph[][] = {
                { 0, 16, 13, 0, 0, 0 },
                { 0, 0, 10, 12, 0, 0 },
                { 0, 4, 0, 0, 14, 0 },
                { 0, 0, 9, 0, 0, 20 },
                { 0, 0, 0, 7, 0, 4 },
                { 0, 0, 0, 0, 0, 0 }
        };
        FordFulkerson ff = new FordFulkerson();
        System.out.println("The maximum possible flow is " +
                ff.fordFulkerson(graph, 0, 5));
    }
}



// FUNCTION FordFulkerson(Graph G, Source S, Sink T):
//     // Initialize flow in all edges to 0
//     FOR each edge (u, v) in G:
//         flow(u, v) = 0

//     // Create a residual graph G_f with residual capacities
//     // For each edge (u,v) with capacity c(u,v) and flow f(u,v):
//     //   Residual capacity of (u,v) is c(u,v) - f(u,v)
//     //   Residual capacity of (v,u) (reverse edge) is f(u,v)
   
//     max_flow = 0

//     // While there exists an augmenting path from S to T in the residual graph G_f
//     WHILE (there exists a path P from S to T in G_f):
//         // Find the bottleneck capacity (minimum residual capacity) along path P
//         path_flow = INFINITY
//         FOR each edge (u, v) in path P:
//             path_flow = MIN(path_flow, residual_capacity(u, v))

//         // Augment flow along path P
//         FOR each edge (u, v) in path P:
//             IF (u, v) is a forward edge in the original graph:
//                 flow(u, v) = flow(u, v) + path_flow
//             ELSE IF (u, v) is a reverse edge in the residual graph:
//                 // This implies (v, u) was a forward edge in the original graph
//                 flow(v, u) = flow(v, u) - path_flow
       
//         // Update the residual graph G_f based on the new flow values
//         // (This step is implicitly handled by updating flow values and recalculating residual capacities)

//         max_flow = max_flow + path_flow

//     RETURN max_flow  
