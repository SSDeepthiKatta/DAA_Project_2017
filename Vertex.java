package DAA;

import java.util.PriorityQueue;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.List;
 
import DAA.Edge;
import DAA.Dijkstra;
import DAA.Main;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Vertex implements Comparable<Vertex> 
	{
	
	public final String name;
	public Edge[] adjacencies;
	public double minDistance = Double.POSITIVE_INFINITY;
	public Vertex previous;

	public Vertex(String argName) { 
	    name = argName;
	}

	public String toString() {
	    return name;
	}


	public int compareTo(Vertex other)
	{
	    return Double.compare(minDistance, other.minDistance);
	}
	
	public static void dispatchVehicle() throws IOException{
	
		// extracting data from the output file.
		String sCurrentLine; 
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\USER\\eclipse-workspace-DAA\\DAA_Project\\src\\DAA\\output.txt"));
        sCurrentLine = br.readLine();
   
        //printing the dispatch vehicle zipcode
        PrintWriter out = null ;
        try {
            out = new PrintWriter(new FileWriter("C:\\Users\\USER\\eclipse-workspace-DAA\\DAA_Project\\src\\DAA\\output1.txt",true),false);
            } catch (IOException e) {
                  e.printStackTrace();
            }
        out.println("The emergency vehicle is dispatched from the zipcode "+sCurrentLine);
        out.close();
        }
	
	//Initializing the Dijkstras algorithm
	
	public static void vertexrun(Vertex vx){
	
		Vertex v0 = new Vertex("64151");
		Vertex v1 = new Vertex("64149");
		Vertex v2 = new Vertex("64230");
		Vertex v3 = new Vertex("64372");
		Vertex v4 = new Vertex("63210");

		v0.adjacencies = new Edge[]{new Edge(v1,  10), new Edge(v2,  30), new Edge(v4,  100)};
		v1.adjacencies = new Edge[]{new Edge(v3,  50)};
		v2.adjacencies = new Edge[]{new Edge(v3, 20), new Edge(v4, 60)};
		v3.adjacencies = new Edge[]{new Edge(v4, 10)};
		v4.adjacencies = new Edge[]{new Edge(v1, 120)};
		
	Vertex[] vertices = { v0, v1, v2, v3, v4 };
	
	for (Vertex v : vertices)
			{
		if(vx != v0)
		{
			//System.out.println("equal");
			Dijkstra.computePaths(v0);
		
			System.out.println("Distance to " + v + ": " + v.minDistance);
	
		}	
			
		}
		
	
	
	   	}

	
	public static void main(String[] args) 
	{
	 
		// main function
	}
	
	}