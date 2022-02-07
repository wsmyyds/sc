package com.example.commoditymall8001.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: sc
 * @description:
 * @author:
 * @create:
 **/
@RestController
public class Test {


    @HystrixCommand(fallbackMethod = "testHystrix")
    @RequestMapping("/t")
    public String testNormal(){
        return "hello world!";
    }

    @HystrixCommand(fallbackMethod = "testHystrix")
    @RequestMapping("/te")
    public String test() throws Exception {
        throw new Exception("-----------xxxxxxxx-----------");
        //return "hello world!";
    }

    /**
     * @Description: 测试熔断
     * @Param: null
     * @return: null
     */
    public String testHystrix() {
        return "testHystrix";
    }
}
