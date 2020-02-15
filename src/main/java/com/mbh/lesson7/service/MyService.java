/**
 * 
 */
package com.mbh.lesson7.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mbh.lesson7.dao.MyDaoOne;
import com.mbh.lesson7.dao.MyDaoThree;
import com.mbh.lesson7.dao.MyDaoTwo;

/**
 * MyService class
 * 
 * @author amineboufatah
 *
 */
@Service
public class MyService {

  /** dao1 will be used for constructor injection **/
  private MyDaoOne dao1;

  /** dao2 will be used for field injection **/
  @Autowired
  private MyDaoTwo dao2;

  /** dao3 will be used for setter injection **/
  private MyDaoThree dao3;


  /**
   * Constructor MyService, because it's the only constructor, spring will perform a constructor
   * injection by default without @Autowired needed .
   * 
   * @param dao1
   */
  public MyService(MyDaoOne dao1) {
    System.out.println("#### Constructor injection");
    System.out.println("is Dao2 already injected " + (dao2 != null));
    System.out.println("Injecting DAO1");
    this.dao1 = dao1;
  }

  @Autowired
  public void setDao3(MyDaoThree dao3) {
    System.out.println("#### Setter injection");
    System.out.println("is Dao2 already injected " + (dao2 != null));
    System.out.println("Injecting DAO3");
    this.dao3 = dao3;
  }

  /**
   * Just tests if all daos were set successfuly
   */
  public void testAllDao() {
    System.out.println("### TEST ALL DAOS");
    System.out.println("Dao1 up and running: " + (dao1 != null));
    System.out.println("Dao2 up and running: " + (dao2 != null));
    System.out.println("Dao3 up and running: " + (dao3 != null));
  }

}
