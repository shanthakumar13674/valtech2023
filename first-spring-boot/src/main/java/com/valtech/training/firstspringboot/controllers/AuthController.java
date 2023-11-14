package com.valtech.training.firstspringboot.controllers;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.valtech.training.firstspringboot.model.ChangePasswordModel;
import com.valtech.training.firstspringboot.model.RegisterUserModel;
import com.valtech.training.firstspringboot.service.AuthService;

@Controller
public class AuthController {
	
	@Autowired
	private AuthService authService;
	
	@PostMapping("/changePassword")
	public String handleChangePassword(@AuthenticationPrincipal UserDetails userDetails
			,@ModelAttribute ChangePasswordModel pwdModel,Model model)	{
		pwdModel.setUsername(userDetails.getUsername());
		if(Objects.equals(pwdModel.getNewPassword(),pwdModel.getConfirmPassword()))	{
			if(authService.changePassword(pwdModel))	{
				model.addAttribute("message", "Password changed Sucessfully");
			}	else	{
				model.addAttribute("message", "Old Password doesnt match");
				return "changePassword";
			}
		}	else	{
			model.addAttribute("message", "Password and Confirm Password doesn't match");
			return "changePassword";
		}
		return "redirect:logout";
	}
	
	@GetMapping("/changePassword")
	public String changePasswordForm()	{
		return "changePassword";
	}
	
	@PostMapping("/register")
	public String handleRegistration(@ModelAttribute RegisterUserModel regUserModel,Model model)	{
		if(Objects.equals(regUserModel.getPassword(),regUserModel.getConfirmPassword()))	{
			authService.createUser(regUserModel);
			model.addAttribute("message", "User Registration Successful.. Pls Login to proceed.");
		}else	{
			model.addAttribute("message", "Password and Confirm Password doesn't match");
			return "register";
		}
		return "login";
	}
	
	@GetMapping("/register")
	public String registerForm()	{
		return "register";
	}
	
	
	@GetMapping("/login")
	public String login()	{
		return "login";
	}
	
	@GetMapping("/anon")
	@ResponseBody
	public String anonPage()	{
		return "Anonymous Page";
	}
	
	@GetMapping("/user")
	@ResponseBody
	public String userPage()	{
		return "User Page";
	}

	@GetMapping("/admin")
	@ResponseBody
	public String adminPage()	{
		return "Admin Page";
	}
}
