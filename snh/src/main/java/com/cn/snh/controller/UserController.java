package com.cn.snh.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.snh.pojo.User;
import com.cn.snh.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	  @Resource    
      private UserService userService;    
          
      @RequestMapping("/showUser")    
      public String toIndex(HttpServletRequest request,Model model){    
          String userIdStr = request.getParameter("id");   
          Integer userId = Integer.parseInt(userIdStr);
          User user = this.userService.getUserById(userId);    
          model.addAttribute("user", user);    
          return "page/test/showUser";    
      } 
}
