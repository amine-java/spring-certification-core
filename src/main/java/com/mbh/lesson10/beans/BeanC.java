/**
 * 
 */
package com.mbh.lesson10.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @author amineboufatah
 *
 */
@Component
@Lazy
public class BeanC {

  @Autowired
  @Lazy
  private BeanD beanD;


  private String status = null;

  public BeanC() {
    System.out.println("≤> BeanC constructor");
    this.status = "Ready";
  }

  public BeanD getBeanD() {
    return beanD;
  }

  @Override
  public String toString() {
    return "BeanC [status=" + status + "]" + " MemoryAdress:" + super.toString();
  }

}
