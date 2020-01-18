/**
 * 
 */
package com.mbh.lesson16.configuration;

import org.springframework.context.annotation.Bean;
import com.mbh.lesson16.beans.BeanA;
import com.mbh.lesson16.beans.BeanB;
import com.mbh.lesson16.beans.BeanService;

/**
 * @author amineboufatah
 *
 */
@org.springframework.context.annotation.Configuration
public class Configuration {

  @Bean
  public BeanA beanA() {
    BeanA bean = new BeanA();
    bean.setBeanService(beanService());
    return bean;
  }

  @Bean
  public BeanB beanB() {
    BeanB bean = new BeanB();
    /**
     * This is a really bad practice. We should always call the method that creates the bean
     * (annotated with @Bean). This beanService won't be handled by the Spring Container
     **/
    bean.setBeanService(new BeanService());
    return bean;
  }

  @Bean
  public BeanService beanService() {
    return new BeanService();
  }

}
