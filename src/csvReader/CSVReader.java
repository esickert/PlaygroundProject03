package csvReader;

import java.util.*;
import java.io.*;

public class CSVReader	{
	
	protected String filename;
	public static final String HI = "hello"; //NOTE that i can add the constant here but not under main(). main() is a method not a class.
	
	
	CSVReader(String filename)	{
		this.filename = filename;
	}
	
	public String[] getCountryNames()	{
		String[] temp = {"0"};
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
