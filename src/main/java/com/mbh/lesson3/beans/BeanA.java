/**
 * 
 */
package com.mbh.lesson3.beans;

import org.springframework.stereotype.Component;

/**
 * @author amineboufatah
 *
 */
@Component
public class BeanA implements BeanInterface {


  public BeanA() {
    System.out.println("Creating BeanA");
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.mbh.lesson3.beans.Bean#print()
   */
  @Override
  public void print() {
    System.out.println("BEAN A");
  }

}
