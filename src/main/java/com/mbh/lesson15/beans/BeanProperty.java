/**
 * 
 */
package com.mbh.lesson15.beans;

/**
 * @author amineboufatah
 *
 */
public class BeanProperty {

  private String name = "Accesor";

  private int counter = 12;

  private Integer nullMember = null;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getCounter() {
    return counter;
  }

  public void setCounter(int counter) {
    this.counter = counter;
  }

  public Integer getNullMember() {
    return nullMember;
  }

  public void setNullMember(Integer nullMember) {
    this.nullMember = nullMember;
  }


}
