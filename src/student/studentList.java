/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author User
 */
public class studentList {
    public static void main(String[] args) {
        //Student s1 = new Student ("s1", "Aravin");
        Student[] studentList = new Student[3];
        studentList[0] = new Student ("s1", "Aravin");
        studentList[1] = new Student ("s2", "John");
        studentList[2] = new Student ("s3", "Popeye");
        
        for(int i=0; i < studentList.length; i++ ) {
            System.out.println(studentList[i].getStudentName);
        }
        
    }
}
