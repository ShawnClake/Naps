package com.shawnclake.remind;
import com.shawnclake.auth.Auth;
import com.shawnclake.auth.User;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;



public class reminderUI			
	{

	public static void UI(Reminders listOfReminders)
	{
		
	
		String witticisms = "You almost had it there, champ.";
		int choice;
		
		Scanner in = new Scanner(System.in);
		
		
		boolean exit = false;
		while(!exit)
		{
			System.out.println("Welcome to reminders. You have 5 options to choose from:");
		
			System.out.println("Show current reminders.                  1");
			System.out.println("Add a reminder.                          2");
			System.out.println("Delete a reminder.                       3");
			System.out.println("Manage Group settings                    4");
			System.out.println("Go back.                                 5");
		
			choice = in.nextInt();
			
			while(choice < 1 || choice > 5)
			{
				System.out.println("Incorrect selection.");
				System.out.println("Please chose either 1, 2, 3, 4, or 5: ");
				choice = in.nextInt();
			}
		
		switch(choice)
		{
			case 1:
				
				if(listOfReminders.getCount() == 0)
				{
					System.out.println("There are currently no reminders to display.");
					continue;
				}
				
				System.out.println("Here are the current reminders:");
				listOfReminders.printReminders();		
			
			
				continue;
			
			case 2:
				
				Date myDate = new Date();
				Calendar cal = Calendar.getInstance();
				
				Remind addedRemind;
				
				System.out.println("Please enter the name of the reminder:");
				String entry1 = in.next();
				
				System.out.println("Please enter the description of the reminder:");
				String entry2 = in.next();
				
				System.out.println("Please enter the year of the reminder (Ex. 2016):");
				int entry3 = in.nextInt();
				
				System.out.println("Please enter the month of the reminder (Ex. 10 = October):");
				int entry4 = in.nextInt();
				
				System.out.println("Please enter the day of the reminder:");
				int entry5 = in.nextInt();
				
				System.out.println("Please enter the hour of the reminder (Ex. 13 = 1 PM):");
				int entry6 = in.nextInt();
				
				System.out.println("Please enter the minute of the reminder:");
				int entry7 = in.nextInt();
				
				System.out.println("Please enter the type of alarm (:");
				System.out.println("Enter 1 for VIBRATION");
				System.out.println("Enter 2 for SOUND");
				System.out.println("Enter 3 for VIBRATION + SOUND");
				
				int entry8 = in.nextInt();
				
				while(entry8 < 1 && entry8 > 3)
				{
					System.out.println("Invalid entry.");
					System.out.println("Enter a number from 1 - 3");
					entry8 = in.nextInt();
				}
				
				type cType = type.VIBRATION;
				
				switch(entry8)
				{
				case 1: cType = type.VIBRATION;
						break;
				
				case 2: cType = type.SOUND;
						break;
				
				case 3: cType = type.SOUND_VIBRATION;
						break;
				
				
				}
				
				cal.set(entry3, entry4 - 1, entry5, entry6, entry7, 0);
				myDate = cal.getTime();
				
				
				Reminder addedReminder = new Reminder(entry1, myDate, entry2);
				addedRemind = new Remind(cType, addedReminder);
				
				
				listOfReminders.addReminder(addedRemind);
				listOfReminders.printReminders();		
				
				continue;
			
			case 3:
			
				if(listOfReminders.getCount() == 0)
				{
					System.out.println("There are currently no reminders to display.");
					continue;
				}
				
				
				listOfReminders.printReminders();
				
				System.out.println("");
				System.out.println("Which reminder would you like to delete?");
				
				choice = in.nextInt();
				
				if(choice < 1 || choice > listOfReminders.getCount())
				{
					System.out.println("Invalid choice. Returning to reminder menu.");
					continue;
				}
				
				System.out.println("Now removing Reminder " + choice);
				listOfReminders.removeReminder(choice - 1);
				
				continue;
			
			case 4:
				
				boolean exitGroup = false;
				while(!exitGroup)
				{
					System.out.println("Welcome to Group Settings. You have 4 options to choose from:");
				
					System.out.println("Add user to a group                           1");
					System.out.println("Delete user from a group                      2");
					System.out.println("Add group reminder                            3");
					System.out.println("Go back to previous reminder menu             4");
				
					int groupchoice = in.nextInt();
					
					while(groupchoice < 1 || groupchoice > 4)
					{
						System.out.println("Incorrect selection.");
						System.out.println("Please chose either 1, 2, 3, or 4: ");
						groupchoice = in.nextInt();
					}
				ReminderManager rManage = new ReminderManager();
				switch(groupchoice)
				{
					case 1: //add user to group
						//take input for username, only one group used in this demo and it is set in reminderManager
						System.out.println("Enter the username of the user you would like to add (case sensitive):");
						String addUserName = in.next();
						User addingUser = new User();
						Auth authorize = new Auth();
						addingUser = authorize.isUser(addUserName);
						if(addingUser == null){
							System.out.println("User does not exist.");
						}
						else{
							rManage.addAuthorized(addingUser);
						}
						continue;
					case 2: //delete user from a group
						//take input for username  only one group used in this demo and it is set in reminderManager
						System.out.println("Enter the username of the user you would like to delete (case sensitive):");
						String delUserName = in.next();
						User deletingUser = new User();
						Auth dauthorize = new Auth();
						deletingUser = dauthorize.isUser(delUserName);
						if(deletingUser == null){
							System.out.println("User does not exist.");
						}
						else{
							rManage.removeAuthorized(deletingUser);
						}
						
						continue;
					case 3: //add group reminder
						
						Date groupmyDate = new Date();
						Calendar groupcal = Calendar.getInstance();
						
						Remind groupaddedRemind;
						
						System.out.println("Please enter the name of the reminder:");
						String groupentry1 = in.next();
						
						System.out.println("Please enter the description of the reminder:");
						String groupentry2 = in.next();
						
						System.out.println("Please enter the year of the reminder (Ex. 2016):");
						int groupentry3 = in.nextInt();
						
						System.out.println("Please enter the month of the reminder (Ex. 10 = October):");
						int groupentry4 = in.nextInt();
						
						System.out.println("Please enter the day of the reminder:");
						int groupentry5 = in.nextInt();
						
						System.out.println("Please enter the hour of the reminder (Ex. 13 = 1 PM):");
						int groupentry6 = in.nextInt();
						
						System.out.println("Please enter the minute of the reminder:");
						int groupentry7 = in.nextInt();
						
						System.out.println("Please enter the type of alarm (:");
						System.out.println("Enter 1 for VIBRATION");
						System.out.println("Enter 2 for SOUND");
						System.out.println("Enter 3 for VIBRATION + SOUND");
						
						int groupentry8 = in.nextInt();
						
						while(groupentry8 < 1 && groupentry8 > 3)
						{
							System.out.println("Invalid entry.");
							System.out.println("Enter a number from 1 - 3");
							groupentry8 = in.nextInt();
						}
						
						type groupcType = type.VIBRATION;
						
						switch(groupentry8)
						{
						case 1: groupcType = type.VIBRATION;
								break;
						
						case 2: groupcType = type.SOUND;
								break;
						
						case 3: groupcType = type.SOUND_VIBRATION;
								break;
						}
							
						groupcal.set(groupentry3, groupentry4 - 1, groupentry5, groupentry6, groupentry7, 0);
						//System.out.println(cal.getTime());
						
						groupmyDate = groupcal.getTime();
						//System.out.println(myDate);

						
						Reminder groupaddedReminder = new Reminder(groupentry1, groupmyDate, groupentry2);
						
						groupaddedRemind = new Remind(groupcType, groupaddedReminder);
						
						listOfReminders.addReminderAll(groupaddedRemind,listOfReminders);
						
						
						continue;
					case 4: //exit to previous menu
						exitGroup = true;
						continue;
				}

				}
				
				continue; //end of case 4
			case 5:
			
				exit = true;
				continue;
	
	    }
	}
	
}
	
}
