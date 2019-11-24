/**
 * 
 */
package com.mbh.lesson3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author amineboufatah
 *
 */
public class Main {

  /**
   * 
   * we will walk through spring bean autowire byName, byType, constructor and default Example.
   * autowire is an attribute of <bean> tag. This attribute defines how the autowing should be done.
   * The values of autowire attribute are byName, byType, constructor, no and default.
   * 
   * byName : Spring container looks for bean name same as property name of the class for
   * autowiring. byType : Spring container selects the bean by class type for autowiring.
   * constructor : Spring container uses constructor based autowiring. no : No Autowiring. Use ref
   * attribute to resolve dependency. default : The default autowiring is "no". Default autowiring
   * will inherit parent bean autowiring if nested.
   * 
   * @param args
   */
  public static void main(String[] args) {
    ApplicationContext applicationContext =
        new ClassPathXmlApplicationContext("lesson3/beans-lesson3.xml");

    Employe employe = applicationContext.getBean("employe", Employe.class);
    System.out.println(employe);

    Employe employe2 = applicationContext.getBean("anotherEmploye", Employe.class);
    System.out.println(employe2);

    Employe employe3 = applicationContext.getBean("anotherEmploye2", Employe.class);
    System.out.println(employe3);

    ((ConfigurableApplicationContext) applicationContext).close();

  }

}
