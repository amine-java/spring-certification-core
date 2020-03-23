/**
 * 
 */
package com.mbh.lesson3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.mbh.lesson3.beans.BeanInterface;

/**
 * @author amineboufatah
 *
 */
@Configuration
@ComponentScan("com.mbh.lesson3.beans")
public class ConfigAnnotation {

  /**
   * Even if we have 2 implementations of Bean class, this still works because Spring first tries to
   * resolve the dependency by type then if it finds more than one, it will try to get it by name
   * beanA is the name of our Bean
   * 
   * @param beanA
   * @return
   */
  @Bean
  public String getBeanName(BeanInterface beanA) {
    beanA.print();
    return "dummy";
  }
}
