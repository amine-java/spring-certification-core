/**
 * 
 */
package com.mbh.lesson8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.mbh.lesson8.beans.BeanWithID;
import com.mbh.lesson8.beans.BeanWithoutID;
import com.mbh.lesson8.configuration.Configuration;

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
    BeanWithoutID beanWithoutID = application.getBean(BeanWithoutID.class);
    BeanWithID beanWithID = application.getBean(BeanWithID.class);

    /**
     * beanWithoutID will be processed by the BeanPostProcessors, they will add a default ID as well
     * as append a date in milis
     **/
    System.out.println(beanWithoutID);

    /**
     * beanWithID will only be processed by AppendDateBeanPostProcessor
     **/
    System.out.println(beanWithID);
  }

}
