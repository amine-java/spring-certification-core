/**
 * 
 */
package com.mbh.lesson12.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.mbh.lesson12.beans.BeanA;

/**
 * @author amineboufatah
 *
 */
@Configuration
public class FirstConfiguration {

  @Bean
  public BeanA bean() {
    return new BeanA();
  }

}
