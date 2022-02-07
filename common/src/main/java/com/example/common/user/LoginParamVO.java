package com.example.common.user;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: sc
 * @description:
 * @author:
 * @create:
 **/
@Data
public class LoginParamVO implements Serializable {

    private String loginName;
    private String passwordMd5;
}
