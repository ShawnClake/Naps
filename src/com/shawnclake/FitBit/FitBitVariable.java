package com.shawnclake.FitBit;

import java.util.Date;

public enum FitBitVariable {

	sleepDate, isMainSleep, logId, efficiency, startTime, duration, minutesToFallAsleep, minutesAsleep, minutesAwake, minutesAfterWakeup, AwakeningsCount,
	awakeCount, awakeDuration, restlessCount, restlessDuration, timeInBed, minuteDataDate, minuteDataValue;	
	
}
/** types of the enums are as follows:
Date sleepDate; //added in for our purposes
boolean isMainSleep;
double logId;
int efficiency; 
Date startTime;
double duration;
int minutesToFallAsleep;
int minutesAsleep;
int minutesAwake;
int minutesAfterWakeup;
int AwakeningsCount; //deprecated by FitBit company
int awakeCount;
int awakeDuration;
int restlessCount;
int restlessDuration;
int timeInBed;
Date minuteDataDate;
int minuteDataValue;
**/


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