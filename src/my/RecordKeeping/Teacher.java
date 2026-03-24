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
public class Teacher extends Person{
    private int teacherID;
    private String module;

    // default constructor
   public Teacher(){
       
   }    
    // constructor for teacher information
   public Teacher (int teacherID, String firstName, String surname, String email, String PPSN, String DOB, String addressL1, String addressL2, String county, String eircode, int phoneNumber, String module) {
      this.teacherID = teacherID;
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
      this.module = module;       
   }

    // getters and setters
    /**
     * @return the teacherID
     */
    public int getTeacherID() {
        return teacherID;
    }

    /**
     * @param teacherID the teacherID to set
     */
    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    
    /**
     * @return the module
     */
    public String getModule() {
        return module;
    }

    /**
     * @param module the module to set
     */
    public void setModule(String module) {
        this.module = module;
    }
}
