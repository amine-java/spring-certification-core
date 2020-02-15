/**
 * 
 */
package com.mbh.lesson7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.mbh.lesson7.configuration.Configuration;
import com.mbh.lesson7.service.MyService;

/**
 * Main class
 * 
 * @author amineboufatah
 *
 */
public class Main {

  /**
   * With this test, I am trying to figure out which injection order spring performs when creating a
   * bean and setting its dependencies.
   * 
   * I create 3 daos inside a service, and I perform the 3 tyoes of injection supported by spring:
   * field injection, setter injection, constructor injection.
   * 
   * @param args
   */
  public static void main(String[] args) {
    // Launch the application context
    ApplicationContext app = new AnnotationConfigApplicationContext(Configuration.class);
    // Get the MyServiceBean
    MyService application = app.getBean(MyService.class);
    // Test that all daos have been set
    application.testAllDao();

    /**
     * With this test we can confirm that the order when injecting properties/beans is as follows:
     * 
     * # Constructor injection # Field injection # Setter injection
     * 
     */
  }

}
