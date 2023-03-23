package cn.edu.wbu.bs.service.impl;


import cn.edu.wbu.bs.beans.Manager;
import cn.edu.wbu.bs.beans.ResultVO;

import cn.edu.wbu.bs.beans.User;
import cn.edu.wbu.bs.dao.ManagerDao;
import cn.edu.wbu.bs.dao.UserDao;
import cn.edu.wbu.bs.service.UserLoginService;
import cn.edu.wbu.bs.utils.MD5Utils;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class UserLoginServiceImpl implements UserLoginService {

    @Resource
    private ManagerDao managerDao;
    @Resource
    private UserDao userDao;

    @Override
    public ResultVO login(String username, String userpwd, String role) {
         //登录判断,判断身份，判断账号密码

        String password=null;
        if("manager".equals(role)){
            Manager byId = managerDao.findById(username);
            password = byId == null?null:byId.getManagerPwd();
        }else if("user".equals(role)){
            User byId = userDao.findById(username);
            password = byId == null?null:byId.getUsersPwd();
        }
        userpwd = MD5Utils.md5(userpwd);
        if(password==null){
           return new ResultVO(10001,"账号不存在",null);
        }else if(password.equals(userpwd)){
            return new ResultVO(10000,"登录成功",null);
        }else {
            return  new ResultVO(10002,"密码错误",null);
        }

    }
}
