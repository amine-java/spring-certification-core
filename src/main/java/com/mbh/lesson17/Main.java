/**
 * 
 */
package com.mbh.lesson17;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.mbh.lesson17.configuration.Configuration;
import com.mbh.lesson17.services.BusinessLogic;

/**
 * @author amineboufatah
 *
 */
public class Main {

  /**
   * @param args
   */
  public static void main(String[] args) {
    ApplicationContext application = new AnnotationConfigApplicationContext(Configuration.class);
    BusinessLogic businessLogic = application.getBean(BusinessLogic.class);
    businessLogic.doSomething();
    businessLogic.doOtherThing();
    ((ConfigurableApplicationContext) application).close();
  }
}
