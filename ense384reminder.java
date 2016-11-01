import java.util.Scanner;


class Reminder
{













}



class Reminders
{










}


class Remind		//If you want to add a reminder, the user calls Remind.setType, the user inputs all the values and then calls add in Reminders(collection).
{					// 







}



function ReminderUI()
{
	string witticisms[10];
	
	
	
	witticisms[0] = "Your inability to follow simple instructions is astounding.";
	witticisms[1] = "You almost had it there, champ.";
	witticisms[2] = "Swing and a miss.";
	witticisms[3] = "How did you even get this far?";
	witticisms[4] = "I didn't think it was possible to have a single digit IQ, but you've done it. Congratulations.";
	witticisms[5] = "There are not enough crayons in the world to explain this to you.";
	witticisms[6] = "You're as useless as the 'g' in lasagna";
	witticisms[7] = "As a failure, you are a great success.";
	witticisms[8] = "You're so stupid, I could count your brain cells on one hand.";
	witticisms[9] = "What am I doing? You probably don't even know how to read.";
	
	
	int choice;
	
	Scanner in = new Scanner(System.in);
	
	
	bool exit = false;
	while(!exit)
	{
		System.out.println("Welcome to reminders. You have 4 options to choose from:");
	
		System.out.println("Show current reminders.                  1");
		System.out.println("Add a reminder.                          2");
		System.out.println("Delete a reminder.                       3");
		System.out.println("Go back.                                 4");
	
		choice = in.nextInt();
		
		int witticism = 0;
		
		while(choice < 1 || choice > 4)
		{
			System.out.println("I don't understand your input. " + witticisms[witticism]);
			witticism++;
			if(witticism > 9)
				witticism = 0;
		}
	
	switch(choice)
	{
		case 1:
			System.out.println("Here are the current reminders:");
			reminders.check()		//Whatever the reminders(collection) object in main is
		
		
			continue;
		
		case 2:
			Remind = new Remind();
			Date myDate;
			Calendar cal = Calendar.getInstance();
			
			
			System.out.println("Please enter the name of the reminder:");
			string entry1 = in.next();
			
			System.out.println("Please enter the description of the reminder:");
			string entry2 = in.next();
			
			System.out.println("Please enter the year of the reminder (Ex. 10 = October):");
			string entry3 = in.next();
			
			System.out.println("Please enter the month of the reminder (Ex. 10 = October):");
			string entry4 = in.next();
			
			System.out.println("Please enter the day of the reminder:");
			string entry5 = in.next();
			
			System.out.println("Please enter the hour of the reminder (Ex. 10 = October):");
			string entry6 = in.next();
			
			System.out.println("Please enter the minute of the reminder:");
			string entry7 = in.next();
			
			
			cal.set(Calendar.YEAR, entry3);
			cal.set(Calendar.MONTH, entry4);
			cal.set(Calendar.DATE, entry5);
			cal.set(Calendar.HOUR,entry6);
			cal.set(Calendar.MINUTE,entry7);
			cal.set(Calendar.SECOND,00);
			myDate = cal.getTime();
			
			//System.out.println(myDate);	//Test
			
			continue;
		
		case 3:
		
		
			continue;
		
		case 4:
		
		
			continue;
			
			
			
			
    }
}
			
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}
}