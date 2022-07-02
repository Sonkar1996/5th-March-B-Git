package testNG_Listener;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;


import KiteAppBestClass.BaseClassUsingProperty2;

public class Listener implements ITestListener
{
  BaseClassUsingProperty2 b2= new BaseClassUsingProperty2();//created object for base class
  //ontestPass //ontestFail//ontestsucess//ontestSkip

	@Override
	public void onTestFailure(ITestResult result)
	{
		String TCName = result.getName();
		try {
			b2.takesScreenshot(TCName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void onTestSuccess(ITestResult result) 
	{

	    Reporter.log("TC is Sucess.", true);
		ITestListener.super.onTestSuccess(result);
		Reporter.log("Sucess TC name is "+result.getName(), true);
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
	    Reporter.log("TC is skipped, please check dependent TC", true);
		ITestListener.super.onTestSkipped(result);
		Reporter.log("Sucess TC name is "+result.getName(), true);

	}

}
