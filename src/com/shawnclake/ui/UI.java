package com.shawnclake.ui;

import com.shawnclake.auth.Auth;
import com.shawnclake.auth.User;
import com.shawnclake.FitBit.FitBitManager;
import com.shawnclake.FitBit.FitBitVariable;
import com.shawnclake.graph.Graph;
import com.shawnclake.graph.DrawGraph;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/*******************************************************************************
 * ENSE 374 Project - Naps
 * 
 * Scrum cycle 1
 * 
 * Description: Our team is building an app that helps the users take control of
 * 	their sleep cycle. They start by creating an account to save all their settings
 * 	and data to, as well as personalize their experience. This app allows the users
 *  to integrate their fitbit into the app and actually monitor their quality of 
 *  sleep. This data is saved to their account and the user can view this data in
 *  a graph. It also allows the user to set bedtime reminders as well as personalized
 *  wake up alarms. Other features will be added as the project progresses.
 * 
 * Team Members: Shawn Clake, Uys Kriek, Sam Dietrich, Jennifer Herasymuik
 * 
 * Date: October 31st, 2016
 * Author: Jennifer Herasymuik
 * ******************************************************************************/
public class UI {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String choice = null; // will be used to take in the user inputs throughout the program
		/*
		///////////////////////////////////Login Screen/////////////////////////////////////
		//sign in or register here
		//this calls the auth classes
		System.out.println("Welcome to NAPS by SSUJ...");
		System.out.println("Would you like to login or register for a new account?");
		choice = in.nextLine();
		choice = choice.toLowerCase();
		
		//create the current sessions user
		User current;
		Auth authorize = new Auth();
		
		if(choice.equals("login")){
			boolean valid = true;
			do{
			//get users username and password
			System.out.println("LOGIN");
			System.out.print("Username: ");
			String userName = in.nextLine();
			System.out.print("Password: ");
			String pass = in.nextLine();
			
			current = authorize.login(userName, pass);
			
			//check if valid user
			if(current.getUsername().equals("")){
				System.out.println("Login was incorrect.");
				System.out.println("Would you like to try again, or continue as guest?");
				System.out.println("Please enter either 'try again' or 'continue'");
				String continueGuest = in.nextLine();
				continueGuest = continueGuest.toLowerCase();
				if (continueGuest.equals("continue")){
					valid = false;
					break;
				}
				else{
					//retry
					valid = false;
				}
			}
			}while(!valid);
			
		}
		if (choice.equals("register")){
			//get user information the call register function (username email password);
			System.out.println("REGISTER");
			System.out.print("Please enter a username: ");
			String username = in.nextLine();
			System.out.print("Please enter a password: ");
			String password = in.nextLine();
			System.out.print("Please verify password: ");
			String passwordCheck = in.nextLine();
			while (!(password.equals(passwordCheck))){
				System.out.println("Passwords do not match. Please re-enter password.");
				System.out.print("Please enter password: ");
				password = in.nextLine();
				System.out.print("Verify password: ");
				passwordCheck = in.nextLine();
			}
			System.out.print("Enter an e-mail address: ");
			String email = in.nextLine();
			
			current = authorize.register(username, password, email);
			//new user has been registered and is the current session user
		}*/
		
		
		////////////////MAIN PROGRAM///////////////////////////////////////////////////////
		///////Loop runs for the duration of the program
		///////It will allow the user to use the reminders, fitbit, and displaying results
		while(choice != "quit"){
			System.out.println("NAPS");
			System.out.println("Select one of the following features:");
			//list features
			System.out.println("reminder - Set reminders here.");
			System.out.println("data - View your sleep data here.");
			System.out.println("quit - quit the program.");
			//include option to logout here if not a guest?????
			choice = in.nextLine();
			choice = choice.toLowerCase();
			if(choice.equals("reminder")){
				//reminder class
				
			}
			//fitbit class
			//graph class
			else if(choice.equals("data")){
				/*some of the code below is written by Sam not Jen if you have questions ask both of them*/
				System.out.println("Several different metrics can be viewed for your data, they include:");
				System.out.println("1. 'efficiency' - Amount of time asleep while in bed");
				System.out.println("2. 'startTime' - Start time of sleep cycle");
				System.out.println("3. 'minutesToFallAsleep' - Amount of time to fall asleep");
				System.out.println("4. 'minutesAsleep' - Amount of time asleep while in bed");
				System.out.println("5. 'minutesAwake' - Amount of time awake while in bed");
				System.out.println("6. 'minutesAfterWakeup' - Amount of time in bed after waking up");
				System.out.println("7. 'awakeCount' - Number of times woken up during sleep");
				System.out.println("8. 'awakeDuration' - Total time of all awake events");
				System.out.println("9. 'restlessCount' - Number of times restless sleep expierenced");
				System.out.println("10. 'restlessDuration' - Total time of all restless events");
				System.out.println("11. 'timeInBed' - Amount of time spent in bed.");
				
				System.out.println("Please enter the list number for the metric you wish to view: ");

		        int metricChoice = in.nextInt();

				System.out.println("You view data from any period within: 2/5/2014 to 10/31/2016 ");
				System.out.println("Please enter the Start Date in DD/MM/YYYY format:");
				in.nextLine();
				String stringDate = in.nextLine();
				Date[] dateRange = new Date[2];
				
				DateFormat df = new SimpleDateFormat("d/M/yyyy");
				
				//Due to casting a try/catch statement must be used
				try {
					dateRange[0] = df.parse(stringDate);
					System.out.println("Please enter the End Date in DD/MM/YYYY format:");
					stringDate = in.nextLine();
					dateRange[1] = df.parse(stringDate);
	            	FitBitManager<Integer> fbmInt = new FitBitManager<Integer>();
	            	FitBitManager<Date> fbmDate = new FitBitManager<Date>();
	            	

	            	Graph currentGraph;
					//Future task for Sam/Jen is to break UI into at least two files where the fitbit UI functionality can be seperated out and templated
			        switch (metricChoice) {
		            case 1:	      
		            	Integer[] graphArray1 = fbmInt.getData(FitBitVariable.efficiency, dateRange, int.class);
		            	break;
		            case 2:
		            	Date[] graphArray2 = fbmDate.getData(FitBitVariable.startTime, dateRange, Date.class);
		                break;
		            case 3:
		            	Integer[] graphArray3 = fbmInt.getData(FitBitVariable.minutesToFallAsleep, dateRange, int.class);
		                break;
		            case 4:
		            	Integer[] graphArray4 = fbmInt.getData(FitBitVariable.minutesAsleep, dateRange, int.class);		         
		                break;
		            case 5:
		            	Integer[] graphArray5 = fbmInt.getData(FitBitVariable.minutesAwake, dateRange, int.class);		      
		                break;
		            case 6:
		            	Integer[] graphArray6 = fbmInt.getData(FitBitVariable.minutesAfterWakeup, dateRange, int.class);		            	
		                break;
		            case 7:
		            	Integer[] graphArray7 = fbmInt.getData(FitBitVariable.awakeCount, dateRange, int.class);
		                break;
		            case 8:
		            	Integer[] graphArray8 = fbmInt.getData(FitBitVariable.awakeDuration, dateRange, int.class);
		                break;    
		            case 9:
		            	Integer[] graphArray9 = fbmInt.getData(FitBitVariable.restlessCount, dateRange, int.class);
		                break;   
		            case 10:
		            	Integer[] graphArray10 = fbmInt.getData(FitBitVariable.restlessDuration, dateRange, int.class);
		                break;    
		            case 11:
		            	Integer[] graphArray11 = fbmInt.getData(FitBitVariable.timeInBed, dateRange, int.class);         	
		                break;        
		        }

			        //set the xlabels
			        //set ylabels
					
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        

				
				
			}
			else if(choice.equals("quit")){
				System.out.println("Thank you for using NAPS.");
				System.out.println("Quitting...");
			}
			else{
				System.out.println("Not a valid choice");
				System.out.println("Please select either reminder, data, or quit...");
			}
			
			
			
		}
		in.close();
		
	}

}





