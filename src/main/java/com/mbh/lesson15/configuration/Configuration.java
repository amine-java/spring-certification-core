/**
 * 
 */
package com.mbh.lesson15.configuration;

import org.springframework.context.annotation.Bean;
import com.mbh.lesson15.beans.BeanProperty;
import com.mbh.lesson15.beans.BeanPropertyAccessor;

/**
 * @author amineboufatah
 *
 */
@org.springframework.context.annotation.Configuration
public class Configuration {

  @Bean
  public BeanProperty beanProperty() {
    return new BeanProperty();
  }

  @Bean
  public BeanPropertyAccessor beanPropertyAccessor() {
    return new BeanPropertyAccessor();
  }

}
