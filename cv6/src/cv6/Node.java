package cv6;

import java.util.HashMap;
import java.util.HashSet;

public class Node {
    private HashSet<Node> neighbors;
    private HashMap<Node, Integer> weight;

   public Node(String name) {
    this.neighbors = new HashSet<>();
    this.weight = new HashMap<>();
   }
   
   public void addNeighbor(Node n, int weight) {
    this.neighbors.add(n); 
    this.weight.put(n, weight);
   } 
   
   public int getWeight(Node n) {
    return weight.get(n);
   }
}
