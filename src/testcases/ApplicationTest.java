package testcases;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ApplicationTest {
	
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("Before Suite");
	}
	@AfterSuite
	public void Aftersuite()
	{
		System.out.println("After Suite");
	}
	@BeforeTest
	public void beforetest()
	{
		System.out.println("Before Executing the Testcase");
		//open Browser
	}
	@AfterTest
	public void Aftertest()
	{
		System.out.println("After Executing the Testcase");
		//Close Browser
	}
	
	@BeforeMethod
	public void beforemethod()
	{
	 System.out.println("=====Before Method======");	
	}
	
	@AfterMethod
	public void Aftermethod()
	{
	 System.out.println("=====After Method======");
	 //Quit browser in case of Grid
	}
	@Test(priority=1) //Test Case
	public void dologin()
	{
		throw new SkipException("Any reason for skipping");
		//System.out.println("Login Test");
		//WebDriver Code
		
	}
	
	@Test(priority=2,dependsOnMethods={"dologin"})
	public void changepassword()
	{
		System.out.println("Password Change");
		
	}
	
	@Test(priority=3,dependsOnMethods={"dologin"})
	public void logout()
	{
		System.out.println("Logout");
	}
	

}
