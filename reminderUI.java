// OK READ HERE JEN
//
//To call this function in the main, you must make a global variable listOfReminders to store the reminders in.
//If the user wants to access the UI, You must make a reminderUI object and call the method UI on that object with the parameter listOfReminders (IE. REMINDERUIPBJECT.UI(listOfReminders);
// OK, and also, you need to periodically call THE CALL METHOD (COMING SOON)!!
//
//
//
//





import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;





public class reminderUI			//Want to make this static, don't know how

		//Passed by reference. Kinda confused how java does this. W/E make listOfReminders global then and just get rid of the parameter
	{
	
	
	public static void main(String[] args) {
		
		Reminders globalReminders = new Reminders();
		Scanner inn = new Scanner(System.in);
		
		
		
		UI(globalReminders);

		globalReminders.check();
		
		
		
	}
	
	
	public static void UI(Reminders listOfReminders)
	{
		
	
		String witticisms = "You almost had it there, champ.";
		//witticisms[1] = "Your inability to follow simple instructions is astounding.";
		//witticisms[2] = "Swing and a miss.";
		//witticisms[3] = "How did you even get this far?";
		//witticisms[4] = "I didn't think it was possible to have a single digit IQ, but you've done it. Congratulations.";
		//witticisms[5] = "There are not enough crayons in the world to explain this to you.";
		//witticisms[6] = "You're as useless as the 'g' in lasagna";
		//witticisms[7] = "As a failure, you are a great success.";
		//witticisms[8] = "You're so stupid, I could count your brain cells on one hand.";
		//witticisms[9] = "What am I doing? You probably don't even know how to read.";
		
		
		int choice;
		
		Scanner in = new Scanner(System.in);
		
		
		boolean exit = false;
		while(!exit)
		{
			System.out.println("Welcome to reminders. You have 4 options to choose from:");
		
			System.out.println("Show current reminders.                  1");
			System.out.println("Add a reminder.                          2");
			System.out.println("Delete a reminder.                       3");
			System.out.println("Go back.                                 4");
		
			choice = in.nextInt();
			
			//int witticism = 0;
			
			while(choice < 1 || choice > 4)
			{
				System.out.println("I don't understand your input. " + witticisms);
				//witticism++;
				//if(witticism > 9)
				//	witticism = 0;
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
				//myDate.getTime();
				
				//System.out.println(myDate);
				//TimeZone timezone = TimeZone.getTimeZone("Canada/Saskatchewan");	
				//Calendar cal = Calendar.getInstance(timezone);
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
				//System.out.println(cal.getTime());
				
				myDate = cal.getTime();
				//System.out.println(myDate);
				
				
				
				
				
				
				Reminder addedReminder = new Reminder(entry1, myDate, entry2);
				
				addedRemind = new Remind(cType, addedReminder);
				
				
				
				listOfReminders.addReminder(addedRemind);
				
				
				//for(int i = 0; i < listOfReminders.getCount(); i++)
				//{
				//	System.out.println("Reminder 1: " + listOfReminders.getRemind(i).getReminder().getName());
				//	System.out.println("Description: " + listOfReminders.getRemind(i).getReminder().getDescription());
				//	System.out.println("Date: " + listOfReminders.getRemind(i).getReminder().getTime());
				//	System.out.println("");
					
					
					
				//}
				
				listOfReminders.printReminders();
				//System.out.println(myDate);	//Test
				
				
				
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
			
				exit = true;
				continue;
				
				
				
				
				
	    }
	}
		
		
		in.close();
		
}
	
	
}
