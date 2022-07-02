package testNG_Listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listner implements ITestListener
{
	//ontestPass
	//ontestSucess
	//ontestFail
	//ontestSkip
	
	@Override
	public void onTestFailure(ITestResult result)
	{
       Reporter.log("TC is Failed.Screenshot Taken", true);
       ITestListener.super.onTestFailure(result);
	}
	
	@Override
	public void onTestSuccess(ITestResult result) 
	{

	    Reporter.log("TC is Sucess.", true);
		ITestListener.super.onTestSuccess(result);
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
	    Reporter.log("TC is skipped, please check dependent TC", true);
		ITestListener.super.onTestSkipped(result);
	}

}
