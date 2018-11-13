/**
 * @Project:
 * @Author: liming
 * @Date: 2018年11月13日
 */
package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName: AppleController
 * @Description:
 * @author liming
 * @date 2018年11月13日
 */
@Controller
public class AppleController {

    @GetMapping("saya")
    @ResponseBody
    public String says ( ) {
        System.out.println("says....");
        return "ji";
    }


    @GetMapping("/arr")
    @ResponseBody
    public Object arr (@RequestParam(name = "arr") String[] arr) {
        return arr;
    }
}
