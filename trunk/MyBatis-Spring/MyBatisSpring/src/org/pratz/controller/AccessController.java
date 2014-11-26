package org.pratz.controller;

import org.pratz.mybatis.mapper.UsersMapper;
import org.pratz.mybatis.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccessController {

   @Autowired
   private UsersMapper usersMapper;
   
    public final void setUsersMapper(UsersMapper usersMapper) {
	this.usersMapper = usersMapper;
}

	@RequestMapping("/index")
    public String denied(Model model) {
    	 System.out.println("home");
    	 Users user = usersMapper.selectByPrimaryKey("user1");
    	 System.out.println(user.getUsername());
       return "index";
    }



}
