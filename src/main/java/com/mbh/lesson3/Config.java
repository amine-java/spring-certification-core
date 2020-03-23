/**
 * 
 */
package com.mbh.lesson3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.mbh.lesson3.beans.BeanA;
import com.mbh.lesson3.beans.BeanB;
import com.mbh.lesson3.beans.BeanInterface;

/**
 * @author amineboufatah
 *
 */
@Configuration
public class Config {

  @Bean
  public BeanInterface beanA() {
    return new BeanA();
  }

  @Bean
  public BeanInterface beanB() {
    return new BeanB();
  }
}
