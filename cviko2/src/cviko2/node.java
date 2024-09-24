package cviko2;

import java.util.Vector;

public class node {
	private Vector<node> nodes;

	public node getNode(int i) {
		return nodes.get(i);
	}

	public void setNode(node x) {
		this.nodes.add(x);
	}
}