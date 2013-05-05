
import java.util.*;

/**
 * ShortestPath is an implementation of Dijkstra's algorithm
 *
 * Create methods you need.
 */
// David Council
// Tim Buckley
public class ShortestPath {

	private Graph graph;

	public ShortestPath(Graph graph) {
		this.graph = graph;
	}

	// Returns a list of the neighbored cities.
	// Here neighbored cities are the cities have direct route from 
	// the specified city.
	public List<Vertex> getSimpleNeighbors(Vertex node) {
		List<Vertex> ret = new ArrayList<Vertex>(node.getEdges().size());
		
		for (Edge e : node.getEdges()) {
			ret.add(e.getOpposite(node));
		}
		
		return ret;
	}

	// returns the shortest distance between start and end
	public int getShortestDistance(Vertex start, Vertex end) {
		List<Vertex> path = getPath(start, end);
		
		int total = 0;
		
		Vertex last = null;
		for (Vertex v : path) {
			if (last == null) { // skip first element
				last = v;
				continue;
			}
			
			total += last.getEdgeTo(v).getDistance();
			last = v;
		}
		
		return total;
	}

	
	// This method returns the path from the source to the selected target and
	// NULL if no path exists    
	public List<Vertex> getPath(Vertex start, Vertex end) {
		final Map<Vertex, Integer> distances = new HashMap<Vertex, Integer>();
		
		// the last nodes in the shortest path (adjacency matrix)
		Map<Vertex, Vertex> lastNode = new HashMap<Vertex, Vertex>();
		
		for (Vertex v : graph.getVertices()) {
			distances.put(v, Integer.MAX_VALUE);
			lastNode.put(v, null);
		}
		
		distances.put(start, 0);
		
		Comparator<Vertex> c = new Comparator<Vertex>() {

			public int compare(Vertex a, Vertex b) {
				return distances.get(a) - distances.get(b);
			}
			
		};
		
		PriorityQueue<Vertex> set = new PriorityQueue<Vertex>(
				graph.getVertices().size(), c);
		set.addAll(graph.getVertices());
		
		while (!set.isEmpty()) {
			// pop the shortest partial path
			Vertex v = set.poll();
			
			// break if there's no valid path
			// since we're sorted the only vertices left had no connecting paths
			if (distances.get(v) == Integer.MAX_VALUE) {
				break;
			}
			
			// find distances from the source to neighbors of v
			for (Edge e : v.getEdges()) {
				Vertex neighbor = e.getOpposite(v);
				
				// find the total distance for this partial path
				// (include path up to v, plus this neighbor)
				int total = distances.get(v) + e.getDistance();
				
				// check if this new path is shorter than one we already know
				if (total < distances.get(neighbor)) {
					// if so, reinsert to update the distance
					set.remove(neighbor); // clear the old
					distances.put(neighbor, total); // update the distance
					set.add(neighbor); // put it back + resort
					
					// update the last node reference
					lastNode.put(neighbor, v);
				}
			}
		}
		
		// rebuild the path - work backwards over the lastNode map
		List<Vertex> ret = new ArrayList<Vertex>();
		Vertex v = end;
		ret.add(v);
		
		while (lastNode.get(v) != null) {
			ret.add(lastNode.get(v));
			v = lastNode.get(v);
		}
		Collections.reverse(ret); // whoops
		
		return ret;
	}
	
}
