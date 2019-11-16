/**
 * 
 */
package com.mbh.lesson1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author amineboufatah
 *
 */
public class MainBeanFactory {

  /**
   * @param args
   */
  public static void main(String[] args) {

    /**
     * Bean Factory is in the spring beans module
     * 
     */
    ClassPathResource resource = new ClassPathResource("lesson1/beans-lesson1.xml");
    BeanFactory beanFactory = new XmlBeanFactory(resource);
    DummyService dummyService = (DummyService) beanFactory.getBean("dummyService");
    dummyService.print();
  }

}
