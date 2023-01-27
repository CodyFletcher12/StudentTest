/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author cody
 */
public class PartTimeStudent extends Student {
    
    private int numOfCourse;
    
    public PartTimeStudent(int numOfCourse, String studentId, String studentName){
        super(studentId, studentName);
        this.numOfCourse = numOfCourse;
    }

    public int getNumOfCourse() {
        return numOfCourse;
    }
    public void setNumOfCourse(int course){
        this.numOfCourse = numOfCourse;
    }
}
