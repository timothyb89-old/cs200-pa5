
/**
 * Graph is the class containing information about your graph such as vertices
 * and edges
 */
import java.util.ArrayList;
import java.util.List;

public class Graph {

	private List<Vertex> vertices;
	private List<Edge> edges;

	// constructors
	public Graph(List<Vertex> vertices, List<Edge> edges) {
		this.vertices = vertices;
		this.edges = edges;
	}

	public Graph() {
		vertices = new ArrayList<Vertex>();
	}

	// sets multiple vertices
	public void setVertices(List<Vertex> vertices) {
		this.vertices = vertices;
	}

	// sets multiple edges
	public void setEdges(List<Edge> edges) {
		this.edges = edges;
	}

	// checks if this graph has this vertex with specified name
	public boolean hasVertex(String name) {
		// add your code here
	}

	// returns the vertex described with specified name
	public Vertex getVertex(String name) {
		// add your code here
	}

	// checkes if this graph has this edge. 
	// please make sure that this graph is undirected.
	public boolean hasEdge(String source, String dest, int dist) {
		// add your code here
	}

	// returns the edge from the edge list
	public Edge getEdge(Edge thisEdge) {
		// add your code here
	}

	// returns the list of vertices
	public List<Vertex> getVertices() {
		return vertices;
	}

	// returns the list of edges
	public List<Edge> getEdges() {
		return edges;
	}
}