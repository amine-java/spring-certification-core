/**
 * 
 */
package com.mbh.lesson12;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.mbh.lesson12.beans.BeanA;
import com.mbh.lesson12.beans.BeanB;
import com.mbh.lesson12.configuration.Configuration;


/**
 * @author amineboufatah
 *
 */
public class Main {

  /**
   * In this example, we're proving that Spring will take into account the last bean encountered in
   * case 2 or more beans have the same id/name. Here we are defining 2 different beans in 2
   * different configuration files but both beans have the same name.
   * 
   * @param args
   */
  public static void main(String[] args) {
    ApplicationContext application = new AnnotationConfigApplicationContext(Configuration.class);
    Object o = application.getBean("bean");
    System.out.println("Object retrieved is of type BeanA: " + (o instanceof BeanA));
    System.out.println("Object retrieved is of type BeanB: " + (o instanceof BeanB));
  }

}
