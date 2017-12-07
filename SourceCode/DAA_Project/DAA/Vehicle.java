package DAA;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Vehicle extends JFrame {
JTable jt;
String [] column_headers={"VehicleID","VehicleType", "ZipCode"};
String [][] team_statistics={{"1","1","64151"},{"2","1","64151"},{"3","1","64151"},
		{"4","2","64151"},{"5","3","64151"},{"6","3","64151"},
		{"","",""},
		{"7","1","64149"},
		{"8","3","64149"},{"9","3","64149"},{"10","3","64149"},
		{"","",""},
		{"11","2","64230"},
		{"","",""},
		{"13","2","64372"},{"14","3","64372"},
		{"15","3","64372"},{"16","3","64372"},{"17","3","64372"},
		{"","",""},
		{"18","1","63210"},
		{"19","3","63210"},
};

	public Vehicle()
	{
		jt=new JTable(team_statistics,column_headers);
		jt.setBounds(50,50,200,230);
		JScrollPane js=new JScrollPane(jt);
		this.add(js);
		this.setSize(800,900);
		this .setVisible(true);
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Vehicle();
	}

}