package com.company;

import java.util.ArrayList;
import java.util.Scanner;

//hellllllooooooooo

public class Time {
    String t;
    Scanner sc = new Scanner(System.in);
    public  Time(){

    }
    public Time(String time)
    {
        t = time;
    }
    public ArrayList<Time> getTime(){

        ArrayList<Time> TimeArray = new ArrayList<Time>();
        Integer n_timeSlots ;
        System.out.println("Enter Total number of Time Slots");
        n_timeSlots = sc.nextInt();

        System.out.println("Enter Timing");
        for (int i = 0; i < n_timeSlots; i++) {
            String t;
            t = sc.next();
            Time time = new Time(t);
            TimeArray.add(time);
        }
        return TimeArray;
    }
}
