package com.shawnclake.ui;

import com.shawnclake.auth.Auth;
import com.shawnclake.auth.User;
import com.shawnclake.FitBit.FitBitManager;
import com.shawnclake.graph.Graph;
import com.shawnclake.graph.DrawGraph;

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
		
		String choice; // will be used to take in the user inputs throughout the program
		
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
			choice = in.nextLine();
			choice = choice.toLowerCase();
			if(choice.equals("reminder")){
				//reminder class
				
			}
			
			//fitbit class
			
			//graph class
			
			
			in.close();
		}
		
	}

}





