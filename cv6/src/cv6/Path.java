package cv6;

public class Path {
    private Graph graph;
    private int weight = 0;
    private Node start;

    public Path(Graph g, String n) {
        this.graph = g;
        this.start = g.getNode(n);
    }

    public void addConnection(String a) {
        Node n1 = graph.getNode(a);
        if (n1 == null) {
            throw new IllegalArgumentException("Uzel " + a + " neexistuje v grafu.");
        }
        int connectionWeight = start.getWeight(n1);
        this.weight += connectionWeight;
        this.start = n1;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
