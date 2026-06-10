package pekan9_2511533019;

import java.util.*;

public class GraphRS_2511533019 {

    private Map<String, List<String>> graph_3019;
    private List<String> visitedOrder_3019;
    private List<String> path_3019;

    public GraphRS_2511533019() {
        graph_3019 = new HashMap<>();
        visitedOrder_3019 = new ArrayList<>();
        path_3019 = new ArrayList<>();
        // EDGE RUMAH SAKIT
        addEdge_3019("Parkir", "Pintu Masuk");
        addEdge_3019("Parkir", "Kantin");
        addEdge_3019("Pintu Masuk", "IGD");
        addEdge_3019("Pintu Masuk", "Apotek");
        addEdge_3019("IGD", "Radiologi");
        addEdge_3019("IGD", "Laboratorium");
        addEdge_3019("Apotek", "Kantin");
        addEdge_3019("Apotek", "Laboratorium");
        addEdge_3019("Apotek", "Poliklinik");
        addEdge_3019("Laboratorium", "ICU");
        addEdge_3019("Laboratorium", "Ruang Rawat");
        addEdge_3019("Kantin", "Poliklinik");
        addEdge_3019("Poliklinik", "Ruang Rawat");
        addEdge_3019("Ruang Rawat", "ICU");
    }
    public void addEdge_3019(String node1_3019, String node2_3019) {
        graph_3019.putIfAbsent(node1_3019, new ArrayList<>());
        graph_3019.putIfAbsent(node2_3019, new ArrayList<>());
        graph_3019.get(node1_3019).add(node2_3019);
        graph_3019.get(node2_3019).add(node1_3019);
    }
    public List<String> getVisitedOrder_3019() {
        return visitedOrder_3019;
    }
    public List<String> getPath_3019() {
        return path_3019;
    }
    public int getExploredCount_3019() {
        return visitedOrder_3019.size();
    }
    public void BFS_3019(String start_3019, String goal_3019) {
        visitedOrder_3019.clear();
        path_3019.clear();
        Queue<String> queue_3019 = new LinkedList<>();
        Set<String> visited_3019 = new HashSet<>();
        Map<String, String> parent_3019 = new HashMap<>();
        queue_3019.add(start_3019);
        visited_3019.add(start_3019);
        while (!queue_3019.isEmpty()) {
            String current_3019 = queue_3019.poll();
            visitedOrder_3019.add(current_3019);
            if (current_3019.equals(goal_3019))
                break;
            for (String neighbor_3019 : graph_3019.get(current_3019)) {
                if (!visited_3019.contains(neighbor_3019)) {
                    visited_3019.add(neighbor_3019);
                    parent_3019.put(neighbor_3019, current_3019);
                    queue_3019.add(neighbor_3019);
                }
            }
        }
        buildPath_3019(parent_3019, start_3019, goal_3019);
    }
    public void DFS_3019(String start_3019, String goal_3019) {
        visitedOrder_3019.clear();
        path_3019.clear();
        Stack<String> stack_3019 = new Stack<>();
        Set<String> visited_3019 = new HashSet<>();
        Map<String, String> parent_3019 = new HashMap<>();
        stack_3019.push(start_3019);
        while (!stack_3019.isEmpty()) {
            String current_3019 = stack_3019.pop();
            if (!visited_3019.contains(current_3019)) {
                visited_3019.add(current_3019);
                visitedOrder_3019.add(current_3019);
                if (current_3019.equals(goal_3019))
                    break;
                List<String> neighbors_3019 = new ArrayList<>(graph_3019.get(current_3019));
                Collections.reverse(neighbors_3019);
                for (String neighbor_3019 : neighbors_3019) {
                    if (!visited_3019.contains(neighbor_3019)) {
                        parent_3019.put(neighbor_3019, current_3019);
                        stack_3019.push(neighbor_3019);
                    }
                }
            }
        }
        buildPath_3019(parent_3019, start_3019, goal_3019);
    }
    private void buildPath_3019(
            Map<String, String> parent_3019,
            String start_3019,
            String goal_3019) {

        String current_3019 = goal_3019;
        while (current_3019 != null) {
            path_3019.add(current_3019);
            if (current_3019.equals(start_3019))
                break;
            current_3019 = parent_3019.get(current_3019);
        }
        Collections.reverse(path_3019);
    }
    public void resetGraph_3019() {
        visitedOrder_3019.clear();
        path_3019.clear();
    }
}