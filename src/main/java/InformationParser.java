
/**
 * InformationParser is the class for 1. accessing file 2. reading records 3.
 * creating vertices and edges 4. generating graph Please add any method you
 * need.
 */
import java.io.*;
import java.util.*;

// David Council
// Tim Buckley
public class InformationParser {

	private String location;

	// constructor
	public InformationParser(String location) {
		this.location = location;
	}

	// parses an example file specified in filelocation, and 
	// creates a graph or adds vertices and edges to an existing graph
	// finally, it returns a graph
	public Graph parseExampleFile() throws IOException {
		FileReader reader = new FileReader(location);
		BufferedReader br = new BufferedReader(reader);
		
		Graph ret = new Graph();
		
		String line;
		while ((line = br.readLine()) != null) {
			String[] tokens = line.split(" ");
			
			String a = tokens[0];
			String b = tokens[1];
			int distance = Integer.parseInt(tokens[2]);
			
			Vertex insert = ret.getVertex(a);
			if (insert == null){
				insert = new Vertex(a);
				ret.getVertices().add(insert);
			}
			Vertex insertb = ret.getVertex(b);
			if (insertb == null){
				insertb = new Vertex(b);
				ret.getVertices().add(insertb);
			}
			
			Edge addMe = new Edge(insert,insertb,distance);
			
			insert.getEdges().add(addMe);
			insertb.getEdges().add(addMe);
	
		}
		
		br.close();
		return ret;
	}
}