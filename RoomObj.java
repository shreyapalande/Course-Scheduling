package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;
import java.util.Scanner;
public class RoomObj {
    Scanner sc = new Scanner(System.in);
    public Integer Id , Capacity;

    public HashMap<String,Integer>AlotMap = new HashMap<String,Integer>();
    public RoomObj(){

    }
    public RoomObj(Integer id,Integer capacity){
        Id = id;
        Capacity = capacity;
    }

    public RoomObj(Integer id,Integer capacity,String Time,Integer c_no)
    {
        if(!AlotMap.containsKey(Time))
        {
            AlotMap.put(Time ,c_no );
        }
    }

    public ArrayList<RoomObj> getRooms(){
        System.out.println("Enter no Of Rooms in College");
        Integer n_rooms  = sc.nextInt();

        System.out.println("Enter Room Details : Room_no , Capacity_of_room ");
        Integer Room_no , Capacity;

        ArrayList<RoomObj>Rooms_arr = new ArrayList<RoomObj>();
        for(int i=0;i<n_rooms;i++)
        {
            System.out.print("Enter Room no : ");
            Room_no = sc.nextInt();
            System.out.print("Enter Capacity of Room " + Room_no);
            Capacity = sc.nextInt();
            System.out.println();
            RoomObj room = new RoomObj(Room_no,Capacity);
            Rooms_arr.add(room);
        }
        return Rooms_arr;
    }
}
