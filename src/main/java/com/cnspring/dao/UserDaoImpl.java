package com.cnspring.dao;

import com.cnspring.entity.User;

public class UserDaoImpl implements UserDao{
  public void save(User user){
    System.out.println("保存用户信息到数据库");
  }
  public void speaking(User user){
    System.out.println(user.getUsername()+"说: "+"“"+user.getUserSpeaking()+"”");
  }
}
