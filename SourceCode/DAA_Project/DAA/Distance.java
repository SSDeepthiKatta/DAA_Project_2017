package DAA;
import DAA.Vehicle;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Distance extends JFrame {
JTable jt1;
String [] column_headers1={"ZipCode1","ZipCode2", "Distance"};
String [][] team_statistics1={{"64151","64149","10"},{"64151","63210","100"},
		{"","",""},
		{"64149","64230","50"},
		{"","",""},
		{"64230","63210","10"},
		{"","",""},
		{"64372","64230","20"},{"64372","63210","60"},
		{"","",""},
		{"63210","64149","120"}
};


	public Distance()
	{
		jt1=new JTable(team_statistics1,column_headers1);
		jt1.setBounds(50,50,200,230);
		JScrollPane js1=new JScrollPane(jt1);
		this.add(js1);
		this.setSize(800,900);
		this .setVisible(true);
		PrintWriter out1 = null ;
		try {
            //out = new PrintWriter(new FileWriter("C:\\Users\\Pranathi Gopidi\\eclipse-workspace\\DAA\\src\\DAA\min.txt",true),true);
        	BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Pranathi Gopidi\\eclipse-workspace\\DAA\\src\\DAA\\min.txt"));
            } catch (IOException e) {
                  e.printStackTrace();
            }
        out1.println(js1);
        out1.close();
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Distance();
	}

}