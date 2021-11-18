package com.example.loginmall8010.controller;

import cn.dev33.satoken.stp.StpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: sc
 * @description:
 * @author:
 * @create:
 **/
@RestController
public class Login {


    // 测试登录，浏览器访问： http://localhost:8081/d?username=zhang&password=123456
    @RequestMapping("/d")
    public String doLogin(String username, String password) {

        if ("zhang".equals(username) && "123456".equals(password)) {
            StpUtil.login(10001);
            System.out.println(StpUtil.hasPermission("user")+"-----"+StpUtil.getLoginId()+"-----"+StpUtil.getLoginType());

            return "登录成功";
        }
        return "登录失败";
    }

    // 查询登录状态，浏览器访问： http://localhost:8081/user/isLogin
    @RequestMapping("/i")
    public String isLogin() {
        return "当前会话是否登录：" + StpUtil.isLogin();
    }

}
