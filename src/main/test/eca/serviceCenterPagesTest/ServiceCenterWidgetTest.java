package eca.serviceCenterPagesTest;

/*
 * Author : Arun Bharath Krishnan
 * email : abharath@ecentricarts.com
 * QA Url : http://shredit-qa.ecentricarts.com/en-us/secure-shredding-services/hard-drive-destruction
 * 
 */
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import eca.getQuoteTest.BaseClassTest;
import eca.serviceCenterPages.ServiceCenterPages;

public class ServiceCenterWidgetTest extends BaseClassTest{
	

	ServiceCenterPages serviceCenterPages;
	BaseClassTest baseClassTest;
	
	
	  @BeforeClass
	  public void beforeClass() {
		  
		  serviceCenterPages = PageFactory.initElements(driver, ServiceCenterPages.class);
	  }
		  
	  
	  @Test 
	  public void testTitleVerification() {
		  
		  serviceCenterPages.changeLocationByPostal();
		  serviceCenterPages.verifyGetaQuoteModal();
		  Assert.assertEquals(serviceCenterPages.getTitle(), "Shred-it Los Angeles");
		  
	  }
	  
	  @Test(dependsOnMethods = { "testTitleVerification" })
	  public void testDescriptionVerification() {
		  
		  Assert.assertEquals(serviceCenterPages.getDescription(), "Paper Shredding and Hard Drive Destruction Los Angeles");
		  
	  }
	  
	  @Test(dependsOnMethods = { "testDescriptionVerification" }) 
	  public void testCommunitieServed() {
		  
		  Assert.assertTrue(serviceCenterPages.CommunitieServed());
		  
	  }
	  
	  @Test(dependsOnMethods = { "testCommunitieServed" })  
	  public void testBottomRail() {
		  
		  Assert.assertTrue(serviceCenterPages.verifyBottomRail());
		  
	  }
	  
	  @Test(dependsOnMethods = { "testBottomRail" })  
	  public void testHeaderContactNumber() {
		  
		  Assert.assertTrue(serviceCenterPages.getHeaderContactNumber());
		  
	  }
	  

}
