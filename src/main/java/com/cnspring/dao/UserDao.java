package com.cnspring.dao;

import com.cnspring.entity.User;

public interface UserDao {
  public void save(User user);
  public void speaking(User user);
}