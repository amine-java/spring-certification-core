/**
 * 
 */
package com.mbh.commons.services;

/**
 * @author amineboufatah
 *
 */
public class CalculatorService {

  public int addition(int a, int b) {
    return a + b;
  }

  public int multiply(int a, int b) {
    return a * b;
  }

  public int minus(int a, int b) {
    return a - b;
  }

  public int divide(int a, int b) {
    if (b == 0) {
      throw new IllegalArgumentException("Division by zero");
    }
    return a / b;
  }

}
