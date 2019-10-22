package com.ibm.app;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Candise Li (jieqli@cn.ibm.com)
 * @create 2019-10-22 14:37
 */
@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/test")
    public String test(){
        return "Hello World";
    }
}

