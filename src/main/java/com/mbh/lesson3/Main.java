/**
 * 
 */
package com.mbh.lesson3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author amineboufatah
 *
 */
public class Main {

  public static void main(String[] args) {
    /**
     * In this method, I am trying to prove that even if our config file constructs 2 beans of same
     * type there won't be any error when launching the app. The error happens only when we retrieve
     * the bean by type only (See instruction with exception)
     */
    ApplicationContext application = new AnnotationConfigApplicationContext(Config.class);
    System.out.println("Retrieve Beans from ApplicationContext");
    application.getBean("beanA", com.mbh.lesson3.beans.BeanInterface.class).print();
    application.getBean("beanB", com.mbh.lesson3.beans.BeanInterface.class).print();
    try {
      // It will throw an exception because there are 2 implementations of the Bean Class
      application.getBean(com.mbh.lesson3.beans.BeanInterface.class).print();
    } catch (Exception e) {
      System.out
          .println("Exception thrown when retrieving Bean of class Bean.class: " + e.getMessage());
    }

    /**
     * Even if we have 2 implementations of BeanInterface class, this still works because Spring
     * first tries to resolve the dependency by type then if it finds more than one implem, it will
     * try to get it by name. beanA is the name of our Bean
     **/
    new AnnotationConfigApplicationContext(ConfigAnnotation.class);
  }

}
