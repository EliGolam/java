package jt05_synchronization;

public class SynchronizedAccess implements IAccess {
  int iterations = 5; 

  @Override
  public void getMultiples(int n) {
    // Synchronized keyword locks the object to the specific Thread
    synchronized (this) {
      for(int i = 0; i < iterations; i++) {
        System.out.println(n * i); 

        try {
          Thread.sleep(400); // Pause current thread for 400 ms to leave the CPU idle
        } 
        catch (Exception e) {
          System.err.println("Exception: " + e); 
        }
      }
    }
  }
}
