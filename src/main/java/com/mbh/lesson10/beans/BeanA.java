/**
 * 
 */
package com.mbh.lesson10.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author amineboufatah
 *
 */
@Component
public class BeanA {

  @Autowired
  private BeanB beanB;

  public BeanA() {
    System.out.println("≤> BeanA constructor");
  }

  public BeanB getBeanB() {
    return beanB;
  }

  public void setBeanB(BeanB beanB) {
    this.beanB = beanB;
  }

}
