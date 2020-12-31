package com.brian.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Copyright: 版权所有 (c) JOIN-CHEER</p>
 *
 * @author zhangruikai
 * @date 2020/12/30 19:34
 */
@RestController
@RequestMapping("/")
public class TestController {

    @Value("${isDebug}")
    private String isDebug;

    @RequestMapping("/hello")
    public String hello() {
        return isDebug;
    }

}
