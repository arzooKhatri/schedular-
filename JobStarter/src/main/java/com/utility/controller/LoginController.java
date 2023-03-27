package com.utility.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import com.utility.Schedular.Schedular;
import com.utility.services.LoginServices;

@Controller
@SessionAttributes("username")
public class LoginController
{
    @Autowired
    LoginServices services;
    
    @Autowired
    Schedular schedule;

    @GetMapping("/userlogin")
    public String showLoginPage(ModelMap model)
    {
    	System.out.println("userlogin");
    	schedule.cronJobSch();
        return "loginpage";
    }
   
    @RequestMapping("/home")
    public String showHomePage(ModelMap model)
    {
    	System.out.println("Home page");
    	schedule.cronJobSch2();
        return "home";
    }

    @RequestMapping("/about")
    public void logoutUser(ModelMap model)
    {
    	System.out.println("about us page");
    	schedule.cronJobSch3();
    	   	      
    }

    @RequestMapping("/contactus")
    public void  contactUsPage(ModelMap model)
    {
      System.out.println("Contact us page:");
    }
   
    
}
