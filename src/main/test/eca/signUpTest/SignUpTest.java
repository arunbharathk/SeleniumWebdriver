package eca.signUpTest;
/*
 * Author : Arun Bharath Krishnan
 * email : abharath@ecentricarts.com
 * 
 */
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import eca.getQuoteTest.BaseClassTest;
import eca.signUp.SignUp;

public class SignUpTest extends BaseClassTest{
	
	SignUp signUp;
	BaseClassTest baseClassTest;
	  
	
	  @BeforeClass
	  public void beforeClass() {
		  
		  signUp = PageFactory.initElements(driver, SignUp.class);
		 
		 }
	  
	  @Test()
	  public void homeSignupTest() {
		  
		  signUp.homeSignUp();
  
	  }
	 
	  
	  @Test(dataProvider = "input", dependsOnMethods = {"homeSignupTest"})
	  public void serviceSignupTest(String URL,String test) {
		  
		  System.out.println(test);
		  openBrowser(URL);
		  signUp.shreddingServicesSignUp();
  
	  }
	  
	  @Test(dataProvider = "input", dependsOnMethods = {"serviceSignupTest"})
	  public void pricingSignUpTest(String URL) {
		  
		  openBrowser(URL);
		  signUp.pricingSignUp();
		   
	  }
	  
	  @Test(dataProvider = "input", dependsOnMethods = {"pricingSignUpTest"})
	  public void resourceCenterSignUpTest(String URL) {
		  
		  openBrowser(URL);
		  signUp.resourceCenterSignUp();
		   
	  }
	  
	  @Test(dataProvider = "input", dependsOnMethods = {"resourceCenterSignUpTest"})
	  public void aboutSignUpTest(String URL) {
		  
		  openBrowser(URL);
		  signUp.aboutAndFaqsSignUp();
		   
	  }
	  
	  @Test(dataProvider = "input", dependsOnMethods = {"resourceCenterSignUpTest"})
	  public void faqsSignUpTest(String URL) {
		  
		  openBrowser(URL);
		  signUp.aboutAndFaqsSignUp();
		   
	  }

}
