package com.company;

import java.util.ArrayList;
import java.util.Scanner;
public class CourseObj {
    Scanner sc = new Scanner(System.in);
    public Integer Id , enrollment;
    public String type ;

    public  CourseObj(){

    }
    public CourseObj(Integer id , Integer enroll , String C_type){
        Id = id;
        enrollment = enroll;
        type = C_type;
    }

    public ArrayList<CourseObj> getCourses(){
        Integer n_courses;
        System.out.print("Enter No of Courses ");
        n_courses = sc.nextInt();

        Integer c_no , enrol;
        String c_ty = new String();
        ArrayList<CourseObj>Course_arr = new ArrayList<CourseObj>();
        for(int i=0;i<n_courses;i++)
        {
            System.out.print("Enter Course Number"+" ");
            c_no = sc.nextInt();
            System.out.print("Enter Course Enrollment "+" ");
            enrol = sc.nextInt();
            if(c_no >= 600)
            {
                c_ty = "postgraduate";
            }
            else{
                c_ty = "undergraduate";
            }
            CourseObj course = new CourseObj(c_no , enrol , c_ty);
            Course_arr.add(course);
        }
        return Course_arr;
    }
}
