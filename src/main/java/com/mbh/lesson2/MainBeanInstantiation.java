/**
 * 
 */
package com.mbh.lesson2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author amineboufatah
 *
 */
public class MainBeanInstantiation {

  public static void main(String[] args) {

    ApplicationContext applicationContext =
        new ClassPathXmlApplicationContext("lesson2/beans-lesson2.xml");

    /**
     * GetBean using the bean name myUserService
     */
    applicationContext.getBean("myUserService", UserService.class).printUser();


    /**
     * GetBean using the bean name myOtherUserServiceName
     */
    applicationContext.getBean("myOtherUserServiceName", UserService.class).printUser();

    /**
     * GetBean using the bean name andAnotherOne
     */
    applicationContext.getBean("andAnotherOne", UserService.class).printUser();

    /**
     * GetBean using the bean alias aliasUserService
     */
    applicationContext.getBean("aliasUserService", UserService.class).printUser();

    /**
     * GetBean using the factory userServiceUsingFactory. This is the only case where we do not use
     * the "class" property.
     */
    applicationContext.getBean("userServiceUsingFactory", UserService.class).printUser();

    System.out.println("#### Bean Dependency Injection - Constructor");
    /**
     * 
     */
    applicationContext.getBean("anotherUserService", AnotherUserService.class).printUser();


    ((ConfigurableApplicationContext) applicationContext).close();
  }
}
