import java.util.Date;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Remind {

	type   alarmType;
	Reminder reminderRemind;

	
	public Remind(type currentType, Reminder currentReminder)
	{
		alarmType = currentType;		//Vibration is null by default, should probably change it to something else
		reminderRemind = currentReminder;
	}

	public void setType(type cType)
	{
		alarmType = cType;
	}
	
	public type getType()
	{
		return alarmType;
	}
	
	
	public Reminder getReminder()
	{
		
		return reminderRemind;
		
	}
	
	public void setReminder(Reminder cReminder)
	{
		reminderRemind = cReminder;
		
		
	}
	
	public void checkTime(Date currentTime)
	{
		
		System.out.println("DOES " + currentTime + " EQUAL " + reminderRemind.getTime() + "?");
		
		if(		reminderRemind.getTime().getYear() == currentTime.getYear() && 
				reminderRemind.getTime().getMonth() == currentTime.getMonth() &&
				reminderRemind.getTime().getDate() == currentTime.getDate() &&
				reminderRemind.getTime().getHours() == currentTime.getHours() &&
				reminderRemind.getTime().getMinutes() == currentTime.getMinutes()	)
		{
		
			System.out.println("ALARM ACTIVATED");
			start();
				
		}
		
		
	}
	
	
	public void start()
	{
			Scanner in = new Scanner(System.in);
			
			
			if(alarmType.equals("VIBRATION"))
			{
				//ACTIVATE_VIBRATION_MODE();
				System.out.println("BRRRRRRRRRR");
			}
			else if(alarmType.equals("SOUND"))
			{	//ACTIVATE_BEEP-BEEP_MODE();
				System.out.println("BEEP BEEP");
			
			}
			else
			{
				System.out.println("BEEP BEEP BRRRRRRRRRRR");
				//ACTIVATE_BEEP-BEEP_MODE();
				//ACTIVATE_VIBRATION_MODE();
			}
			
			
			System.out.println(reminderRemind.getName());
			System.out.println(reminderRemind.getDescription());
			System.out.println("Alarm will stop in 1 minute. Press s to stop, or t to snooze for 1 minute.");
		
			
			
			
			
			//int interval = 60000; // 60 sec
			int interval = 1000; //TEST FOR 1 SECOND //IT WORKS
				Date timeToRun = new Date(System.currentTimeMillis() + interval);
				Timer timer = new Timer();
    
			timer.schedule(new TimerTask() {
            public void run() {
           
               stop();
               in.close();
               
               
			   return;				//Does this just return from the run(), hmmmmm, I dunno
           }
       }, timeToRun);
			
			String choice = in.next();
			
			System.out.println(choice);
			
			while(choice != "s" && choice != "t")
			{
				System.out.println("Press s to stop, or t to snooze for 1 minute.");
				choice = in.next();
				
				
			}
			
			if(choice == "s")
			{
				stop();
				
				
			} else
			{
				stop();
				snooze();
			}
			
			
			in.close();
	}
	

	public void stop()
	{
		//DEACTIVATE_ALL_VIBRATIONS_AND_SOUNDS();
		System.out.println("ALARM NOW STOPPED");
		
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

	
	}, timeToRun);

	
	}
	
	
}
