package com.shawnclake.reminder;

//In Main you will have to initialize a reminders(collection) called listOfReminders and a static Remind object called remindObject, and if that collection is not empty, then you will need to periodically call Remindobject.start(reminders.check()). To access the Reminder UI, 
//you must call ReminderUI();


import java.util.Scanner;
import java.util.Timer;

class Reminder
{
	
	private int id;		//THe picture only has a d, assummed id. I'm gonna say that this contains a unique id. A, primary key, you could say
	private string name;
	private Date time;
	private string description;

		public Reminder(string cName, Date cTime, strin cDescription, int cId)
		{
			name = cName;
			time = cTime;
			description = cDescription;
			id = cId;
		}

		public Date getTime()
		{
			return time;	
		}

		public string getName()
		{
			return name;
		}

		public string getDescription()
		{
			return description;
		}
		
		public int getId()
		{
			return id;

		}
		
		public void setTime(Date cTime)
		{
			time = cTime;	
		}

		public void setName(string cName)
		{
			name = cName;
		}

		public void setDescription(string cDescription)
		{
			description = cDescription;	
		}






}



class Reminders
{
	private ArrayList<Reminder> reminders;

	public Reminders()
	{
		reminders = new ArrayList<Reminders>();
		
		
	}
	
	public int getCount()
	{
		return reminders.count();
		
		
	}
	
	public void check()		//Checks if any of the current reminders have the same time as the current date, if yes returns the first reminder found, else returns null
	{
		Date currentTime = new Date();	//Praying this gives the current time
		
		for(int i = 0; i < reminders.count(); i++)
		{
			if(reminders[i].getTime() == currentTime)
				 remindObject.start(reminders[i]);
			
		}
		
		
	}
	
	

	public void addReminder(Reminder addedReminder)
	{
		reminders.add(addedReminder);
		
	}

	public void removeReminder(int position)	//The position int will have to be taken
	{
		if(position > -1 || position >= reminders.count())
		{
			System.out.println("Error: Reminder position was not within bounds.");
			return;
		}
			
			
		reminders.remove(position);
		return;	//The reminder was sucessfully removed
			
			
		
	}

	
	public void printReminders()
	{
		for(int i = 0; i < reminders.count(); i++)
		{
			System.out.println("Reminder 1: " + reminders[i].getName());
			System.out.println("Description: " + reminders[i].getDescription());
			System.out.println("Date: " + reminders[i].getTime());
			System.out.println("");
			
			
			
		}
		
		
		
	}



}


class Remind		//If you want to add a reminder, the user calls Remind.setType, the user inputs all the values and then calls add in Reminders(collection).
{					// 
	private enum type{VIBRATION, SOUND, SOUND_VIBRATION} 

	Reminder reminderRemind;

	
	public Remind()
	{
		type = VIBRATION;		//Vibration is the default
		
	}

	public void setType(cType)
	{
		type = cType;
	}
	
	public void getType()
	{
		return type;
	}
	
	public void start()
	{
			Scanner in = new Scanner(System.in);
	
			if(type == VIBRATION)
				ACTIVATE_VIBRATION_MODE();
			else if(type == SOUND)
				ACTIVATE_BEEP-BEEP_MODE();
			else
			{
				ACTIVATE_BEEP-BEEP_MODE();
				ACTIVATE_VIBRATION_MODE();
			}
			
			
			System.out.println(reminderRemind.getName());
			System.out.println(reminderRemind.getDescription());
			System.out.println("Alarm will stop in 1 minute. Press s to stop, or t to snooze for 1 minute.");
		
		
			
			
			
			int interval = 60000; // 60 sec
				Date timeToRun = new Date(System.currentTimeMillis() + interval);
				Timer timer = new Timer();
    
			timer.schedule(new TimerTask() {
            public void run() {
               stop();
			   return;				//Does this just return from the run(), hmmmmm, I dunno
           }
       }, timeToRun);
			
			char choice = in.next();
			
			while(c != 's' && c != 't' && )
			{
				System.out.println("Press s to stop, or t to snooze for 1 minute.");
				
			}
			
			if(c == 's')
			{
				stop();
				
				
			} else
			{
				stop();
				snooze();
			}
	}

	public void stop()
	{
		DEACTIVATE_ALL_VIBRATIONS_AND_SOUNDS();
		
	}

	public void snooze()
	{
	
		int interval = 60000; // 60 sec
				Date timeToRun = new Date(System.currentTimeMillis() + interval);
				Timer timer = new Timer();
    
			timer.schedule(new TimerTask() {
            public void run() {
               start();
			   return;				
           }

	
	}

}



function ReminderUI(Reminders listOfReminders)	//Passed by reference. Kinda confused how java does this. W/E make listOfReminders global then and just get rid of the parameter
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
			listOfReminders.printReminders()		//Whatever the reminders(collection) object in main is
		
		
			continue;
		
		case 2:
			Remind = new Remind();
			Date myDate;
			TimeZone timezone = TimeZone.getTimeZone("Canada/Saskatchewan");	
			Calendar cal = Calendar.getInstance(timezone);
			
			
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
			cal.set(Calendar.MONTH, entry4 - 1); //-1 b/c 0 indexed
			cal.set(Calendar.DATE, entry5);
			cal.set(Calendar.HOUR,entry6);
			cal.set(Calendar.MINUTE,entry7);
			cal.set(Calendar.SECOND,00);
			myDate = cal.getTime();
			
			//System.out.println(myDate);	//Test
			
			
			
			continue;
		
		case 3:
		
			listOfReminders.printReminders()
			
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
			
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}
}