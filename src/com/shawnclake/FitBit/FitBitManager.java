package com.shawnclake.FitBit;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 
 * @author Sam
 * 
 * Receivies requests from the graph functions and returns data to be plotted
 * Also initiaties requests to the fitbit to begin logging sleep
 * 
 *still in progress at 3:25pm 
 *going to be made to return a generic form like:
 *https://www.tutorialspoint.com/java/java_generics.htm
 *
 *
 */

public class FitBitManager {

	@SuppressWarnings("unchecked")
	public static int[] getData(FitBitVariable fbv, Date startDate, Date endDate) {
		
	    //will be changed in version 2.0 to be sized based on date range
	    int[] arr = new int [1000];
	    
	Scanner in = new Scanner(System.in);
	int i = 0;
	DateFormat lDF = new SimpleDateFormat("dd/mm/yyyy");
	DateFormat sDF = DateFormat.getDateInstance(DateFormat.SHORT);
	
	Date compareDate = null;
	
	try {
		//Scanner fileIn = new Scanner(Paths.get("fakeData.csv"));
        Scanner filein = new Scanner(new File("fakeData.csv"));
        filein.useDelimiter(",");
		String line = filein.nextLine(); //must skip first line

        
        while(filein.hasNext()) {
				line = filein.nextLine();

				String[] data = line.split(",");
				
				try {
					compareDate = lDF.parse(data[0]);
				} catch (ParseException e) {
					e.printStackTrace();
				}
				
				if (startDate.compareTo(compareDate)==0)	//
				{

					
					while ((endDate.compareTo(compareDate)!=0)&&(filein.hasNext()))
					{
						
						switch(fbv){
						case efficiency:
							arr[i] = Integer.parseInt(data[3]);
							break;
						case startTime:
							arr[i] = Integer.parseInt(data[4]);
							break;

						case duration:
							arr[i] = Integer.parseInt(data[5]);
							break;

						case minutesToFallAsleep:
							arr[i] = Integer.parseInt(data[6]);
							break;

						case minutesAsleep:
							arr[i] = Integer.parseInt(data[7]);
							break;

						case minutesAwake:
							arr[i] = Integer.parseInt(data[8]);
							break;

						case minutesAfterWakeup:
							arr[i] = Integer.parseInt(data[9]);
							break;

						case AwakeningsCount:
							arr[i] = Integer.parseInt(data[10]);
							break;

						case awakeCount:
							arr[i] = Integer.parseInt(data[11]);
							break;

						case awakeDuration: 
							arr[i] = Integer.parseInt(data[12]);
							break;

						case restlessCount:
							arr[i] = Integer.parseInt(data[13]);
							break;

						case restlessDuration:
							arr[i] = Integer.parseInt(data[14]);
							break;

						case timeInBed:
							arr[i] = Integer.parseInt(data[15]);
							break;

						}
						i++;
						line = filein.nextLine();
						data = line.split(",");
						
						try {
							compareDate = lDF.parse(data[0]);
						} catch (ParseException e) {
							e.printStackTrace();
						}
						
					}
				}
			}
	}
	catch (IOException e) {
		e.printStackTrace();
	}
	return arr;
	}
}

