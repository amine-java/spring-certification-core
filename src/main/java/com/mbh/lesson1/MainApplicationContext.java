/**
 * 
 */
package com.mbh.lesson1;

import java.io.IOException;
import java.util.Locale;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

/**
 * @author amineboufatah
 *
 */
public class MainApplicationContext {

  /**
   * To enhance BeanFactory functionality in a more framework-oriented style the context package
   * also provides the following functionality:
   * 
   * Access to messages in i18n-style, through the MessageSource interface.
   * 
   * Access to resources, such as URLs and files, through the ResourceLoader interface.
   * 
   * Event publication to beans implementing the ApplicationListener interface, through the use of
   * the ApplicationEventPublisher interface.
   * 
   * Loading of multiple (hierarchical) contexts, allowing each to be focused on one particular
   * layer, such as the web layer of an application, through the HierarchicalBeanFactory interface.
   * 
   * @param args
   */
  public static void main(String[] args) {

    /**
     * ApplicationContext resides in the spring context module * With ApplicationContext we can use
     * i18n
     * 
     * When an ApplicationContext is loaded, it automatically searches for a MessageSource bean
     * defined in the context. The bean must have the name messageSource. If such a bean is found,
     * all calls to the preceding methods are delegated to the message source. If no message source
     * is found, the ApplicationContext attempts to find a parent containing a bean with the same
     * name. If it does, it uses that bean as the MessageSource. If the ApplicationContext cannot
     * find any source for messages, an empty DelegatingMessageSource is instantiated in order to be
     * able to accept calls to the methods defined above.
     * 
     * Spring provides two MessageSource implementations, ResourceBundleMessageSource and
     * StaticMessageSource. Both implement HierarchicalMessageSource in order to do nested
     * messaging. The StaticMessageSource is rarely used but provides programmatic ways to add
     * messages to the source.
     * 
     */
    ApplicationContext applicationContext =
        new ClassPathXmlApplicationContext("lesson1/beans-lesson1.xml");
    DummyService dummyService = applicationContext.getBean("dummyService", DummyService.class);
    dummyService.print();

    String messageInEnglish =
        applicationContext.getMessage("greeting", new String[] {"John", "28"}, Locale.ENGLISH);
    System.out.println(messageInEnglish);

    String messageInFrench =
        applicationContext.getMessage("greeting", new String[] {"Steve", "26"}, Locale.FRENCH);
    System.out.println(messageInFrench);

    /**
     * ResourceLoader, this feature does not exist in BeanFactory container.
     */
    Resource resource = applicationContext.getResource("classpath:lesson1/file.txt");
    try {
      System.out.println("File's URI: " + resource.getURI().toString());
    } catch (IOException e) {
      e.printStackTrace();
    }

    ((ConfigurableApplicationContext) applicationContext).close();
  }
}
