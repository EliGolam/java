package jt04_concurrencies;

public class Application {
  /* 
   * Computers are expected to run multiple systems in parallel at the same time. 
   * The way concurrent programming happens in Java is through Threads and Processes. 
   * 
   * Processes: Self-contained system that has its own runtime and memory space
   * A Process can have multiple threads, but at least one
   * Threads: Threads are an execution environment within the process that requires less resources
   * Threads share the process's resources, memory and files. This can cause efficient but potentially problematic communication
   * 
   * Each thread is a particular task
   * 
   * Multithreading: multiple threads running at the same time. 
   */

  /* Example */
  public static void main(String[] args) {
    int numThreads = 10; 
    for (int i = 0; i < numThreads; i++) {
      // METHOD 1: Extending Thread class
      Thread1 t1 = new Thread1(); 
      t1.start(); 

      // METHOD 2: Implementing Runnable Interface
      Thread t2 = new Thread(new Thread2()); 
      t2.start();

      // METHOD 3: Lambda implementation
      Runnable thread3 = () -> {
        System.out.println("Thread3 is running"); 
      };
      Thread t3 = new Thread(thread3);
      t3.start();
    }
  }
  /* Threads will run whenever they find Idle CPU. There will be no guaranteed order */
}
