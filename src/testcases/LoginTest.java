package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest //Data provider annotation
{

	@Test(dataProvider="getData") //2nd step
	public void doLogin(//3rd Step
			String uname,
			String pword,
			String expResult,
			String browser,
			int phone)
	{
		
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[3][5];// 1st Step
		//1st row
		data[0][0] = "U1";
		data[0][1] = "p1";
		data[0][2] = "Pass";
		data[0][3] = "Firefox";
		data[0][4] = 123456;
		
		//2nd row
		data[1][0] = "U2";
		data[1][1] = "p2";
		data[1][2] = "Pass";
		data[1][3] = "Chrome";
		data[1][4] = 456789;
		
		//3rd row
		data[2][0] = "U3";
		data[2][1] = "p3";
		data[2][2] = "Fail";
		data[2][3] = "IE";
		data[2][4] = 546786523;
		
		return data;
				
	}
	
	
	
}
