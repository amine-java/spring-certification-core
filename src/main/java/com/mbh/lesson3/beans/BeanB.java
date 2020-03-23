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
public class BeanB implements BeanInterface {

  public BeanB() {
    System.out.println("Creating BeanB");
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.mbh.lesson3.beans.Bean#print()
   */
  @Override
  public void print() {
    System.out.println("BEAN B");
  }

}
