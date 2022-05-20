package com.Amazon.FrameWork.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "Features",
		glue="com.Amazon.FrameWork.steps"
		
		
		)


public class TestRunner extends AbstractTestNGCucumberTests{

}
