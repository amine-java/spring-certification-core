/**
 * 
 */
package com.mbh.lesson17.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author amineboufatah
 *
 */
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Repeatable(Rules.class)
public @interface Rule {

  /** The description is optional **/
  String description() default "";

  /** The useCase is mandatory **/
  String useCase();

}
