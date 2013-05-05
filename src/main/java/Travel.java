/**
 * CS 200 Colorado State University, Spring 2013
 */

import java.util.LinkedList;
import java.util.List;
public class Travel{
    String input_file;     // path to the input example file
    InformationParser ip;  // your information parser class
    Graph myGraph;         // your graph
    ShortestPath dijkstra; // implementation of dijkstra algorithm

    public Travel(String _input_file){
	input_file = _input_file;                   // copy the location of input file
	List <Edge> edges = new LinkedList();       // create empty list for edges
	List <Vertex> vertices = new LinkedList();  // create empty list for vertices
	myGraph = new Graph(vertices,edges);        // create empty graph
	ip = new InformationParser(input_file);     // create an instance of InformationParser
	ip.parseExampleFile(myGraph);               // parse your file into myGraph
	
	dijkstra = new ShortestPath(myGraph);       // execute your dijkstra's algorithm
	
    }

    // prints adjacent neighbors (name of cities with direct route from current city)
    public void printNeighbors(String city){
	// add your code here
    }

    // prints the name of cities on the shortest path. This list should include the 
    // source and destination as well.
    public void printShortestPath(String cityA, String cityB){
	// add your code here
    }

    // prints the shortest possible distance between cityA and cityB
    // Your result should use Dijkstra's algorithm
    public void printShortestDistance(String cityA, String cityB){
	// add your code here
    }  

}
