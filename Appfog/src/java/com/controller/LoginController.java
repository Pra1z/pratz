package com.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController
{
  private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
  
  @RequestMapping(value={"/login.pratz"})
  public String login(@RequestParam(value="email", required=false) String email,@RequestParam(value="password", required=false) String password,ModelMap model)
  {
      if("pratz.nud@gmail.com".equals(email)){
          logger.info("Welcome pratz!");
          return "index";
      }else{
          logger.error("Login fail!!");
          model.addAttribute("loginMsg", "Username or password has invalid.");
          return "login";
      }
  }
}