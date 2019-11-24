/**
 * 
 */
package com.mbh.lesson2;

/**
 * @author amineboufatah
 *
 */
public class UserService {

  private UserDao userDao;


  public void printUser() {
    userDao.printUser();
  }

  public UserDao getUserDao() {
    return userDao;
  }

  public void setUserDao(UserDao userDao) {
    this.userDao = userDao;
  }


}
