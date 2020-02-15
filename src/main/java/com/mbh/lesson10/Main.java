/**
 * 
 */
package com.mbh.lesson10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.mbh.lesson10.beans.BeanA;
import com.mbh.lesson10.configuration.Configuration;

/**
 * @author amineboufatah
 *
 */
public class Main {


  /**
   * In this main, we are trying to understand how spring works when an Eager bean has a Lazy child.
   * The lazy child is not created until the getBean is invoked, Spring creates a CGLIB proxy
   * instead Bean A is the parent bean, BeanB is also an eager bean whereas BeanC and BeanD are both
   * Lazy beans
   * 
   * @param args
   */
  public static void main(String[] args) {
    ApplicationContext application = new AnnotationConfigApplicationContext(Configuration.class);
    BeanA beanA = application.getBean(BeanA.class);
    System.out.println("At this point, beanC is not created. Only a proxy is created");
    System.out.println(beanA.getBeanB().getBeanC());
    System.out.println("because we invoked getBeanC() the container initialized it");
    System.out.println("===========================================================");
    System.out.println("At this point, beanD is not created. Only a proxy is created");
    System.out.println(beanA.getBeanB().getBeanC().getBeanD());
    System.out.println("because we invoked getBeanD() the container initialized it");
  }

}
