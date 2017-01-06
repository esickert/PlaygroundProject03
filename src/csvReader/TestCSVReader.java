package csvReader;
/**
 *  Tests the CSVReader class, which reads input from a CSV file. Uses
 *  the attributes stored in CSVReader object to fill the CellularData class.
 *
 * @author Foothill College, [YOUR NAME HERE]
 */
public class TestCSVReader
{
	/**
	 * Uses a CSVReader to parse a CSV file.
	 * Adds each parsed line to an instance of the CellularData class.
	 */
	public static void main(String[] args) 
	{	
		// NOTE: Make sure to use relative path instead of specifying the entire path 
		// (such as /Users/alicew/myworkspace/so_on_and_so_forth).
//		final String FILENAME = "resources/cellular.csv";	// Directory path for Mac OS X
//		final String FILENAME = "resources\\cellular.csv";	// Directory path for Windows OS (i.e. Operating System) ISSUE WITH BACKWARD SLASH IN STRINGS.
		final String FILENAME = "resources\\cellular_short_oneDecade.csv";             //MYSTUFF
		// TODO: Create the class CSVReader to parse the CSV data file
		//       The class constructor should only take a string as argument
		//       for the name of the input file.
		//       The constructor should fill the array of country names, year labels, etc.
		// NOTE: Handle all exceptions in the constructor.
		//       For full credit, do *not* throw exceptions to main. 
		CSVReader parser = new CSVReader(FILENAME);   //PARSER IS AN INSTANCE OF class CVSREADER!!!!!!!!!!!!!!!!!!!!!!!!
		parser.importFile();  //MYSTUFF***************************************************************
		parser.printArray();  //MYSTUFF***************************************************************

		// TODO: In class CSVReader the accessor methods should only return values
		//       at(of) instance variables.
		String [] countryNames = parser.getCountryNames();    //parser is an instance of class CVSReader
		System.out.println("\nThis is just testing ... got the external file inside the app " + countryNames[0]);                            //MYSTUFF - delete when finished
		int [] yearLabels = parser.getYearLabels();
		double [][] parsedTable = parser.getParsedTable();		

		// Stores the 2D array of cellular data for all countries.
		CellularData datatable;
		int numRows = parsedTable.length;
		int numColumns = parser.getNumberOfYears();
		int startingYear = yearLabels[0];  //NOTE THIS IS A SINGLE ARRAY.

		datatable = new CellularData(numRows, numColumns, startingYear);

		// From the array that stores parsed information,
		// add one country at a time to an object of type CellularData.
		for (int countryIndex = 0; countryIndex < countryNames.length-1; countryIndex++)	//ADDED -1 TO COUNTRYNAMES.LENGTH
		{
			double [] countryData = parsedTable[countryIndex];
			datatable.addCountry(countryNames[countryIndex], countryData);
			
		}  


//		System.out.printf(countryNames[14] + " (1960 to 2014): %.2f \n", datatable.getNumSubscriptionsInCountryForPeriod(countryNames[0],1960,2014));  //14 is an index!!!!!!!!!!!!!!
		// the output is: 
		// Bahamas, The (1960 to 2014): 420.07

//		System.out.printf(countryNames[100] + " (1950 to 2000): %.2f \n", datatable.getNumSubscriptionsInCountryForPeriod(countryNames[100],1950,2000));   //100 is an index
		// the output is: 
		// ERROR : requested year 1950  is less than 1960
		// Hong Kong SAR, China (1950 to 2000): -1.00 

//		System.out.printf(countryNames[251] + " (1980 to 2014): %.2f \n", datatable.getNumSubscriptionsInCountryForPeriod(countryNames[200],1980,2014));  //251 is an index
		// the output is: 
		// United States (1980 to 2014): 296.41


        // TODO: For full credit, include test cases in addition to those provided.
		//
		// TODO: Also, make sure to test for other invalid requests for range of years.
		
		
		System.out.println("\nDone with TestCSVReader.\n");
	}
}
