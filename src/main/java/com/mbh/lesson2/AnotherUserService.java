/**
 * 
 */
package com.mbh.lesson2;

/**
 * @author amineboufatah
 *
 */
public class AnotherUserService {

  private UserDao userDao;

  public AnotherUserService(UserDao userDao) {
    this.userDao = userDao;
  }

  public void printUser() {
    this.userDao.printUser();
  }

}
