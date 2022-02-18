package com.example.MSGrades;
import java.util.ArrayList;

public class MSGrades {

    private final String[] teachers = {"Ms. Smith", "Mr. Johnson", "Mrs. Doe"};
    private final ArrayList<String> students = new ArrayList<String>();
    private final ArrayList<Integer> math = new ArrayList<Integer>();
    private final ArrayList<Integer> science = new ArrayList<Integer>();
    private final ArrayList<Integer> english = new ArrayList<Integer>();



      public  MSGrades(){
        students.add("mike");
        students.add("dave");
        math.add(89);
        math.add(96);
        science.add(96);
        science.add(85);
        english.add(98);
        english.add(89);
    }



    public void printStudents() {
        for (String st : students
        ) {
            System.out.println("name :" + st);
        }
    }
     public  void  studentGrades(int index){
        String  studentName = students.get(index);
        int  mathGrade = math.get(index);
        int scienceGrade = science.get(index);
        int engGrade = english.get(index);

        System.out.println("Student:"+studentName+ " Grade in Math: "+mathGrade+" Science: "+scienceGrade+" and English : "+engGrade +".");
     }
            

    public static void main(String[] args) {
        // write your code here
        MSGrades msGrade8 = new MSGrades();

        System.out.println("Middle School Roster");
        System.out.println("====================");
        msGrade8.printStudents();
        System.out.println("====================");

//
        for (int i = 0; i < msGrade8.teachers.length; i++) {
            String  result = msGrade8.teachers[i];
            System.out.println(result);
                }
        System.out.println("====================");
        System.out.println("\nStudent Grades:\n");
        for (int j = 0; j < msGrade8.students.size(); j++) {
            msGrade8.studentGrades(j);
        }

        

        
    }
}
