package pekan9_2511533019;

import java.util.*;

public class GraphTraversal_2511533019 {
  private Map<String, List<String>> graph_3019 = new HashMap<>();

     // Menambahkan edge (graf tak berarah)
     public void addEdge_3019(String node1_3019, String node2_3019) {
         graph_3019.putIfAbsent(node1_3019, new ArrayList<>());
         graph_3019.putIfAbsent(node2_3019, new ArrayList<>());
         graph_3019.get(node1_3019).add(node2_3019);
         graph_3019.get(node2_3019).add(node1_3019);
     }

     // Menampilkan graf awal
     public void printGraph_3019() {
         System.out.println("Graf Awal (Adjacency List):");
         for (String node_3019 : graph_3019.keySet()) {
             System.out.print(node_3019 + " -> ");
             List<String> neighbors_3019 = graph_3019.get(node_3019);
             System.out.println(String.join(", ", neighbors_3019));
         }
         System.out.println();
     }

     // DFS rekursif
     public void dfs_3019(String start_3019) {
         Set<String> visited_3019 = new HashSet<>();
         System.out.println("Penelusuran DFS:");
         dfsHelper_3019(start_3019, visited_3019);
         System.out.println();
     }

     private void dfsHelper_3019(String current_3019, Set<String> visited_3019) {
         if (visited_3019.contains(current_3019)) return;
         visited_3019.add(current_3019);
         System.out.print(current_3019 + " ");
         for (String neighbor_3019 : graph_3019.getOrDefault(current_3019, new ArrayList<>())) {
             dfsHelper_3019(neighbor_3019, visited_3019);
         }
     }
     
  // BFS iteratif
  public void bfs_3019(String start_3019) {
      Set<String> visited_3019 = new HashSet<>();
      Queue<String> queue_3019 = new LinkedList<>();

      queue_3019.add(start_3019);
      visited_3019.add(start_3019);

      System.out.println("Penelusuran BFS:");
      while (!queue_3019.isEmpty()) {
          String current_3019 = queue_3019.poll();
          System.out.print(current_3019 + " ");

          for (String neighbor : graph_3019.getOrDefault(current_3019, new ArrayList<>())) {
              if (!visited_3019.contains(neighbor)) {
                  queue_3019.add(neighbor);
                  visited_3019.add(neighbor);
              }
          }
      }
      System.out.println();
  }

  // Main
  public static void main(String[] args) {
      GraphTraversal_2511533019 graph_3019 = new GraphTraversal_2511533019();

      // Contoh graf: A-B, A-C, B-D, B-E
      graph_3019.addEdge_3019("A", "B");
      graph_3019.addEdge_3019("A", "C");
      graph_3019.addEdge_3019("B", "D");
      graph_3019.addEdge_3019("B", "E");

      // Cetak graf awal
      System.out.println("Graf Awal adalah: ");
      graph_3019.printGraph_3019();

      // Lakukan penelusuran
      graph_3019.dfs_3019("A");
      graph_3019.bfs_3019("A");
  }

 }