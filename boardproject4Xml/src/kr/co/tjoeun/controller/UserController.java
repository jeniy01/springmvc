package kr.co.tjoeun.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.tjoeun.bean.UserBean;
import kr.go.tjoeun.validator.UserValidator;

@Controller
@RequestMapping("/user")
public class UserController {
  
	@GetMapping("/login")
	public String login() {
	return "user/login";
	}
	  
	@GetMapping("/join")
	public String join(@ModelAttribute("joinUserBean") UserBean joinUserBean) {
	return "user/join";
	}
	  
	@GetMapping("/modify")
	public String modify() {
	return "user/modify";
	}
	  
	@GetMapping("/logout")
	public String logout() {
	return "user/logout";
	}
	  
	@PostMapping("/join_procedure")
	public String joinProcedure(@Valid @ModelAttribute("joinUserBean") UserBean joinUserBean, BindingResult result) {
		if(result.hasErrors()) {
			return "user/join";
		}
		return "user/join_success";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		UserValidator userValidator1 = new UserValidator();
		binder.addValidators(userValidator1);
	}
}