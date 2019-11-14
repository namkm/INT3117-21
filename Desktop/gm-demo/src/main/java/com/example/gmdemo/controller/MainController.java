package com.example.gmdemo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String homepage(){

        return "homepage";
    }

    @GetMapping("/homepage.html")
    public String home(){

        return"homepage";
    }

    @GetMapping("/login.html")
    public String login(){

        return "login";
    }

    @GetMapping("/signup.html")
    public String signup(){

        return "signup";
    }

    @GetMapping("/mainpage_chart.html")
    public String mainpage_chart(){

        return "mainpage_chart";
    }

    @GetMapping("/mainpage_package.html")
    public String mainpage_package(){

        return "mainpage_package";
    }

    @GetMapping("/mainpage_PT.html")
    public String mainpage_PT(){

        return "mainpage_PT";
    }
    @GetMapping("/mainpage_response.html")
    public String mainpage_response(){

        return "mainpage_response";
    }
    @GetMapping("/mainpage_schedule.html")
    public String mainpage_schedule(){

        return "mainpage_schedule";
    }
    @GetMapping("/signup-success.html")
    public String signupsuccess(){

        return "signup-success";
    }
    @GetMapping("/profile.html")
    public String profile(){

        return "profile";
    }
    @GetMapping("/setting.html")
    public String setting(){

        return "setting";
    }


}
