package com.shawnclake.FitBit;

import com.shawnclake.io.FileInput;

import java.io.IOException;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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

	public FitBitVariableTemplate[] getData(FitBitVariable fbv, Date[] dateRange) {

		switch(fbv) {
		
		case sleepDate:
		FitBitVariableTemplate[].set(Date);	
		case isMainSleep:
			
		case logId: 
			
		case efficiency:
			
		case startTime:
			
		case duration:
			
		case minutesToFallAsleep:
			
		case minutesAsleep:
			
		case minutesAwake:
			
		case minutesAfterWakeup:
			
		case AwakeningsCount:
			
		case awakeCount:
			
		case awakeDuration: 
			
		case restlessCount:
			
		case restlessDuration:
			
		case timeInBed:
			
		case minuteDataDate:
			
		case minuteDataValue:
	
		
		
		}
		
		
		
	Scanner in = new Scanner(System.in);
	List<FitBitData> FBDList = new ArrayList<FitBitData>();	
	
		      try {

					Scanner fileIn = new Scanner(Paths.get("FakeEmployee.csv"));

					while (fileIn.hasNextLine()) {
						
						String line = fileIn.nextLine();
						String[] data = line.split(",");
						
						switch(fbv) {
						
						case sleepDate:
							 data[0];
						case isMainSleep:
							
						case logId: 
							
						case efficiency:
							
						case startTime:
							
						case duration:
							
						case minutesToFallAsleep:
							
						case minutesAsleep:
							
						case minutesAwake:
							
						case minutesAfterWakeup:
							
						case AwakeningsCount:
							
						case awakeCount:
							
						case awakeDuration: 
							
						case restlessCount:
							
						case restlessDuration:
							
						case timeInBed:
							
						case minuteDataDate:
							
						case minuteDataValue:
					
						
						
						}
						String firstName = data[0];
						
						String lastName = data[1];
						
						String address = data[2];
						
						String phoneNumber = data[3];
						
						String hireDate = data[4];
			
						Double salary = Double.parseDouble(data[5]); //casting is explictly used here as it is necessary
						
						
						
						
						
					   Employee dummyEmployee = new Employee(firstName, lastName, address, phoneNumber, hireDate, salary);
					   
						EmployeeList.add(dummyEmployee);
					   												
					}
					fileIn.close();
					System.out.println("File data stored.");
					System.out.println("Please select one of the original 3 options from the main menu: Manual, Auto or List.");
					System.out.println("Or enter END to exit the employee database.");
					
					
				}
				 
				catch (IOException e) {
					e.printStackTrace();
				}
}
}

