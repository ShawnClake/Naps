package com.shawnclake.FitBit

import com.shawnclake.io.FileInput;

import java.security.MessageDigest;

import java.util.List;

/**
 * 
 * @author Sam
 * 
 * Receivies requests from the graph functions and returns data to be plotted
 * Also initiaties requests to the fitbit to begin logging sleep
 * 
 * 
 *
 */

public class FitBitManager {

	Scanner in = new Scanner(System.in);
						
		      try {

					Scanner fileIn = new Scanner(Paths.get("FakeEmployee.csv"));

					while (fileIn.hasNextLine()) {
						
						String line = fileIn.nextLine();
						String[] data = line.split(",");
						
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


