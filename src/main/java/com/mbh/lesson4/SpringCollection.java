/**
 * 
 */
package com.mbh.lesson4;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author amineboufatah
 *
 */
public class SpringCollection {

  private Properties emails;

  private List<String> names;

  private Map<String, String> elements;

  private Set<String> countries;

  public Properties getEmails() {
    return emails;
  }

  public void setEmails(Properties emails) {
    this.emails = emails;
  }

  public List<String> getNames() {
    return names;
  }

  public void setNames(List<String> names) {
    this.names = names;
  }

  public Map<String, String> getElements() {
    return elements;
  }

  public void setElements(Map<String, String> elements) {
    this.elements = elements;
  }

  public Set<String> getCountries() {
    return countries;
  }

  public void setCountries(Set<String> countries) {
    this.countries = countries;
  }

}
