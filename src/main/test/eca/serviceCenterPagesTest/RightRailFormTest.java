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

import eca.getQuote.GetQuote;
import eca.getQuoteTest.BaseClassTest;
import eca.serviceCenterPages.ServiceCenterPages;
import eca.utility.Waiting;

public class RightRailFormTest extends BaseClassTest {
	
	ServiceCenterPages serviceCenterPages;
	BaseClassTest baseClassTest;
	GetQuote getaQuote;
	
	  @BeforeClass
	  public void beforeClass() {
		  
		  serviceCenterPages = PageFactory.initElements(driver, ServiceCenterPages.class);
		  getaQuote = PageFactory.initElements(driver, GetQuote.class);
	  }
		  
	  
	  @Test 
	  public void testRequestQuoteDisplay() {
		  
		  serviceCenterPages.changeLocationByPostal();
		  Assert.assertTrue(serviceCenterPages.verifyGetaQuoteModal());
		  
	  }
	  
	  @Test(dependsOnMethods = { "testRequestQuoteDisplay" }) 
	  public void testRequestAQuotePurgePaper() {
		  
		  getaQuote.selectServices("PurgePaper");
		  getaQuote.enterCompanyInfo("region");
		  getaQuote.enterYourInfo("region");
		  getaQuote.enterAdditionInfo("region");
		  Assert.assertTrue(getaQuote.finalQuotePopUp()); 
		  
	  }
	  
	  @Test(dependsOnMethods = { "testRequestAQuotePurgePaper" })  
	  public void testRequestAQuoteRegularPaper() {
		  
		  Waiting.pageReload(driver);
		  getaQuote.selectServices("RegularPaper");
		  getaQuote.enterCompanyInfo("region");
		  getaQuote.enterYourInfo("region");
		  getaQuote.enterAdditionInfo("region");
		  Assert.assertTrue(getaQuote.finalQuotePopUp()); 
		  
	  }
	  
	  @Test(dependsOnMethods = { "testRequestAQuoteRegularPaper" }) 
	  public void testRequestAQuotePurgeHardDrive() {
		  
		  Waiting.pageReload(driver);
		  getaQuote.selectServices("PurgeHardDrive");
		  getaQuote.enterCompanyInfo("region");
		  getaQuote.enterYourInfo("region");
		  getaQuote.enterAdditionInfo("region");
		  Assert.assertTrue(getaQuote.finalQuotePopUp()); 
		  
	  }
	  
	  @Test(dependsOnMethods = { "testRequestAQuotePurgeHardDrive" }) 
	  public void testRequestAQuoteOther() {
		  
		  Waiting.pageReload(driver);
		  getaQuote.selectServices("Other");
		  getaQuote.enterCompanyInfo("region");
		  getaQuote.enterYourInfo("region");
		  getaQuote.enterAdditionInfo("region");
		  Assert.assertTrue(getaQuote.finalQuotePopUp()); 
		  
	  }
	  

}
