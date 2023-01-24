package jt04_concurrencies;

public class Thread2 implements Runnable {
  public void run() {
    try {
      System.out.println("Thread2 is running"); 
    }
    catch (Exception e) {
      System.out.println("Exception: " + e);
    }
  }
}
