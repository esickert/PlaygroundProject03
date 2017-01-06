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

	        Scanner inputStream = new Scanner(file);
//	        int lineNumber = 0;

	        
	        while (((filename = inputStream.nextLine()) != null)){ //|| (inputStream.hasNextLine()))	{   //GERMANY IS MISSING FROM THIS OUTPUT--LAST INPUT LINE
//	           	System.out.println(inputStream.hasNextLine());  //this is true because germany is still left!!!!

	        	result = filename.split(",");
	        	
	        	forRecussion(0);  //	THIS IS A RECUSSIVE CALL TO PRINT OUT THE TABLE.
//	        	for (int x=0; x < result.length; x++) {             //this needs to be a 2 dimensional array!!!
//                    System.out.print(result[x] + ", ");
//                } 
	        	System.out.print(".......Missing Germany???\n");
//	            String i = sc.nextLine(); //this stores one line of input, then prints it.
	            
//	            System.out.println(i);
//	        	lineNumber++;
	        }
	        inputStream.close();  //this just closes Scanner sc 
	        } 
	    catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }
	}

	public void printArray()	{
		System.out.println("\nThis prints out the last entry in the array using recussion");
		for(int i = 0; i < result.length; i++) {
		System.out.print(result[i] + ", ");
		}
		System.out.println();
	}
	
	public int forRecussion(int i)	{
    	if (i == result.length)	
    		return i;
    	else 
    		System.out.print(result[i] + ", ");
    		return forRecussion(i + 1);
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
