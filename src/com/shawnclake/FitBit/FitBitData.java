package com.shawnclake.FitBit

import com.shawnclake.io.FileInput;

import java.security.MessageDigest;

import java.util.List;
import java.util.date;

/**
 * 
 * @author Sam Dietrch
 * Stores a sleep log in a manipulated format, follows the standard fitbit model as close as possible
 *
     "sleep": [
        {
            "isMainSleep":true,
            "logId":29744,
            "efficiency":98,
            "startTime":"2011-06-16T00:00:00.000",
            "duration":28800000,
            "minutesToFallAsleep":0,
            "minutesAsleep":480,
            "minutesAwake":0,
            "minutesAfterWakeup":0,
            "awakeningsCount":0, // deprecated
            "awakeCount":0,
            "awakeDuration":0,
            "restlessCount":0,
            "restlessDuration":0,
            "timeInBed":480
            "minuteData":[
                {
                    "dateTime":"00:00:00",
                    "value":"3"
                },
                {
                    "dateTime":"00:01:00",
                    "value":"2"
                },
                {
                    "dateTime":"00:02:00",
                    "value":"1"
                },
                &amp;lt;...&amp;gt;
        },   
 *
 *In the future these values will be accessed following standard fitbit sleep log protocol as:
 *
 GET https://api.fitbit.com/1/user/[user-id]/sleep/date/[date].json

user-id	The ID of the user. Use "-" (dash) for current logged-in user.
date	The date of records to be returned. In the format yyyy-MM-dd.
 *
 *
 *
 *
 *
 *
 */

public class FitBitData {

	boolean isMainSleep;
	double logId;
    int efficiency; 
    date startTime;
    double duration;
    int minutesToFallAsleep;
    int minutesAsleep;
    int minutesAwake;
    int minutesAfterWakeup;
    int wakeningsCount; " //deprecated by FitBit company
    int awakeCount":0,
    int awakeDuration;
    int restlessCount;
    int restlessDuration;
    int timeInBed;
    date minuteDataDate;
    int minuteDataValue;
    
    //Getters and setters for all variables
    public boolean getisMainSleep(){return this.isMainSleep;}
    public void setisMainSleep(boolean setIMS){this.isMainSleep = setIMS;}
    
    public double getlogId(){return this.logId;}
    public void setlogId(double setlId){this.isMainSleep;}
    
    public boolean getisMainSleep(){return this.isMainSleep;}
    public void setisMainSleep(boolean setIMS){this.isMainSleep;}
    
    public boolean getisMainSleep(){return this.isMainSleep;}
    public void setisMainSleep(boolean setIMS){this.isMainSleep;}
    
    public boolean getisMainSleep(){return this.isMainSleep;}
    public void setisMainSleep(boolean setIMS){this.isMainSleep;}
    
    public boolean getisMainSleep(){return this.isMainSleep;}
    public void setisMainSleep(boolean setIMS){this.isMainSleep;}
    
    public boolean getisMainSleep(){return this.isMainSleep;}
    public void setisMainSleep(boolean setIMS){this.isMainSleep;}
    
    
    
    
}


