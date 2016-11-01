package com.shawnclake.FitBit

import com.shawnclake.io.FileInput;

import java.security.MessageDigest;

import java.util.List;
import java.util.Date;

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
    
    //Getters and setters for all variables
    public void setFitBitData(Date sD, boolean setIMS, double li, int eff, Date sT, double dur, int mTFA, int mAs, int mAw, int mAAw, int awC, int awD, int rC, int rD, int tIB, Date mDD, int mDV)
    {this.sleepDate = sD;
    this.isMainSleep = setIMS;
	this.logId = li;
    this.efficiency = eff; 
    this.startTime = sT;
    this.duration = dur;
    this.minutesToFallAsleep=mTFA;
    this.minutesAsleep=mAs;
    this.minutesAwake=mAw;
    this.minutesAfterWakeup=mAAw;
    this.awakeCount=awC;
    this.awakeDuration=awD;
    this.restlessCount=rC;
    this.restlessDuration=rD;
    this.timeInBed=tIB;
    this.minuteDataDate=mDD;
    this.minuteDataValue=mDV;  
    }
    
    public boolean getisMainSleep(){return this.isMainSleep;}

    public double getlogId(){return this.logId;}
    
    public boolean getisMainSleep(){return this.isMainSleep;}
    
    public boolean getisMainSleep(){return this.isMainSleep;}
    
    public boolean getisMainSleep(){return this.isMainSleep;}
    
    public boolean getisMainSleep(){return this.isMainSleep;}
    
    public boolean getisMainSleep(){return this.isMainSleep;}
    

}


