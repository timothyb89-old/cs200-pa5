
import java.util.ArrayList;
import java.util.List;

/**
 * Vertex is the class to define a city.
 * Design your vertex.
 * What information do you need to describe a city here?
 * Please add your properties and methods.
 */
// David Council
// Tim Buckley
public class Vertex {
    
	private String name;
	private List<Edge> paths;

	public Vertex(String _name){
		this.name = _name;
		paths = new ArrayList<Edge>();
	}
	
	public String getName() {
		return name;
	}

	public List<Edge> getEdges() {
		return paths;
	}
	
	public Edge getEdgeTo(Vertex other) {
		for (Edge e : paths)  {
			if (e.getOpposite(this) == other) {
				return e;
			}
		}
		
		return null;
	}
	
}