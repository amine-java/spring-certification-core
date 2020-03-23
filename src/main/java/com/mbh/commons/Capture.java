/**
 * 
 */
package com.mbh.commons;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Component;

/**
 * This component is used in the AOP lessons, it helps to save all the triggered PointCuts and
 * JointPoints for better understanding the AOP concepts
 * 
 * @author amineboufatah
 *
 */
@Component
public class Capture {

  /** We store the pointCuts and joinPoints inside a map **/
  private Map<String, String> captures = new HashMap<>();

  /**
   * Stores the pointCut as a key and the jointPoint's method signature as a value
   * 
   * @param key
   * @param value
   */
  public void captureTrace(String key, String value) {
    if (captures.containsKey(key)) {
      StringBuilder str = new StringBuilder().append(captures.get(key)).append("\n").append(value);
      captures.put(key, str.toString());
    } else {
      captures.put(key, value);
    }
  }

  /**
   * Prints all captures
   */
  public void printCaptures() {
    printHeader();
    for (String key : captures.keySet()) {
      String value = captures.get(key);
      System.out.println("—————————— " + key + "——————————");
      System.out.println(value);
    }
    printFooter();
  }

  /**
   * Prints a header
   */
  private void printHeader() {
    System.out.println("<>-------------------------------<>");
    System.out.println("<>-------------------------------<>");
    System.out.println("<>-- B E G I N - C A P T U R E --<>");
    System.out.println("<>-------------------------------<>");
    System.out.println("<>-------------------------------<>");
  }

  /**
   * Prints a footer
   */
  private void printFooter() {
    System.out.println("<>-------------------------------<>");
    System.out.println("<>-------------------------------<>");
    System.out.println("<>---- E N D - C A P T U R E ----<>");
    System.out.println("<>-------------------------------<>");
    System.out.println("<>-------------------------------<>");
  }

}
