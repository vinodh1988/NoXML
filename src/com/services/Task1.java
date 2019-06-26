package com.services;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component("task1")
public class Task1 implements Operation {
	private Logger logger = Logger.getLogger(Task1.class);
	@Override
	public void doTask() {
	   System.out.println("T A S K 1");
		// TODO Auto-generated method stub
	   logger.info("Task 1 is started and running..!!!!");
	}

}
