/**
 * 
 */
package com.mbh.lesson15.beans;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author amineboufatah
 *
 */
public class BeanPropertyAccessor {


  @Value("#{new java.lang.Integer(10)}")
  private Integer max;

  @Value("#{beanProperty.name}")
  private String username;

  @Value("#{new java.lang.Integer(beanProperty.counter / 2)}")
  private Integer min;

  @Value("#{new java.lang.Integer(beanProperty.nullMember ?: 150)}")
  private Integer defaultIfNull;

  @Override
  public String toString() {
    return "BeanPropertyAccessor [max=" + max + ", username=" + username + ", min=" + min
        + ", defaultIfNull=" + defaultIfNull + "]";
  }
}
