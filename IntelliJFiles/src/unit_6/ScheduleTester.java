package unit_6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScheduleTester {
    public static void main(String[] args) throws FileNotFoundException {
        //instantiate 8 class objects
        Course per1 = new Course("Mr.Nichols","A+", "Math", 1);
        Course per2 = new Course("Mrs.Enk", "A", "English", 2);
        Course per3 = new Course("Mrs.Zinger", "A-", "Science", 3);
        Course per4 = new Course("Mrs.Wrzala", "A-", "Social Studies", 4);
        Course per5 = new Course("Lunch",5);
        Course per6 = new Course("Mr.Hogrefe", "A+", "Gym", 6);
        Course per7 = new Course("Study Hall",7);
        Course per8 = new Course("Sra.Clement", "A-", "Foreign Language", 8);

        //Initialize array of courses
        Course[] myClasses ={per1,per2, per3, per4, per5, per6, per7, per8};

        //Initialize Student object
        Student oliver = new Student("Oliver", myClasses);

        //Print oliver's classes
        System.out.println(oliver);

        // Begin file read
        File studentData = new File("C:\\Users\\khosla1739\\Documents\\GitHub\\M359\\IntelliJFiles\\studentScheduleData.txt"); // create File object
        Scanner inF = new Scanner(studentData); // create Scanner for text file
        System.out.println("*** BEGIN FILE READ ***");
        int num = inF.nextInt();
        inF.nextLine();  // dummy read to scan the "\n" that remains

//        int nameStudents = inF.nextInt();
//        inF.nextLine();
        Student[] stuList = new Student[num];//
        int index=0;

        //create a loop to read all info in text file
        while(inF.hasNextLine()){
            String studentName = inF.nextLine();
            Course[] studentSchedule = new Course [8]; // all values start as null
            for(int i=0; i<8; i++){ //runs once for each course

                String teacherName = inF.nextLine();
                String courseName = inF.nextLine();
                String studentGrade = inF.nextLine();
                int period = inF.nextInt();
                inF.nextLine(); //dummy read

                //check if there is another character to scan
                if(inF.hasNextLine()){
                    inF.nextLine();// consume the "/n" that remains
                }


                Course tempCourse;
                //test if the grade is "None"
                if(studentGrade.endsWith("None")) {
                     tempCourse = new Course(courseName, period);
                }
                else{
                //create course object
                 tempCourse = new Course(teacherName,studentGrade,courseName,period);
                //add course object to the studentSchedule array
            }
                studentSchedule[i] = tempCourse;

            Student stu = new Student(studentName,studentSchedule);
            //add the student to stuList
            stuList[index] = stu;
            index++;
        }
        //call the printAll method to display all students
        printAll(stuList);
    }


}

    private static void printAll(Student[] stuList) {
        for(int i=0; i<stuList.length; i++){
            if(stuList[i] != null){
                System.out.println(stuList[i]);
            }
        }
    }

}

