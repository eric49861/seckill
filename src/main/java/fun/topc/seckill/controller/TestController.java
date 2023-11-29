package fun.topc.seckill.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * 包名称：fun.topc.seckill.contoller
 * 类名称：TestController
 * 类描述：测试项目的controller，用于测试系统是否正常运行
 * 创建人：@author Eric
 * 创建时间：2023年11月29日 21:21
 */
@RequestMapping("/test")
@Controller
public class TestController {

    @GetMapping("/ping")
    public String ping(Model model) {
        model.addAttribute("time", new Date(System.currentTimeMillis()).toString());
        return "hello";
    }
}
