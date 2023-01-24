package jt05_synchronization;

public class Thread2 implements Runnable {
  IAccess accessElement;
  int accessValue = 10; 

  public Thread2(IAccess accessElement) {
    this.accessElement = accessElement;
  }

  @Override
  public void run() {
    try {
      accessElement.getMultiples(accessValue);
    }
    catch (Exception e) {
      System.out.println("Exception: " + e);
    }
  }
}
