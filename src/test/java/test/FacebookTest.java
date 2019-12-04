package test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\ratnam1\\facebook\\src\\test\\resources\\featurefile\\feature1.feature",glue="D:\\ratnam1\\facebook\\src\\test\\resources\\featurefile\\feature2.feature")
public class FacebookTest 
{

}
