package com.shawnclake.remind;
import java.util.ArrayList;
import java.util.Date;

public class Reminders extends ReminderManager{

	private static ArrayList<Remind> reminders;

	
	public Reminders()
	{
		
		reminders = new ArrayList<Remind>();
		
		
	}
	
	
	
	public Reminders(ArrayList<Remind> mainReminders)
	{
		reminders = mainReminders;
		
		
	}
	
	public static Remind getRemind(int i)
	{
		return reminders.get(i);
		
		
	}
	
	
	public static int getCount()
	{
		return reminders.size();
		
		
	}
	
	public void check()		//Checks if any of the current reminders have the same time as the current date, if yes returns the first reminder found, else returns null
	{
		Date currentTime = new Date();	//Praying this gives the current time
		
		for(int i = 0; i < reminders.size(); i++)
		{
			reminders.get(i).checkTime(currentTime);
			
			
		}
		
		return;
	}
	
	

	public void addReminder(Remind addedReminder)
	{
		reminders.add(addedReminder);
		
	}

	public void removeReminder(int position)	//The position int will have to be taken
	{
		if(position < 0 || position >= reminders.size())
		{
			System.out.println("Error: Reminder position was not within bounds.");
			return;
		}
			
			
		reminders.remove(position);
		return;	//The reminder was successfully removed
			
			
		
	}

	
	public void printReminders()
	{
		for(int i = 0; i < reminders.size(); i++)
		{
			System.out.println("Reminder " + (i + 1) + ": " + reminders.get(i).getReminder().getName());
			System.out.println("Description: " + reminders.get(i).getReminder().getDescription());
			System.out.println("Date: " + reminders.get(i).getReminder().getTime());
			System.out.println("Type: " + reminders.get(i).getType());
			System.out.println("");
			
			
			
		}
		
		
		
	}



}
