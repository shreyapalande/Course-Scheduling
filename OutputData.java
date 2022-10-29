package com.company;
import com.company.RoomObj;
import com.company.CourseObj;
import com.company.Time;
import com.company.userInput;

import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Locale;
import java.util.Map;

public class OutputData {
    ArrayList<Time>time;
    ArrayList<RoomObj>rooms;
    ArrayList<CourseObj>courses;
    ArrayList<userInput>userdetails;
   public OutputData(ArrayList<Time>t , ArrayList<RoomObj>r , ArrayList<CourseObj>c , ArrayList<userInput>u)
    {
        time = t;
        rooms = r;
        courses = c;
        userdetails  = u;
    }

    public void formatData(){
       Formatter fwt  = new Formatter();
       fwt.format("%12s %12s %12s %12s %12s %12s %12s %12s %12s \n" , "ROOMS" ,"MWF9" , "MWF10","MWF11","MWF2","TT9","TT10:30","TT2","TT3:30");
       ArrayList<String>data = new ArrayList<String>();
       for(int i=0;i<rooms.size();i++)
        {
            fwt.format("%12s " , rooms.get(i).Id);
            for(Map.Entry<String,Integer>set : rooms.get(i).AlotMap.entrySet())
            {
                fwt.format("%12s ",set.getValue().toString());
//                rooms_data += "<td>" + set.getValue().toString() + "</td>" ;
            }
            fwt.format("\n");
        }
        System.out.println(fwt);
    }


    public void getData(){

        ArrayList<RoomObj>ans = new ArrayList<RoomObj>();
        for(int i=0;i<userdetails.size();i++)
        {
            userInput user = userdetails.get(i);
            boolean room_alloted = false;
            if(user.timePref.size()>0) {
                for (int j = 0; j < user.timePref.size(); j++) {

                    for (int k = 0; k < rooms.size(); k++) {
                        if ((!rooms.get(k).AlotMap.containsKey(user.timePref.get(j))) && (rooms.get(k).Capacity >= user.enroll)){
                            rooms.get(k).AlotMap.put(user.timePref.get(j), user.c_no);
                            room_alloted = true;
                            ans.add(rooms.get(k));
                            break;
                        }
                    }
                    if (room_alloted) {
                        break;
                    }
                }
            }
            else {
                for (int j = 0; j < rooms.size(); j++) {
                    for (int k = 0; k < time.size(); k++) {
                        if(!rooms.get(j).AlotMap.containsKey(time.get(k).t) && (rooms.get(j).Capacity >= user.enroll))
                        {
                            rooms.get(j).AlotMap.put(time.get(k).t , user.c_no);
                            room_alloted = true;
                            ans.add(rooms.get(j));
                            break;
                        }
                    }
                    if(room_alloted)
                    {
                        break;
                    }
                }
            }
        }
//        System.out.println("ANs");
//        for(int i=0;i<ans.size();i++)
//        {
//            System.out.println(ans.get(i).Id+" "+ans.get(i).AlotMap );
//        }
        System.out.println("ROOMS");
        for (int i = 0; i < rooms.size(); i++) {
            System.out.println("ID" + rooms.get(i).Id +" AllotMap " + rooms.get(i).AlotMap + " Capacity " +rooms.get(i).Capacity);
        }

        System.out.println("---------------------------------- TIME TABLE-------------------------------------------");
        formatData();
    }

 }
