/**
 * 
 */
package com.mbh.lesson1;

import java.util.Locale;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author amineboufatah
 *
 */
public class MainApplicationContext {

  /**
   * @param args
   */
  public static void main(String[] args) {

    /**
     * ApplicationContext resides in the spring context module
     * 
     */
    ApplicationContext applicationContext =
        new ClassPathXmlApplicationContext("lesson1/beans-lesson1.xml");
    DummyService lessonService2 = (DummyService) applicationContext.getBean("lessonService");
    lessonService2.print();

    /**
     * With ApplicationContext we can use i18n
     */
    String messageInEnglish =
        applicationContext.getMessage("greeting", new String[] {"John", "28"}, Locale.ENGLISH);
    System.out.println(messageInEnglish);

    String messageInFrench =
        applicationContext.getMessage("greeting", new String[] {"Steve", "26"}, Locale.FRENCH);
    System.out.println(messageInFrench);

  }
}
