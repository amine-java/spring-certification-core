/**
 * 
 */
package com.mbh.lesson4;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
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
   * In the <list/>, <set/>, <map/>, and <props/> elements, you set the properties and arguments of
   * the Java Collection types List, Set, Map, and Properties, respectively.
   * 
   * @param args
   */
  public static void main(String[] args) {

    ApplicationContext applicationContext =
        new ClassPathXmlApplicationContext("lesson4/beans-lesson4.xml");

    SpringCollection springCollection =
        applicationContext.getBean("springCollection", SpringCollection.class);

    System.out.println("#### Properties emails ");
    Properties emails = springCollection.getEmails();
    System.out.println("The admin email is: " + emails.getProperty("admin"));
    System.out.println("The manager email is: " + emails.getProperty("manager"));

    System.out.println("#### List of names ");
    List<String> names = springCollection.getNames();
    for (String name : names) {
      System.out.println(name);
    }

    System.out.println("### Set of countries");
    Set<String> countries = springCollection.getCountries();
    System.out.println(countries.toString());

    System.out.println("### Map of elements");
    Map<String, String> map = springCollection.getElements();
    System.out.println(map.values());

    ((ConfigurableApplicationContext) applicationContext).close();

  }

}
