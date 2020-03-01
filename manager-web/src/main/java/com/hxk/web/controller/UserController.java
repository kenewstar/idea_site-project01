package com.hxk.web.controller;

import com.hxk.pojo.User;
import com.hxk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")            //请求前缀
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/addUser")
    public String addUser(User user){
        this.userService.addUser(user);
        return "success";
    }
    @RequestMapping("/delUser")
    public String delUser(Model model){
        List<User> list = this.userService.selectUser();
        model.addAttribute("list",list);
        return "deleteUser";
    }
    @RequestMapping("/deleteUser")
    public String deleteUser(Integer id){
        this.userService.deleteUser(id);
        return "index";
    }
    @RequestMapping("/selectUser")
    public String selectUser(Model model){
        List<User> list = this.userService.selectUser();
        model.addAttribute("list",list);
        return "selectUser";
    }
}
