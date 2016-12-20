package csvReader;

public class CSVReader	{
	
	protected String filename;
	
	
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
