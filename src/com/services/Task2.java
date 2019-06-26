package com.services;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component("task2")
public class Task2 implements Operation {
	private Logger logger = Logger.getLogger(Task2.class);
	@Override
	public void doTask() {
		System.out.println("T A S K 2");
		// TODO Auto-generated method stub
		logger.info("Task2 started and Running");
	}

}
