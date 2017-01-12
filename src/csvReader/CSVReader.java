package csvReader;

import java.util.*;
import java.io.*;

public class CSVReader	{
	
	protected String filename;
	String[] resultArray;
	
	CSVReader(String filename)	{    //class constructor takes outside file as input
		this.filename = filename;
		System.out.println("This is just the path statement: " + filename + "\n");
	}
	
	//************************************************************************
	public void importFile() { 
	 
	    File file = new File(filename);  //note the double backslashes for windows
	 
	    String[] result = null;
	    
	    try {

	        Scanner sc = new Scanner(file);

//	       while (sc.hasNextLine()) {
	       for(int x = 0; x <= 1; x++)	{              //this allows me to see the output at each set of the loop
	           String str = sc.nextLine(); //this stores one line of the input file.

	           String[] resultArray = str.split(",");  //SO THIS STORES THE SPLIT INPUT LINE!!!!!!!!!!1
	           for(int i = 0; i <= resultArray.length - 1; i++)    {
	               System.out.print(resultArray[i] + " ");  
	            }
	            System.out.println();
	            result = resultArray;  //i think there is alot of redundancy here. this is in the while loop. THIS IS FUCKED UP!!!!!!!!!!!!!!!!!!!!!!
	        }  //end of while  **********************************************
	        sc.close();
	        
	    } //end of try
	    catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }//end of catch
	    System.out.println("\nThis is testing the array....Germany is the last loaded...it over writes previous");
	    for(int i = 0; i <= result.length - 1; i++)    {
	        System.out.print(result[i] + " ");
	    }
	    System.out.println();

//	    System.out.println("\nThis is the result of index 4: " + resultArray[4] + " of the country " + resultArray[0]);  //THIS THROWS A NULL POINTER EXCEPTION. I THINK THE ARRAY IS OUT OF BOUNDS.
	}
//*************************************************************************	
	
	public String[] getCountryNames()	{    //String [] countryNames = parser.getCountryNames(); 
		String[] CountryName = {"England"};
		return 	CountryName;
	}
	
	public int[] getYearLabels()	{
		int[] yearLabels = {0};
		return yearLabels;		
	}
	
	public double[][] getParsedTable()	{
		double[][] temp = {{0.0,0.0},{0.0,0.0}};
		return temp;		
	}
	
	public int getNumberOfYears()	{
		int years = 0;
		return years;
	}
}
