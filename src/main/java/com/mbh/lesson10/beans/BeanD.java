/**
 * 
 */
package com.mbh.lesson10.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @author amineboufatah
 *
 */
@Component
@Lazy
public class BeanD {

  public BeanD() {
    System.out.println("≤> BeanD Constructor");
  }

  @Override
  public String toString() {
    return "BeanD " + " MemoryAdress:" + super.toString();
  }

}
