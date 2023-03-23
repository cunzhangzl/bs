package cn.edu.wbu.bs.dao;

import cn.edu.wbu.bs.beans.User;

public interface UserDao {
    public User findAll();
    public User findById(String userId);

}
