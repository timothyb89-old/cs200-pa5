
/**
 * CS 200 Colorado State University, Spring 2013
 */
import java.util.LinkedList;
import java.util.List;

// David Council
// Tim Buckley
public class Travel {

	private InformationParser ip;  // your information parser class
	private Graph graph;         // your graph
	private ShortestPath dijkstra; // implementation of dijkstra algorithm

	public Travel(String inputFile) {
		ip = new InformationParser(inputFile);
		try {
			graph = ip.parseExampleFile();
			dijkstra = new ShortestPath(graph);
		} catch (Exception ex) {
			System.err.println("Failed to parse input file: " + ex.getMessage());
			ex.printStackTrace();
		}
	}

	// prints adjacent neighbors (name of cities with direct route from current city)
	public void printNeighbors(String city) {
		 Vertex v = graph.getVertex(city);
		 for (Vertex i : dijkstra.getSimpleNeighbors(v)){
			 System.out.println(i.getName());
		 }
	}

	// prints the name of cities on the shortest path. This list should include the 
	// source and destination as well.
	public void printShortestPath(String cityA, String cityB) {
		Vertex v1 = graph.getVertex(cityA);
		Vertex v2 = graph.getVertex(cityB);
		for (Vertex i : dijkstra.getPath(v1, v2)){
			System.out.println(i.getName());
		}
		
	}

	// prints the shortest possible distance between cityA and cityB
	// Your result should use Dijkstra's algorithm
	public void printShortestDistance(String cityA, String cityB) {
		Vertex v1 = graph.getVertex(cityA);
		Vertex v2 = graph.getVertex(cityB);
		System.out.println(dijkstra.getShortestDistance(v1, v2));
	}
}
