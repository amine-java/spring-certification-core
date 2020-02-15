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
public class BeanB {

  @Autowired
  @Lazy
  private BeanC beanC;

  public BeanB() {
    System.out.println("≤> BeanB constructor");
  }


  public BeanC getBeanC() {
    return beanC;
  }

  public void setBeanC(BeanC beanC) {
    this.beanC = beanC;
  }

}
