package com.example.userserver8010.controller;

import cn.dev33.satoken.stp.StpUtil;
import cn.dev33.satoken.util.SaResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: sc
 * @description:
 * @author:
 * @create:
 **/
@Api("LoginController类")
@RestController
public class LoginController {

    /**
     * @Description: doLogin
     * 登录
     * http://localhost:8080/user/login?username=zhang&password=123456
     * @Param: username password
     */
    @ApiOperation(value = "login",notes = "notes")
    @ApiImplicitParam("ApiImplicitParam")
    @ApiResponse(code = 200 ,message = "ApiResponse",response = String.class)
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String doLogin(String username, String password) {


        if ("zhang".equals(username) && "123456".equals(password)) {
            StpUtil.login(10001);
            return "登录成功";
        }
        return "登录失败";
    }

    /**
     * @Description: logout
     * 登出
     * http://localhost:8080/user/logout
     * @Param:
     */
    @RequestMapping("/logout")
    public SaResult logout() {
        StpUtil.logout();
        return SaResult.ok();
    }

    /**
     * @Description: disable
     * 封号
     * http://localhost:8080/user/disable
     * @Param: loginId
     */
    @RequestMapping("/disable")
    public SaResult disable(Object loginId) {
        // 下线
        StpUtil.kickout(10001);

        //TODO 改变 database user状态

        // 封禁
        StpUtil.disable(10001, 86400);
        return SaResult.ok();
    }

    /**
     * @Description: able
     * http://localhost:8080/user/able
     * @Param: loginId
     */
    @RequestMapping("/able")
    public SaResult able(Object loginId) {
        StpUtil.untieDisable(10001);
        return SaResult.ok();
    }

    /**
     * @Description: isLogin
     * 查询登录状态
     * http://localhost:8080/user/isLogin
     * @Param:
     */
    @RequestMapping("/isLogin")
    public String isLogin() {
        return "当前会话是否登录：" + StpUtil.isLogin();
    }

}
