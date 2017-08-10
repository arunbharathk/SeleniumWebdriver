package eca.getQuoteTest;

/* * Author : Arun Bharath Krishnan
 * email : abharath@ecentricarts.com
 * QA Url : http://shredit-qa.ecentricarts.com/en-us/secure-shredding-services/paper-shredding-services
 * */
 
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import eca.getQuote.GetQuote;

public class GetPaperShredQuoteTest extends BaseClassTest {
	
	GetQuote getaQuote;
	BaseClassTest baseClassTest;
	  
	
	  @BeforeClass
	  public void beforeClass() {
		  
		 getaQuote = PageFactory.initElements(driver, GetQuote.class);
		 
		 }
	  

	  
/* 
 * 
 * Paper Shredding Services -- Header Get a Quote
 * 
 * 	  */
	  
	  @Test
	  public void paperShred_Header_OneTimePaperQuote() throws Exception {
		  
		  getaQuote.selectQuoteType("PaperShredding");
		  getaQuote.hardDriveAndPaperShredding("HeaderQuote");
		  getaQuote.selectServices("PurgePaper");
		  getaQuote.enterCompanyInfo("regular");
		  getaQuote.enterYourInfo("regular");
		  getaQuote.enterAdditionInfo("regular");
		  Assert.assertTrue(getaQuote.closeQuoteModal()); 
	  }
	  
	  @Test(dependsOnMethods = { "paperShred_Header_OneTimePaperQuote" })
	  public void paperShred_Header_RegularPaperQuote() {
		  
		  getaQuote.hardDriveAndPaperShredding("HeaderQuote");
		  getaQuote.selectServices("RegularPaper");
		  getaQuote.enterCompanyInfo("regular");
		  getaQuote.enterYourInfo("regular");
		  getaQuote.enterAdditionInfo("regular");
		  Assert.assertTrue(getaQuote.closeQuoteModal()); 
	  }
	  
	  @Test(dependsOnMethods = { "paperShred_Header_RegularPaperQuote" })
	  public void paperShred_Header_HardDriveQuote() {
		  
		  getaQuote.hardDriveAndPaperShredding("HeaderQuote");
		  getaQuote.selectServices("PurgeHardDrive");
		  getaQuote.enterCompanyInfo("regular");
		  getaQuote.enterYourInfo("regular");
		  getaQuote.enterAdditionInfo("regular");
		  Assert.assertTrue(getaQuote.closeQuoteModal()); 
	  }
	  
	  @Test(dependsOnMethods = { "paperShred_Header_HardDriveQuote" })
	  public void paperShred_Header_OtherMaterialQuote() {
		  
		  getaQuote.hardDriveAndPaperShredding("HeaderQuote");
		  getaQuote.selectServices("Other");
		  getaQuote.enterCompanyInfo("regular");
		  getaQuote.enterYourInfo("regular");
		  getaQuote.enterAdditionInfo("regular");
		  Assert.assertTrue(getaQuote.closeQuoteModal()); 
	  }
	
	/*   
	   * 
	   * Paper Shredding Services -- One-time Paper Shredding Services
	   * 
	   * 	
	  */
	  @Test(dependsOnMethods = { "paperShred_Header_OtherMaterialQuote" })
	  public void paperShredding_OneTime_PaperQuote() {
		  
		  getaQuote.hardDriveAndPaperShredding("HDShearing");
		  getaQuote.selectServices("PurgePaper");
		  getaQuote.enterCompanyInfo("regular");
		  getaQuote.enterYourInfo("regular");
		  getaQuote.enterAdditionInfo("regular");
		  Assert.assertTrue(getaQuote.closeQuoteModal()); 
	  }
	  
	  @Test(dependsOnMethods = { "paperShredding_OneTime_PaperQuote" })
	  public void paperShredding_OneTime_RegularPaperQuote() {
		  
		  getaQuote.hardDriveAndPaperShredding("HDShearing");
		  getaQuote.selectServices("RegularPaper");
		  getaQuote.enterCompanyInfo("regular");
		  getaQuote.enterYourInfo("regular");
		  getaQuote.enterAdditionInfo("regular");
		  Assert.assertTrue(getaQuote.closeQuoteModal()); 
	  }
	  
	  @Test(dependsOnMethods = { "paperShredding_OneTime_RegularPaperQuote" })
	  public void paperShredding_OneTime_HardDriveQuote() {
		  
		  getaQuote.hardDriveAndPaperShredding("HDShearing");
		  getaQuote.selectServices("PurgeHardDrive");
		  getaQuote.enterCompanyInfo("regular");
		  getaQuote.enterYourInfo("regular");
		  getaQuote.enterAdditionInfo("regular");
		  Assert.assertTrue(getaQuote.closeQuoteModal()); 
	  }
	  
	  @Test(dependsOnMethods = { "paperShredding_OneTime_HardDriveQuote" })
	  public void paperShredding_OneTime_OtherMaterialQuote() {
		  
		  getaQuote.hardDriveAndPaperShredding("HDShearing");
		  getaQuote.selectServices("Other");
		  getaQuote.enterCompanyInfo("regular");
		  getaQuote.enterYourInfo("regular");
		  getaQuote.enterAdditionInfo("regular");
		  Assert.assertTrue(getaQuote.closeQuoteModal()); 
	  }
	  
/*	   
	   * 
	   * Paper Shredding Services -- Regularly Scheduled Protection
	   * 
	   * 	
	  */
	  @Test(dependsOnMethods = { "paperShredding_OneTime_OtherMaterialQuote" })
	  public void paperShredding_Regularly_PaperQuote() {
		  
		  getaQuote.hardDriveAndPaperShredding("HDCrushing");
		  getaQuote.selectServices("PurgePaper");
		  getaQuote.enterCompanyInfo("regular");
		  getaQuote.enterYourInfo("regular");
		  getaQuote.enterAdditionInfo("regular");
		  Assert.assertTrue(getaQuote.closeQuoteModal()); 
	  }
	  
	  @Test(dependsOnMethods = { "paperShredding_Regularly_PaperQuote" })
	  public void paperShredding_Regularly_RegularPaperQuote() {
		  
		  getaQuote.hardDriveAndPaperShredding("HDCrushing");
		  getaQuote.selectServices("RegularPaper");
		  getaQuote.enterCompanyInfo("regular");
		  getaQuote.enterYourInfo("regular");
		  getaQuote.enterAdditionInfo("regular");
		  Assert.assertTrue(getaQuote.closeQuoteModal()); 
	  }
	  
	  @Test(dependsOnMethods = { "paperShredding_Regularly_RegularPaperQuote" })
	  public void paperShredding_Regularly_HardDriveQuote() {
		  
		  getaQuote.hardDriveAndPaperShredding("HDCrushing");
		  getaQuote.selectServices("PurgeHardDrive");
		  getaQuote.enterCompanyInfo("regular");
		  getaQuote.enterYourInfo("regular");
		  getaQuote.enterAdditionInfo("regular");
		  Assert.assertTrue(getaQuote.closeQuoteModal()); 
	  }
	  
	  @Test(dependsOnMethods = { "paperShredding_Regularly_HardDriveQuote" })
	  public void paperShredding_Regularly_OtherMaterialQuote() {
		  
		  getaQuote.hardDriveAndPaperShredding("HDCrushing");
		  getaQuote.selectServices("Other");
		  getaQuote.enterCompanyInfo("regular");
		  getaQuote.enterYourInfo("regular");
		  getaQuote.enterAdditionInfo("regular");
		  Assert.assertTrue(getaQuote.closeQuoteModal()); 
	  }
	  
	  

}
