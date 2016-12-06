

package com.shawnclake.remind;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import com.shawnclake.auth.User;
import com.shawnclake.auth.UserGroup;

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
    //ArrayList<Remind> returnArray = null;
    UserGroup ManagerGroup = new UserGroup(); //Managergroup is added simply to illustrate group functionality


	
	public void addReminderAll( Remind remind, Reminders listOfReminders) {
		//add reminder to all users in usergroup
		int size = ManagerGroup.getCount();
		User userInGroup = null;
		
		for (int i = 0;i < size; i++){
			userInGroup = ManagerGroup.getUser(i);
			userInGroup.getReminders().addReminder(remind);
		}
		
		
	}
	
	private boolean isAuthorized(User firstUser, User secondUser){
		
		boolean checkone = ManagerGroup.isInGroup(firstUser);
		
		boolean checktwo = ManagerGroup.isInGroup(secondUser);

		if((checkone == false)||(checktwo == false)){
		return false;
		}
		else {
			return true;
		}
		
	}
	
	public void addAuthorized(User firstUser){
				
		ManagerGroup.addUser(firstUser);		
		
	}
	
	public void removeAuthorized(User firstUser){
		
		ManagerGroup.removeUser(firstUser);
		
	}
	
}


