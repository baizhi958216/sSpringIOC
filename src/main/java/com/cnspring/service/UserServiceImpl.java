package com.cnspring.service;

import com.cnspring.dao.UserDao;
import com.cnspring.entity.User;

public class UserServiceImpl implements UserService {
  private UserDao dao;

  public UserServiceImpl() {
  }

  public UserServiceImpl(UserDao dao) {
    this.dao = dao;
  }

  public void addNewUser(User user) {
    dao.save(user);
  }

  public void userSpeaking(User user) {
    dao.speaking(user);
  }

  public UserDao getDao(){
    return dao;
  }

  public void setDao(UserDao dao){
    this.dao = dao;
  }
}
