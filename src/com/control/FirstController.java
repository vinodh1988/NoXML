package com.control;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.services.Operation;

@Controller
public class FirstController {
	@Value("#{appConstants.appName}")
	String appname;
	@Value("#{appConstants.currentFlow=='Flow1'?task1:task2}")
	Operation task;
	private Logger logger = Logger.getLogger(FirstController.class);

	{
	  logger.info("Controller is intantiated");
	}
	@RequestMapping("/hello")
	public String firstView(ModelMap m){
		m.addAttribute("message","Spring App with Zero XML");
		logger.info("App name is"+appname);
		task.doTask();
		return "home";
	}

}
