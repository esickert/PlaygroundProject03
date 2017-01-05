package csvReader;

import java.util.*;
import java.io.*;

public class CSVReader	{
	
	protected String filename;
	String[] result;
	
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
//	        int lineNumber = 0;
//	        while (sc.hasNextLine()) {
	        while (((filename = sc.nextLine()) != null) && ((sc.hasNextLine())))	{   //GERMANY IS MISSING FROM THIS OUTPUT--LAST INPUT LINE
//	        	lineNumber++;
	        	result = filename.split(",");
	        	for (int x=0; x < result.length; x++) {             //tis needs to be a 2 dimensional array!!!
                    System.out.print(result[x] + ", ");
                
	        	}
	        	System.out.print("\n");
//	            String i = sc.nextLine(); //this stores one line of input, then prints it.
	            
//	            System.out.println(i);
	        }
	        sc.close();  //this just closes Scanner sc 
	        } 
	    catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }
//	    for(int i = 0; i < result.length - 1; i++)	{
//	    	System.out.println(result[5]);
//	    } 
	    
	}

	public void printArray()	{
		System.out.println();
		for(int i = 0; i < result.length; i++) {
		System.out.print(result[i] + ", ");
		}
		System.out.println();
		
	}
	

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
