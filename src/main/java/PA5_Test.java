/**
 * CS 200 Colorado State University, Spring, 2013
 * This is the test class for PA5. 
 * DO NOT MODYFY main(). Grading will be based on main() of this class.
 */


public class PA5_Test{
    //NOTE: DO NOT MODIFY main().
    public static void main(String args[]){
	if (args.length < 2){
	    System.out.println("Please enter your input file and command.");
	    System.out.println("e.g. java PA5_test [input_file][command1][command2]");
	}else{	    
	    String input_file = args[0];
	    String cmd = args[1];
	    	    
	    Travel mytravel = new Travel(input_file);
	    int type_size = 0;
		
	    if (cmd.equals("printNeighbors")){
		mytravel.printNeighbors(args[2]);
	    }else if(cmd.equals("printShortestPath")){
		mytravel.printShortestPath(args[2],args[3]);
	    }else if(cmd.equals("printShortestDistance")){
		mytravel.printShortestDistance(args[2], args[3]);
	    }
	
	    
	}
    }
}
