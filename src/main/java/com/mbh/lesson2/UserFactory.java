/**
 * 
 */
package com.mbh.lesson2;

/**
 * @author amineboufatah
 *
 */
public class UserFactory {

  private static UserService userService = new UserService();

  private static UserDao userDao = new UserDao();

  private UserFactory() {}

  public UserService createUserService() {
    return userService;
  }

  public UserDao createUserDao() {
    return userDao;
  }
}
