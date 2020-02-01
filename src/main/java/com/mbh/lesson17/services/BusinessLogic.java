/**
 * 
 */
package com.mbh.lesson17.services;

import com.mbh.lesson17.annotations.Rule;
import com.mbh.lesson17.annotations.Rules;

/**
 * @author amineboufatah
 *
 */
public class BusinessLogic {


  @Rule(useCase = "CODE_1652")
  @Rule(useCase = "CODE_1676", description = "This can be used for a short description")
  public void doSomething() {
    System.out.println("Implementation");
  }

  @Rules({@Rule(useCase = "CODE_1234"), @Rule(useCase = "CODE_1442")})
  public void doOtherThing() {
    System.out.println("Implementation");
  }


}
