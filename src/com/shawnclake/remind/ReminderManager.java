package com.shawnclake.remind;
import java.util.Date;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import com.shawnclake.auth.User;
/**
 * 
 * 
 * @author SAMDietrich
 * written 12/05/2016
 * As part of scrum two this class accomplishes the following through the following methods:
 * 

  +  getUsersReminders returns the reminders attached to the User model passed to the method. Check with Uys as he is working on refactoring the reminders a little bit to allow separate lists of reminders for each user.

  +  addReminderToUser adds an additional reminder to the user model passed to the method.

  +  addReminderAll adds an additional reminder to all of the users.

  -  isAuthorized is a private method used to see if a user is in the same user group as another user in order to add a reminder to them. For example, if User A wants to add a reminder to User B, then User A and B must be in the same user group.

 *
 */


public class ReminderManager {

	
	public Reminders getUsersReminders(User user) {
		
		//Waiting for Uysie as he is reformatting how reminders are stored
		return Ders;
	}
	
	public Reminders addReminderToUser (User user, Reminder reminder) {
		
		Reminders.add(Reminder);
		
		return Ders;
	}
	
	public void addReminderAll(User user, UserGroup UG, Reminder reminder) {
		//Waiting for Shawn to finish the UserGroup class
		
	}
	
	private boolean isAuthorized(User firstUser, User secondUser){
		
		
		
		return false;
		
		
	}
}


