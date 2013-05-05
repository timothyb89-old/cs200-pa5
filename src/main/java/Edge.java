
/**
 * Edge is the class to define a route between cities Design your edge. What
 * information do you need to specify an Edge? Please add your methods and
 * properties.
 */
// David Council
// Tim Buckley
public class Edge {
	
	private Vertex a;
	private Vertex b;
	private int distance;

	public Edge() {
	}

	public Edge(Vertex a, Vertex b, int distance) {
		this.a = a;
		this.b = b;
		this.distance = distance;
	}

	public Vertex getA() {
		return a;
	}

	public void setA(Vertex a) {
		this.a = a;
	}

	public Vertex getB() {
		return b;
	}

	public void setB(Vertex b) {
		this.b = b;
	}
	
	/**
	 * Checks if this edge contains the vertex {@code v} such that either the
	 * A or B nodes are equal to it.
	 * @param v the vertex to check for
	 * @return true of {@code v} 'participates' in this edge
	 */
	public boolean contains(Vertex v) {
		return v.equals(a) || v.equals(b);
	}

	/**
	 * Gets the vertex that is "opposite" the given vertex. Assuming the vertex
	 * represents either the A or B node of this edge, this returns the node on
	 * the other "end" of the edge. Note that providing a vertex that is not
	 * part of this edge may result in unexpected results.
	 * @param v the vertex to exclude
	 * @return the vertex "opposite" to the given vertex
	 */
	public Vertex getOpposite(Vertex v) {
		if (v == a) {
			return b;
		} else {
			return a;
		}
	}
	
	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	public boolean matches(String searchA, String searchB, int distance) {
		if (this.distance != distance) {
			return false;
		}
		
		boolean matchA = false;
		boolean matchB = false;
		
		if (a.getName().equals(searchA) || a.getName().equals(searchB)) {
			matchA = true;
		}
		
		if (b.getName().equals(searchA) || b.getName().equals(searchB)) {
			matchB = true;
		}
		
		return matchA && matchB;
	}
	
}
