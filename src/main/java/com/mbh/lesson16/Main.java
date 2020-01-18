/**
 * 
 */
package com.mbh.lesson16;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.mbh.lesson16.beans.BeanA;
import com.mbh.lesson16.beans.BeanB;
import com.mbh.lesson16.configuration.Configuration;

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
    BeanA beanA = application.getBean(BeanA.class);
    BeanB beanB = application.getBean(BeanB.class);
    // This will give 'false'
    System.out.println(beanA.getBeanService() == beanB.getBeanService());
  }
}
