package cn.edu.wbu.bs.service;

import cn.edu.wbu.bs.beans.ResultVO;

public interface UserLoginService {
    public ResultVO login(String username,String userpwd,String role);

}
