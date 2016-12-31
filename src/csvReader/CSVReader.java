package csvReader;

import java.util.*;
import java.io.*;

public class CSVReader	{
	
	protected String filename;
	
	CSVReader(String filename)	{
		this.filename = filename;
		System.out.println("This is just the path statement: " + filename + "\n");
	}
	
	//************************************************************************
	public void importFile() { 
	 //	    this is sooo much easier in c++ to read an external file!!!!
//	    final String ADDRESS = "c:\\Temp\\ReadFromFileStuff\\cellular_short_oneDecade.csv";
	    File file = new File(filename);  //note the double backslashes for windows

	    try {

	        Scanner sc = new Scanner(file);

	        while (sc.hasNextLine()) {
	            String i = sc.nextLine(); //this stores one line of input, then prints it.
	            System.out.println(i);
	        }
	        sc.close();
	        } 
	    catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }
	    
	}
//	}
	//********************************************************************* 	
	public String[] getCountryNames()	{
		String[] temp = {"England"};
		return 	temp;
	}
	
	public int[] getYearLabels()	{
		int[] temp = {0};
		return temp;		
	}
	
	public double[][] getParsedTable()	{
		double[][] temp = {{0.0,0.0},{0.0,0.0}};
		return temp;		
	}
	
	public int getNumberOfYears()	{
		int temp = 0;
		return temp;
	}
}
