/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.RecordKeeping;

/**
 *
 * @author ryan3
 */
// declare variables / states
public class Student extends Person{
    private int studentID;
    private String classCode;
    private int assignment1;
    private int assignment2;
    private int exam;
    private int total;
    
// default constructor
   public Student(){
       
   } 

   // constructor for student results
public Student(int studentID, int assignment1, int assignment2, int exam, int total ){
       this.studentID = studentID;
       this.assignment1 = assignment1;
       this.assignment2 = assignment2;
       this.exam = exam;
       this.total = total;
   }    
   
// constructor for student information
   public Student(int studentID, String firstName, String surname, String email, String PPSN, String DOB, String addressL1, String addressL2, String county, String eircode, int phoneNumber, String classCode) {
     
      this.studentID = studentID;
      this.firstName = firstName;
      this.surname = surname;
      this.email = email;
      this.PPSN = PPSN;
      this.DOB = DOB;
      this.addressL1 = addressL1;
      this.addressL2 = addressL2;
      this.county = county;
      this.eircode = eircode;
      this.phoneNumber = phoneNumber;
      this.classCode = classCode;
              
   }
  
    /**
     * @return the studentID
     */
    public int getStudentID() {
        return studentID;
    }

    /**
     * @param studentID the studentID to set
     */
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }


    /**
     * @return the classCode
     */
    public String getClassCode() {
        return classCode;
    }

    /**
     * @param classCode the classCode to set
     */
    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    /**
     * @return the assignment1
     */
    public int getAssignment1() {
        return assignment1;
    }

    /**
     * @param assignment1 the assignment1 to set
     */
    public void setAssignment1(int assignment1) {
        this.assignment1 = assignment1;
    }

    /**
     * @return the assignment2
     */
    public int getAssignment2() {
        return assignment2;
    }

    /**
     * @param assignment2 the assignment2 to set
     */
    public void setAssignment2(int assignment2) {
        this.assignment2 = assignment2;
    }

    /**
     * @return the exam
     */
    public int getExam() {
        return exam;
    }

    /**
     * @param exam the exam to set
     */
    public void setExam(int exam) {
        this.exam = exam;
    }

    /**
     * @return the result
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param total the result to set
     */
    public void setTotal(int total) {
        this.total = total;
    }
}
