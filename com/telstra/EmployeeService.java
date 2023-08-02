package com.telstra;


import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.slf4j.*;
public class EmployeeService {
private static final Logger logger=LoggerFactory.getLogger(EmployeeService.class);
void addEmployee()
{
	logger.error("this is error");
	logger.warn("this id warning");
	logger.info("this is info");
	logger.debug("this is debug");
	
}
}
