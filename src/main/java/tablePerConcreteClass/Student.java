package tablePerConcreteClass;
//Subclass Student
public class Student extends Person {
 private String major;
 private Double gpa;

 // Getters and Setters
 public String getMajor() {
     return major;
 }

 public void setMajor(String major) {
     this.major = major;
 }

 public Double getGpa() {
     return gpa;
 }

 public void setGpa(Double gpa) {
     this.gpa = gpa;
 }
}
