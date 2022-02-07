package com.example.userserver8010.controller;

import cn.dev33.satoken.stp.StpUtil;
import cn.dev33.satoken.util.SaResult;
import com.example.common.user.LoginParamVO;
import com.example.userserver8010.util.Result;
import com.example.userserver8010.util.ResultGenerate;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @program: sc
 * @description:
 * @author:
 * @create:
 **/
@Slf4j
@Api("LoginController类")
@RestController
public class LoginController {

    @RequestMapping("/t")
    public void t(){
        log.info("logggggggggggggggggggggg");
    }

    /**
     * @Description: doLogin
     * 登录
     * http://localhost:8080/user/login?username=zhang&password=123456
     * @Param: username password
     * @return
     */
    @ApiOperation(value = "login",notes = "notes")
    @ApiImplicitParam("ApiImplicitParam")
    @ApiResponse(code = 200 ,message = "ApiResponse",response = String.class)
    //@RequestMapping("/login")
    @RequestMapping(value="/login",method= RequestMethod.POST)
    public Result doLogin(LoginParamVO loginParamVO) {


        System.out.println("---------------------------");
        System.out.println(loginParamVO);
        //if ("zhang".equals(loginParamVO.getLoginName()) && "123456".equals(loginParamVO.getPasswordMd5())) {
            StpUtil.login(10001);
            Result res = ResultGenerate.genSuccessResult("登录成功");
            res.setData(StpUtil.getTokenValue());
            System.out.println(StpUtil.getTokenValue());
            return res;
       //}
       // return ResultGenerate.genFailResult("登录失败");
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
