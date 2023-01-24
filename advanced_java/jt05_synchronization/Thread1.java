package jt05_synchronization;

public class Thread1 extends Thread {
  IAccess accessElement;
  int accessValue = 3; 

  // Constructors
  public Thread1(IAccess accessElement) {
    this.accessElement = accessElement;
  }


  @Override
  public void run() {
    try {
      accessElement.getMultiples(accessValue);
    }
    catch (Exception e) {
      System.out.println("Exception raised " + e); 
    }
  }
}
