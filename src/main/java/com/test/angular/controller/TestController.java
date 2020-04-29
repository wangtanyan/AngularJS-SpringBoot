package com.test.angular.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title TestController
 * @Description
 * @Author WT
 * @Version 1.0.0
 * @Date 2020-04-28 11:57
 */
@RestController
public class TestController {

    @RequestMapping(value = "/userList", method = RequestMethod.GET)
    public String userList() {
        return "[\n" +
                "\t{\"id\":\"1\", \"num\":23, \"name\":\"James\", \"position\":\"PF\", \"team\":\"骑士\", \"thumb\":\"james.png\", \"votes\":1988},\n" +
                "\t{\"id\":\"2\", \"num\":30, \"name\":\"Curry\", \"position\":\"SG\", \"team\":\"勇士\", \"thumb\":\"curry.png\", \"votes\":1865}\n" +
                "]";
    }

}
