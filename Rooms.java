package com.company;
import java.util.*;

public class Rooms {
    public HashMap<String,String> room(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Total No of Rooms :- ");
        Integer n = sc.nextInt();
        System.out.println("Enter Room Details : Room_no : Capacity ");
        HashMap<String,String>room_details = new HashMap<String ,String>();
        for(int i=0;i<n;i++)
        {
            String temp = sc.next();
            String cap = sc.next();
            room_details.put(temp,cap);
        }

        System.out.println(room_details);
        return room_details;
    }
}
