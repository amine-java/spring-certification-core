/**
 * 
 */
package com.mbh.lesson3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author amineboufatah
 *
 */
public class Employe {

  private String name;

  @Autowired
  private Address addressByName;

  @Autowired
  @Qualifier("addressByType")
  private Address addressByType;

  @Autowired
  private Address addressByDefault;

  // This will be autowired using the constructor
  private Address addressByConstructor;

  public Employe() {

  }

  @Autowired
  public Employe(Address address) {
    this.addressByConstructor = address;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Address getAddressByName() {
    return addressByName;
  }

  public void setAddressByName(Address address) {
    this.addressByName = address;
  }

  public String toString() {
    StringBuilder str = new StringBuilder();
    str.append("Employe's name is: ").append(this.name).append(" AdressByName: ")
        .append(this.addressByName.toString()).append(" AdressByType: ")
        .append(this.addressByType.toString()).append(" AddressByDefault: ")
        .append(this.addressByDefault.toString()).append(" AddressByConstructor: ")
        .append(this.addressByConstructor.toString());

    return str.toString();
  }

}
