package testNG_UsingPOM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VCTCTestNGAssertive {
	WebDriver driver;
	VCTCCPOMClassAssert pomclass;
  @BeforeMethod
  public void Launch() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://vctcpune.com/selenium/practice.html");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  pomclass = new VCTCCPOMClassAssert(driver);
  }
  @Test
  public void VerifyRadioButton()
  {
	  pomclass.RadioTrue();
  }
  @Test
  public void VerifyCountryField()
  {
	  pomclass.CountriesTextBox();
  }
  @Test
  public void VerifyText()
  {
	  pomclass.text();
  }
  @AfterMethod
  public void close()
  {
	  driver.close();
  }
}
