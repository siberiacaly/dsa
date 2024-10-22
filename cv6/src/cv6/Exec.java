package cv6;

public class Exec {

    public static void main(String[] args) {
        Graph g = new Graph();
        g.addPath("1", "6", 6);
        g.addPath("1", "2", 4);
        g.addPath("1", "7", 16);
        g.addPath("6", "7", 8);
        g.addPath("5", "6", 5);
        g.addPath("7", "5", 10);
        g.addPath("7", "8", 21);
        g.addPath("5", "4", 11);
        g.addPath("5", "3", 18);
        g.addPath("2", "3", 24);
        g.addPath("4", "3", 9);
        g.addPath("4", "8", 7); 

        Path p = new Path(g, "1");
        p.addConnection("6");
        p.addConnection("5");
        System.out.println(p.getWeight());
    }
}
