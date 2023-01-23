package jt03_serializable;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;

public class Student implements Serializable {
  private static final long serialVersionUID = 1L; // To uniquely identify the object. Every time the object is mutated, the ID will change

  private String firstName; 
  private String lastName;
  private LocalDate birthday; 

  // Transient -> These elements are not serialized
  transient int studentId; 

  Student(String firstName, String lastName, String birthday) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthday = LocalDate.parse(birthday); 
  }

  public String getName() {
    return firstName + " " + lastName;
  }

  public int getAge() {
    return Period.between(birthday, LocalDate.now()).getYears();
  }

  @Override
  public String toString() {
    return String.format("Student: %s - Age: %d", this.getName(), this.getAge()); 
  }

}
