package com.example.gatewayserver8080.service;

import cn.dev33.satoken.stp.StpInterface;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: sc
 * @description:权限获取
 * @author:
 * @create:
 **/
@Component
public class StpPermissionAndRole implements StpInterface {

    @Override
    public List<String> getPermissionList(Object o, String s) {
        List<String> list = new ArrayList<>();
        list.add("user");
        return list;
    }

    @Override
    public List<String> getRoleList(Object o, String s) {
        return null;
    }
}
