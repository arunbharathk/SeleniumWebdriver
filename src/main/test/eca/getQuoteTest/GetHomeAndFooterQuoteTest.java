package eca.getQuoteTest;

/* * Author : Arun Bharath Krishnan
 * email : abharath@ecentricarts.com
 * QA Url : http://shredit-qa.ecentricarts.com/en-us/secure-shredding-services/hard-drive-destruction
 * 
 */

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import eca.getQuote.GetQuote;

@SuppressWarnings("unused")
public class GetHomeAndFooterQuoteTest extends BaseClassTest {
	
	
	GetQuote getaQuote;
	BaseClassTest baseClassTest;
	
	
	  @BeforeClass
	  public void beforeClass() {
		  
		 getaQuote = PageFactory.initElements(driver, GetQuote.class);
		
		 
		 }

	  
	  @Test
	  public void homeOnePurgeQuote() throws Exception { 
		  
		  getaQuote.selectQuoteType("Home");
		  getaQuote.selectServices("PurgePaper");
		  getaQuote.enterCompanyInfo("regular");
		  getaQuote.enterYourInfo("regular");
		  getaQuote.enterAdditionInfo("regular");
		  Assert.assertTrue(getaQuote.closeQuoteModal()); 
	  }
	  
	  @Test(dependsOnMethods = { "homeOnePurgeQuote" })
	  public void homeRegularPaperQuote() throws Exception { 
		  
		  getaQuote.selectQuoteType("Home");
		  getaQuote.selectServices("RegularPaper");
		  getaQuote.enterCompanyInfo("regular");
		  getaQuote.enterYourInfo("regular");
		  getaQuote.enterAdditionInfo("regular");
		  Assert.assertTrue(getaQuote.closeQuoteModal()); 
	  }
	  
	  @Test(dependsOnMethods = { "homeRegularPaperQuote" })
	  public void homeHardDriveQuote() throws Exception { 
		  
		  getaQuote.selectQuoteType("Home");
		  getaQuote.selectServices("PurgeHardDrive");
		  getaQuote.enterCompanyInfo("regular");
		  getaQuote.enterYourInfo("regular");
		  getaQuote.enterAdditionInfo("regular");
		  Assert.assertTrue(getaQuote.closeQuoteModal()); 
	  }
	  
	  @Test(dependsOnMethods = { "homeHardDriveQuote" })
	  public void homeOtherMaterialQuote() throws Exception { 
		  
		  getaQuote.selectQuoteType("Home");
		  getaQuote.selectServices("Other");
		  getaQuote.enterCompanyInfo("regular");
		  getaQuote.enterYourInfo("regular");
		  getaQuote.enterAdditionInfo("regular");
		  Assert.assertTrue(getaQuote.closeQuoteModal()); 
	  }
	  
/*	  
	   *******************************************
	   * 
	   * Footer Get a Quote
	   * 
	   * * *****************************************
	  
	  */
	  @Test(dependsOnMethods = { "homeOtherMaterialQuote" })
	  public void footerOnePurgeQuote() throws Exception { 
		  
		  getaQuote.selectQuoteType("FooterShredding");
		  getaQuote.selectServices("PurgePaper");
		  getaQuote.enterCompanyInfo("regular");
		  getaQuote.enterYourInfo("regular");
		  getaQuote.enterAdditionInfo("regular");
		  Assert.assertTrue(getaQuote.closeQuoteModal()); 
	  }
	  
	  @Test(dependsOnMethods = { "footerOnePurgeQuote" })
	  public void footerRegularPaperQuote() throws Exception { 
		  
		  getaQuote.selectQuoteType("FooterShredding");
		  getaQuote.selectServices("RegularPaper");
		  getaQuote.enterCompanyInfo("regular");
		  getaQuote.enterYourInfo("regular");
		  getaQuote.enterAdditionInfo("regular");
		  Assert.assertTrue(getaQuote.closeQuoteModal()); 
	  }
	  
	  @Test(dependsOnMethods = { "footerRegularPaperQuote" })
	  public void footerHardDriveQuote() throws Exception { 
		  
		  getaQuote.selectQuoteType("FooterShredding");
		  getaQuote.selectServices("PurgeHardDrive");
		  getaQuote.enterCompanyInfo("regular");
		  getaQuote.enterYourInfo("regular");
		  getaQuote.enterAdditionInfo("regular");
		  Assert.assertTrue(getaQuote.closeQuoteModal()); 
	  }
	  
	  @Test(dependsOnMethods = { "footerHardDriveQuote" })
	  public void footerOtherMaterialQuote() throws Exception { 
		  
		  getaQuote.selectQuoteType("FooterShredding");
		  getaQuote.selectServices("Other");
		  getaQuote.enterCompanyInfo("regular");
		  getaQuote.enterYourInfo("regular");
		  getaQuote.enterAdditionInfo("regular");
		  Assert.assertTrue(getaQuote.closeQuoteModal()); 
	  }



}
