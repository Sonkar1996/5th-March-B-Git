package testNG_Listener;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MumbaiTest {
  @Test
  public void Sanpada() 
  {
	  Reporter.log("Sanpada TC is running", true);
  }
  
  @Test
  public void GhanSoli()
  {
  Reporter.log("ghanSoli TC is running", true);
  }
  
  
}
