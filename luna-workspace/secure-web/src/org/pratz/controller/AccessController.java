package org.pratz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AccessController {

    @RequestMapping("/login")
    public String login(Model model, @RequestParam(value="error",required=false) String error,@RequestParam(value="logout",required=false) String logout) {
       model.addAttribute("error", error);
       model.addAttribute("logout", logout);
       System.out.println("login view");
       return "login";
    }
    
    @RequestMapping("/menu")
    public String menu(Model model) {
    	 System.out.println("menu view");
       return "menu";
    }
    
    @RequestMapping("/denied")
    public String denied(Model model) {
    	 System.out.println("denied view");
       return "denied";
    }
    
    

}
