package com.emailsender.platform.controller;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/transition/")
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class TransitionController {

//	@RequestMapping(value = "/main")
//	public String goToMainAppPage() {
//		return "main";
//	}
}