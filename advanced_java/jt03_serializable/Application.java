package jt03_serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Application {
  public static void main(String[] args) {
    /*
     * SERIALIZABLE OBJECTS
     * To serialize an object means to convert its state to a byte stream so that the byte stream can be reverted
     * back into a copy of the object. This is necessary to be able to send the objects through the network. 
     */

    Student ashleyDiaz = new Student("Ashley", "Diaz", "2000-11-27"); 

    String filename = "C:\\development\\learning\\java\\java-first-steps\\advanced_java\\jt03_serializable\\Test.txt";
    FileOutputStream fileOut = null;
    ObjectOutputStream objOut = null;

    // SERIALIZATION
    try {
      fileOut = new FileOutputStream(filename); 
      objOut = new ObjectOutputStream(fileOut); 
      objOut.writeObject(ashleyDiaz);

      fileOut.close();
      objOut.close();
    }
    catch (IOException e) {
      System.err.println("An IOException has occurred" + e.toString());
      System.exit(e.hashCode());
    }

    System.out.println("The Student object has been serialized");

    // DESEREALIZATION
    FileInputStream fileIn = null; 
    ObjectInputStream objIn = null; 

    try {
      fileIn = new FileInputStream(filename);
      objIn = new ObjectInputStream(fileIn); 

      Student student = (Student) objIn.readObject(); // Read the object and explicitly cast it as Student object because otherwise it returns a generale object
      System.out.println("Object has been deserialized");
      System.out.printf("Student retrieved - %s\n", student.toString());
      
      objIn.close();
      fileIn.close();
    }
    catch (IOException e) {
      System.err.printf("An IOException has occurred. %s\n", e.toString()); 
      System.exit(e.hashCode());
    }
    catch (ClassNotFoundException e) {
      System.err.printf("ClassNotFoundException: %s\n", e.toString());
      System.exit(e.hashCode());
    }
  }
}
