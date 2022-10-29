package com.company;
import com.company.RoomObj;
import com.company.CourseObj;
import java.util.HashMap;
import com.company.Time;
import java.util.Scanner;
import java.util.ArrayList;
import com.company.OutputData;
public class Main {

    public static void main(String[] args) {
	// wbnrsdnmsc
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Time Slots");
        Time time = new Time();
        ArrayList<Time>TimeArray =  time.getTime();

        System.out.println("Enter Rooms Details");
        RoomObj rooms = new RoomObj();
        ArrayList<RoomObj>roomArr = rooms.getRooms();

        System.out.println("Enter Courses Details : ");
        CourseObj course = new CourseObj();
        ArrayList<CourseObj>Course_arr  = course.getCourses();


        System.out.println("Enter Your Cource and Time Preference Details");

        Integer n ;
        System.out.println("Enter Total number of cources ");
        n = sc.nextInt();

        ArrayList<userInput>userdetails = new ArrayList<userInput>();

        for (int i = 0; i < n; i++) {
            userInput user = new userInput();
            userdetails.add(user.getuserdata());
        }

//        for (int i = 0; i < n; i++) {
//            System.out.println(userdetails.get(i).c_no + " " + userdetails.get(i).enroll + " " + userdetails.get(i).timePref );
//        }

        System.out.println("Output Of Data");
        OutputData output = new OutputData(TimeArray,roomArr,Course_arr,userdetails);
        output.getData();


    }
}
