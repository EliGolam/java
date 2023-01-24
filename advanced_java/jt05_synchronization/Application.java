package jt05_synchronization;

public class Application {
  public static void main(String[] args) {
    SynchronizedAccess syncAccess = new SynchronizedAccess(); // Avoids incorrect data access
    AsyncAccess asyncAccess = new AsyncAccess(); // Improves performance

    IAccess access = asyncAccess;

    Thread1 t1 = new Thread1(access);
    Thread t2 = new Thread(new Thread2(access));

    t1.start();
    t2.start();
  }
}

/* SYNCHRONISATION
 * Built around internal entity called Intrinsic Lock / Monitor
 * When a thread tries to work on a certain object it locks that object and makes 
 * it unavailable for the rest of the threads. 
 */
