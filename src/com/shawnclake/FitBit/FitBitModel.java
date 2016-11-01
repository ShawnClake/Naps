package com.shawnclake.FitBit

import com.shawnclake.io.FileInput;

import java.security.MessageDigest;

import java.util.List;

/**
 * 
 * @author Sam Dietrch
 * 
 * Currently the model is represented as a .csv file which has the following attributes shown below with sample values:
 *
     "sleep": [
        {
            "isMainSleep":true,
            "logId":29744,
            "efficiency":98,
            "startTime":"2011-06-16T00:00:00.000",
            "duration":28800000,
            "minutesToFallAsleep":0,
            "minutesAsleep":480,
            "minutesAwake":0,
            "minutesAfterWakeup":0,
            "awakeningsCount":0, // deprecated
            "awakeCount":0,
            "awakeDuration":0,
            "restlessCount":0,
            "restlessDuration":0,
            "timeInBed":480
            "minuteData":[
                {
                    "dateTime":"00:00:00",
                    "value":"3"
                },
                {
                    "dateTime":"00:01:00",
                    "value":"2"
                },
                {
                    "dateTime":"00:02:00",
                    "value":"1"
                },
                &amp;lt;...&amp;gt;
        },   
 *
 *In the future these values will be accessed following standard fitbit sleep log protocol as:
 *
 GET https://api.fitbit.com/1/user/[user-id]/sleep/date/[date].json

user-id	The ID of the user. Use "-" (dash) for current logged-in user.
date	The date of records to be returned. In the format yyyy-MM-dd.
 *
 *
 *
 *
 *
 *
 */

public class FitBitModel {

	Scanner in = new Scanner(System.in);
						
		      try {

					Scanner fileIn = new Scanner(Paths.get("fakeData.csv"));

					while (fileIn.hasNextLine()) {
						
						String line = fileIn.nextLine();
						String[] data = line.split(",");
						
						String firstName = data[0];
						
						String lastName = data[1];
						
						String address = data[2];
						
						String phoneNumber = data[3];
						
						String hireDate = data[4];
			
						Double salary = Double.parseDouble(data[5]); //casting is explictly used here as it is necessary
						
						"isMainSleep":true,
			            "logId":29744,
			            "efficiency":98,
			            "startTime":"2011-06-16T00:00:00.000",
			            "duration":28800000,
			            "minutesToFallAsleep":0,
			            "minutesAsleep":480,
			            "minutesAwake":0,
			            "minutesAfterWakeup":0,
			            "awakeningsCount":0, // deprecated
			            "awakeCount":0,
			            "awakeDuration":0,
			            "restlessCount":0,
			            "restlessDuration":0,
			            "timeInBed":480
			            "minuteData"
						
						
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


