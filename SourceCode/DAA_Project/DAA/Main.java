package DAA;
import DAA.Vehicle;
import DAA.Vertex;
import DAA.Distance;
import DAA.Dijkstra;
import DAA.Edge;
import DAA.mainy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;
public class Main extends Dijkstra {

	public static Vertex Zip = null;
	//public static Vertex vx;

	public Main(Vertex argTarget, double argWeight) {
		super(argTarget, argWeight);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException{
		
		// Step1. CREATING TABLES 
new Vehicle();
new Distance();

		
		// TODO Auto-generated method stub
		// Step2. INPUT ZIP CODE
String zipcode = JOptionPane.showInputDialog("Enter the zipcode");
System.out.print("Given zipcode is : "+zipcode+"\n");		
//String vehicle_type = JOptionPane.showInputDialog("What is the type of vehicle to be dispatched:");
		    
	// Step3. FINDING SHORTEST PATH 
// Using Dijkstra's Algorithm
	
		Vertex Zip = new Vertex(zipcode);
		System.out.println("\n"+"Using Dijstra's Algorithm,"+"\n"
				+ "shortest paths from given zipcode to other zipcodes are displayed below");
		Zip.vertexrun(Zip);
	 // System.out.println("zipcode in main: "+Zip+"\n");
		//return Zip;
      
		// Step4. AVAILABILITY CHECK
		mainy.run();
		
		
/*try{
	System.out.print(zipcode);
Vertex x = new Vertex("zipcode");
//System.out.print(x);
Dijkstra.computePaths(x);
}
catch(NullPointerException e)
{
    System.out.print("NullPointerException Caught");
}*/

	// Step5. DISPATCH VEHICLE
           Zip.dispatchVehicle();
		/*String sCurrentLine; 
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\SatyaSaiDeepthi\\workspace-DAA\\DAA_Project\\DAA\\output.txt"));
        sCurrentLine = br.readLine();
    System.out.println("The emergency vehicle is dispatched from the zipcode "+sCurrentLine);
	*///	while ((sCurrentLine = br.readLine()) != null) {
		//	System.out.println("\n");
			//String op = sCurrentLine;
		 // System.out.println(sCurrentLine);
		  
		//}
		//System.out.println("The emergency vehicle is dispatched from the zipcode "+sCurrentLine);
		//int distance = min()
		
	}

}
