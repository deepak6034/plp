package com.capg.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class JspController {
	
	  @RequestMapping(value = "/login")
	    public String login(HttpSession session, HttpServletRequest request) {

	        String userid = request.getParameter("userid");
	        String password = request.getParameter("password");

	        
	        session.setAttribute("userid", userid);
	        session.setAttribute("password", password);

	        return "login.jsp";
	    }

	    @RequestMapping(value = "/logout") 
	    public String logout(HttpSession session) {
	        session.invalidate();
	        return "login.jsp";
	    }

	
	
}