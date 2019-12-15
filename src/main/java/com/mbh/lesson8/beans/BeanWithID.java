/**
 * 
 */
package com.mbh.lesson8.beans;

import org.springframework.stereotype.Component;

/**
 * @author amineboufatah
 *
 */
@Component
public class BeanWithID extends ProcessingBean {

  public BeanWithID() {
    this.setId("THIS-IS-AN-ID");
  }

}
