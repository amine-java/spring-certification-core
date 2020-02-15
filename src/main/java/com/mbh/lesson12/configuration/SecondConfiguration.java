/**
 * 
 */
package com.mbh.lesson12.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.mbh.lesson12.beans.BeanB;

/**
 * @author amineboufatah
 *
 */
@Configuration
public class SecondConfiguration {

  @Bean
  public BeanB bean() {
    return new BeanB();
  }
}
