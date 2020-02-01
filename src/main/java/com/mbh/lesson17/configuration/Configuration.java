/**
 * 
 */
package com.mbh.lesson17.configuration;

import org.springframework.context.annotation.Bean;
import com.mbh.lesson17.services.BusinessLogic;

/**
 * @author amineboufatah
 *
 */
@org.springframework.context.annotation.Configuration
public class Configuration {

  @Bean
  public BusinessLogic businessLogic() {
    return new BusinessLogic();
  }
}
