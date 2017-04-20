package csvReader;

import java.text.DecimalFormat;
import java.util.*;
import java.io.*;

//import org.junit.*;

public class CSVReader {
	
	private static DecimalFormat decimalPlaces = new DecimalFormat("##.##");  //THIS SETS THE NUMBER OF PLACES TO THE RIGHT OF THE DECIMAL POINT.
	private int numRows;  //???????????????????????? IS THIS BEING USED??????? 
	
	//these are fields because they are variables of the class not methods
	private int numColumns;
	private int startingYear;
	private int countryIndex = 1; //???????????????? HOW IS THIS BEING USED????????
	private int firstYear;
	private int lastYear;
	private String[][] anArray;   //CHANGED THE ARRAY FROM OBJECT TO STRING. CONVERT THE STRINGS TO INTEGERS
	
	protected String filename;
	String[] resultArray;
	
	CSVReader(String filename)	{    //class constructor takes outside file as input
		this.filename = filename;
		System.out.println("This is just the path statement: " + filename + "\n");
	}

	//************************************************************************

	public void importFile() 	{
	 
	    File file = new File(filename);  //note the double backslashes for windows
	 
//	    String[]result = null;
	    
	    
	    int numRows = 0;
	    try {

	        Scanner scanIn = new Scanner(file);

	       while (scanIn.hasNextLine()) {
	      
	       for(int x =0; x <= 5; x++)	{                                    //this allows me to see the output at each set of the loop
	           String str = scanIn.nextLine();                                   //this stores one line of the input file.
	          
	           String[] resultArray = str.split(",");                        //SO THIS STORES THE SPLIT INPUT LINE
	           for(int i = 0; i <= resultArray.length - 1; i++)    {
	               System.out.print(resultArray[i] + "\t");  
	            }
	            System.out.println();
	            
//	            result = resultArray;                                        
	       }  //end of for loop 
	            
	       }  //end of while  **********************************************
	        scanIn.close();
	        
	    } //end of try
	    catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }//end of catch
	    

	    System.out.println("\n");
	}  //end of importFile() 
//*************************************************************************	
	
/*	public String[] getCountryNames()	{    //String [] countryNames = parser.getCountryNames(); 
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
	} */
}
