package ui;

import auth.Auth;
import auth.User;
import FitBit.FitBitManager;
import FitBit.FitBitVariable;
import graph.Graph;
import graph.DrawGraph;
import remind.Reminders;
import remind.reminderUI;

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
		}
		
		
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
				Reminders globalReminders = new Reminders();
				reminderUI uii = new reminderUI();
				uii.UI(globalReminders);
				
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
				DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
				
				//Due to casting a try/catch statement must be used
				try {
					Date startDate = df.parse(stringDate);
					System.out.println("Please enter the End Date in DD/MM/YYYY format:");
					stringDate = in.nextLine();
					Date endDate = df.parse(stringDate);

					FitBitManager fbm = null;
	            	int[] graphArray;

	            	Graph currentGraph = new Graph();
	            	String yvals[] = {"0", "0"};
					//Future task for Sam/Jen is to break UI into at least two files where the fitbit UI functionality can be seperated out and templated
			    switch(metricChoice){   
					case 1:	      
		              	graphArray = FitBitManager.getData(FitBitVariable.efficiency, startDate, endDate);

						yvals[0] = "0";
		            	yvals[1] = "100";
		            	currentGraph.fitbitSet(graphArray);
		            	break;
		            case 2:
						System.out.println("Start Time is not currently available. It will be in Naps 2.0");

		            	//Date[] graphArray2 = fbmDate.getData(FitBitVariable.startTime, dateRange, Date.class);
		                break;
		            case 3:
		              	graphArray = fbm.getData(FitBitVariable.minutesToFallAsleep, startDate, endDate);

		            	yvals[0] = "0";
		            	yvals[1] = "200";
		            	currentGraph.fitbitSet(graphArray);
		            	break;
		            case 4:
		              	graphArray = fbm.getData(FitBitVariable.minutesAsleep, startDate, endDate);

		            	yvals[0] = "0";
		            	yvals[1] = "2000";
		            	currentGraph.fitbitSet(graphArray);
		            	break;
		            case 5:
		              	graphArray = fbm.getData(FitBitVariable.minutesAwake, startDate, endDate);

		            	yvals[0] = "0";
		            	yvals[1] = "2000";
		            	currentGraph.fitbitSet(graphArray);
		                break;
		            case 6:
		              	graphArray = fbm.getData(FitBitVariable.minutesAfterWakeup, startDate, endDate);

		            	yvals[0] = "0";
		            	yvals[1] = "200";
		            	currentGraph.fitbitSet(graphArray);
		            	break;
		            case 7:
		              	graphArray = fbm.getData(FitBitVariable.awakeCount, startDate, endDate);

		            	yvals[0] = "0";
		            	yvals[1] = "200";
		            	currentGraph.fitbitSet(graphArray);
		            	break;
		            case 8:
		              	graphArray = fbm.getData(FitBitVariable.awakeDuration, startDate, endDate);

		            	yvals[0] = "0";
		            	yvals[1] = "200";
		            	currentGraph.fitbitSet(graphArray);
		            	break;    
		            case 9:
		              	graphArray = fbm.getData(FitBitVariable.restlessCount, startDate, endDate);

		            	yvals[0] = "0";
		            	yvals[1] = "200";
		            	currentGraph.fitbitSet(graphArray);
		            	break;   
		            case 10:
		              	graphArray = fbm.getData(FitBitVariable.restlessDuration, startDate, endDate);

		            	yvals[0] = "0";
		            	yvals[1] = "200";
		            	currentGraph.fitbitSet(graphArray);
		            	break;    
		            case 11:
		              	graphArray = fbm.getData(FitBitVariable.timeInBed, startDate, endDate);

		            	yvals[0] = "0";
		            	yvals[1] = "2000";
		            	currentGraph.fitbitSet(graphArray);
		            	break;        
		        }

			       //set the xlabels
			        currentGraph.setXLabels(dateRange);
			        //set ylabels
			        currentGraph.setYLabels(yvals);
					
			        //greate draw graph variable
			        DrawGraph draw = new DrawGraph();
			        //set draw graph
			        draw.setGraph(currentGraph);
			        //draw graph
			        draw.drawGraph();
			        
					
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
			
			globalReminders.check();//checks the time
			
		}
		in.close();
		
	}

}





