package jpabook.jpashop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("data", "hojoon");
        return "index";
    }

    @GetMapping("login")
    public String login(){
        return "login";
    }

    @PostMapping("")
    public String loginPost() {

        return "/";
    }
}
