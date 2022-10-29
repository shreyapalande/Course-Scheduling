package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import com.company.CourseObj;


public class userInput {

    Scanner sc = new Scanner(System.in);
    Integer c_no , enroll;
    ArrayList<CourseObj>courseArr;
    Integer room_id;
    ArrayList<String>timePref;
    public userInput(){}
    public userInput(Integer c , Integer e , ArrayList<String>p,ArrayList<CourseObj>arr ){
        c_no = c;
        enroll = e;
        timePref = p;
        courseArr  =arr;

    }

    public userInput getuserdata(){
        Integer enrollment ,course_no ;
        Integer n_pref;
        String timepref;

        ArrayList<userInput>userData = new ArrayList<userInput>();

        System.out.print("Enter Course no : ");
        course_no = sc.nextInt();

        System.out.print("Enter Enrollemt for cs" + course_no);
        enrollment = sc.nextInt();
        System.out.println("Enter number of Time Preferences ");
        n_pref = sc.nextInt();

        while(n_pref > 5)
        {
            System.out.println("Maximum  preferences allowed ");
            System.out.println("Enter number of Time Preferences ");
            n_pref = sc.nextInt();
        }

        ArrayList<String>preferences = new ArrayList<String>();
        for (int i = 0; i < n_pref; i++) {
            System.out.print("Enter Your "+i+1+" "+"Preference for Cources cs"+course_no );
            String t = sc.next();
            preferences.add(t);
        }
        userInput user = new userInput(course_no,enrollment,preferences,courseArr);
//        System.out.println(preferences);
        userData.add(user);
        return  user;
    }
}
