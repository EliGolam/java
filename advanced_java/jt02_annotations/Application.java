package jt02_annotations;

import java.lang.reflect.Method;

public class Application {
  public static void main(String[] args) throws Exception {
    /*
     * ANNOTATIONS
     * Metadata to the java compiler about the program that is not part of the program itself
     * They provide additional information
     * @override is an annotation
     * Annotation always start with @
     * Without the annotation the Java compiler will need to do some extra processing to figure out
     * what the program is trying to do.
     * It can save some compiler processing time
     */

    Application app = new Application();
    Method methodVal = app.getClass().getMethod("testAnnotation"); 

    MyCustomAnnotation myCustomAnnotation = methodVal.getAnnotation(MyCustomAnnotation.class);
    System.out.printf("Annotation value is %d", myCustomAnnotation.value());
  }

  @MyCustomAnnotation(value = 13)
  public void testAnnotation() {
    System.out.println("My Custom Annotation Test");
  }
}
