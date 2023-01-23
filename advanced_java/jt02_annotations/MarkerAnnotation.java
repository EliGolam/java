package jt02_annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // This indicates when the annotation will be active
@Target(ElementType.TYPE) // Where this annotation will be applied (Class, Method, Constructor, Type, etc.) 
// Interface annotation creates custom annotation
public @interface MarkerAnnotation {
  /* Marker Annotation */
  /*
   * Very high level information to the compiler
   */
}
