package com.shawnclake.FitBit;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
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

public class FitBitManager<E> {

	@SuppressWarnings("unchecked")
	public E[] getData(FitBitVariable fbv, Date[] dateRange, Class<E> clazz) {
		
		/**create a generic array**/
	    @SuppressWarnings("unchecked")
	    E[] arr = (E[]) Array.newInstance(clazz, 1000);	
	    
	Scanner in = new Scanner(System.in);
	int i = 0;
	DateFormat lDF = DateFormat.getDateInstance(DateFormat.LONG);
	DateFormat sDF = DateFormat.getDateInstance(DateFormat.SHORT);
	
	
	
	Date startDate = dateRange[0];
	Date endDate = dateRange[1];
	Date compareDate = null;
	
	try {
		Scanner fileIn = new Scanner(Paths.get("FakeData.csv"));

		 
		 while (fileIn.hasNextLine()) {
				String line = fileIn.nextLine();
				String[] data = line.split(",");
				
				try {
					compareDate = lDF.parse(data[0]);
				} catch (ParseException e) {
					e.printStackTrace();
				}
				
				if (startDate.compareTo(compareDate)==0)	//
				{

					
					while ((endDate.compareTo(compareDate)!=0)&&(fileIn.hasNextLine()))
					{
						
						switch(fbv){
						case sleepDate:
							arr[i] = (E) (data[0]);
						case isMainSleep:
							arr[i] = (E) (data[1]);;
						case logId: 
							arr[i] = (E) (data[2]);
						case efficiency:
							arr[i] = (E) (data[3]);
						case startTime:
							arr[i] = (E) (data[4]);
						case duration:
							arr[i] = (E) (data[5]);
						case minutesToFallAsleep:
							arr[i] = (E) (data[6]);
						case minutesAsleep:
							arr[i] = (E) (data[7]);
						case minutesAwake:
							arr[i] = (E) (data[8]);
						case minutesAfterWakeup:
							arr[i] = (E) (data[9]);
						case AwakeningsCount:
							arr[i] = (E) (data[10]);
						case awakeCount:
							arr[i] = (E) (data[11]);
						case awakeDuration: 
							arr[i] = (E) (data[12]);
						case restlessCount:
							arr[i] = (E) (data[13]);
						case restlessDuration:
							arr[i] = (E) (data[14]);
						case timeInBed:
							arr[i] = (E) (data[15]);
						case minuteDataDate:
							arr[i] = (E) (data[16]);
						case minuteDataValue:
							arr[i] = (E) (data[17]);
						}
						i++;
						line = fileIn.nextLine();
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

