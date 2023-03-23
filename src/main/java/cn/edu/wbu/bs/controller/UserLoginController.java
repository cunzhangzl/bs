package cn.edu.wbu.bs.controller;

import cn.edu.wbu.bs.beans.ResultVO;
import cn.edu.wbu.bs.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserLoginController {
      @Resource
    private UserLoginService userLoginService;

      @PostMapping("/login")
    public ResultVO login(String username,String userpwd,String role){
          ResultVO login = userLoginService.login(username, userpwd, role);
          return login;
      }
}
