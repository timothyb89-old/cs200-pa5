
/**
 * Graph is the class containing information about your graph such as vertices
 * and edges
 */
import java.util.ArrayList;
import java.util.List;

// David Council
// Tim Buckley
public class Graph {

	private List<Vertex> vertices;

	// constructors
	public Graph(List<Vertex> vertices) {
		this.vertices = vertices;
	}

	/**
	 * Constructs an empty {@code Graph}. 
	 */
	public Graph() {
		vertices = new ArrayList<Vertex>();
	}

	// sets multiple vertices
	public void setVertices(List<Vertex> vertices) {
		this.vertices = vertices;
	}

	// checks if this graph has this vertex with specified name
	public boolean hasVertex(String name) {
		for (Vertex v : vertices) {
			if (v.getName().equals(name)) {
				return true;
			}
		}
		
		return false;
	}

	// returns the vertex described with specified name
	public Vertex getVertex(String name) {
		for (Vertex v : vertices) {
			if (v.getName().equals(name)) {
				return v;
			}
		}
		
		return null;
	}

	// returns the list of vertices
	public List<Vertex> getVertices() {
		return vertices;
	}
	
}