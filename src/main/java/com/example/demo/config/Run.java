/**
 * @Project:
 * @Author: liming
 * @Date: 2018年11月12日
 */
package com.example.demo.config;

import com.example.demo.pojo.BussinessPerson;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ClassName: Run
 * @Description:
 * @author liming
 * @date 2018年11月12日
 */
public class Run {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Appconfig.class);
        BussinessPerson bean = ctx.getBean(BussinessPerson.class);
        boolean bussinessPerson = ctx.isSingleton("bussinessPerson");
        System.out.println(bussinessPerson+"...");
       // bean.service();
    }
}
