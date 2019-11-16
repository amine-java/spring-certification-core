/**
 * 
 */
package com.mbh.lesson1;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * DummyService used to test the spring IoC container
 * 
 * @author amineboufatah
 *
 */
public class DummyService implements InitializingBean, DisposableBean {

  private String name;

  public void setName(String name) {
    this.name = name;
  }

  public void print() {
    System.out.println("LessonService -- " + name);
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.springframework.beans.factory.DisposableBean#destroy()
   */
  public void destroy() throws Exception {
    System.out.println("Bean to be destroyed..");
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
   */
  public void afterPropertiesSet() throws Exception {
    System.out.println("Bean to be set..");
  }

  /**
   * This method is called at initialization. There is a coupling between this method and the config
   * file this means that if this method signature changes then the dev should update the
   * beans-lessons1.xml
   */
  public void initMethod() {
    System.out.println("Init Method through xml configuration");
  }

  /**
   * This method is called at destroy process. There is a coupling between this method and the
   * config file this means that if this method signature changes then the dev should update the
   * beans-lessons1.xml
   */
  public void destroyMethod() {
    System.out.println("Destroy Method through xml configuration");
  }

}
