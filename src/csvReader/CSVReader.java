package csvReader;

import java.util.*;
import java.io.*;

public class CSVReader	{
	
	protected String filename;
	String[][] result;
	
	CSVReader(String filename)	{
		this.filename = filename;
		System.out.println("This is just the path statement: " + filename + "\n");
	}
	
	//************************************************************************
	public void importFile() { 
	 
//	    final String ADDRESS = "c:\\Temp\\ReadFromFileStuff\\cellular_short_oneDecade.csv";
	    File file = new File(filename);  //note the double backslashes for windows
	 
	    String[] result = null;
	    
//	    AndMore.printMe();  //passing of a static method
	    
	    try {

	        Scanner sc = new Scanner(file);

	       while (sc.hasNextLine()) {

	           String str = sc.nextLine(); //this stores one line of input, then prints it.

	           String[] resultArray = str.split(",");
	           for(int i = 0; i <= resultArray.length - 1; i++)    {
	               System.out.print(resultArray[i] + " ");  //It's the fucking input causing the errors!!
	            }
	            System.out.println();
	            result = resultArray;
	        }  //end of while
	        sc.close();
	        
	    } //end of try
	    catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }//end of catch
	    for(int i = 0; i <= result.length - 1; i++)    {
	        System.out.print(result[i] + " ");
	    }
//	    forRecussion(0);  this is throwing a null pointer exception. Final return type incorrect??
	    System.out.println("This is result index 4" + result[4]);
	}
//*************************************************************************	
	public String[] forRecussion(int i)	{
    	if (i == result.length-1)	
    		return result[i];
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
