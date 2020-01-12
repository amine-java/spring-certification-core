/**
 * 
 */
package com.mbh.lesson15;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.mbh.lesson15.beans.BeanPropertyAccessor;
import com.mbh.lesson15.configuration.Configuration;

/**
 * @author amineboufatah
 *
 */
public class SpelMain {

  /**
   * @param args
   */
  public static void main(String[] args) {
    ApplicationContext application = new AnnotationConfigApplicationContext(Configuration.class);
    System.out.println(application.getBean(BeanPropertyAccessor.class));
  }

}
