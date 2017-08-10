package eca.getQuoteTest;

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

public class GetHardDriverQuoteTest extends BaseClassTest{
	
	GetQuote getaQuote;
	BaseClassTest baseClassTest;
	  
	
	  @BeforeClass
	  public void beforeClass() {
		  
		 getaQuote = PageFactory.initElements(driver, GetQuote.class);
		 
		 }
	  

	  
/* *
 * 
 * Hard Drive Destruction -- Header Get a Quote
 * 
 * 	  */
	  
	  @Test
	  public void hdDestruction_Header_OneTimePaperQuote() throws Exception {
		  
		  getaQuote.selectQuoteType("HardDriveShredding");
		  getaQuote.hardDriveAndPaperShredding("HeaderQuote");
		  getaQuote.selectServices("PurgePaper");
		  getaQuote.enterCompanyInfo("regular");
		  getaQuote.enterYourInfo("regular");
		  getaQuote.enterAdditionInfo("regular");
		  Assert.assertTrue(getaQuote.closeQuoteModal()); 
	  }
	  
	  @Test(dependsOnMethods = { "hdDestruction_Header_OneTimePaperQuote" })
	  public void hdDestruction_Header_RegularPaperQuote() {
		  
		  getaQuote.hardDriveAndPaperShredding("HeaderQuote");
		  getaQuote.selectServices("RegularPaper");
		  getaQuote.enterCompanyInfo("regular");
		  getaQuote.enterYourInfo("regular");
		  getaQuote.enterAdditionInfo("regular");
		  Assert.assertTrue(getaQuote.closeQuoteModal()); 
	  }
	  
	  @Test(dependsOnMethods = { "hdDestruction_Header_RegularPaperQuote" })
	  public void hdDestruction_Header_HardDriveQuote() {
		  
		  getaQuote.hardDriveAndPaperShredding("HeaderQuote");
		  getaQuote.selectServices("PurgeHardDrive");
		  getaQuote.enterCompanyInfo("regular");
		  getaQuote.enterYourInfo("regular");
		  getaQuote.enterAdditionInfo("regular");
		  Assert.assertTrue(getaQuote.closeQuoteModal()); 
	  }
	  
	  @Test(dependsOnMethods = { "hdDestruction_Header_HardDriveQuote" })
	  public void hdDestruction_Header_OtherMaterialQuote() {
		  
		  getaQuote.hardDriveAndPaperShredding("HeaderQuote");
		  getaQuote.selectServices("Other");
		  getaQuote.enterCompanyInfo("regular");
		  getaQuote.enterYourInfo("regular");
		  getaQuote.enterAdditionInfo("regular");
		  Assert.assertTrue(getaQuote.closeQuoteModal()); 
	  }
	
/*	   
	   * 
	   * Hard Drive Destruction -- Shearing Services
	   * 
	   * 	
	  */
	  @Test(dependsOnMethods = { "hdDestruction_Header_OtherMaterialQuote" })
	  public void hdDestruction_Shearing_PaperQuote() {
		  
		  getaQuote.hardDriveAndPaperShredding("HDShearing");
		  getaQuote.selectServices("PurgePaper");
		  getaQuote.enterCompanyInfo("regular");
		  getaQuote.enterYourInfo("regular");
		  getaQuote.enterAdditionInfo("regular");
		  Assert.assertTrue(getaQuote.closeQuoteModal()); 
	  }
	  
	  @Test(dependsOnMethods = { "hdDestruction_Shearing_PaperQuote" })
	  public void hdDestruction_Shearing__RegularPaperQuote() {
		  
		  getaQuote.hardDriveAndPaperShredding("HDShearing");
		  getaQuote.selectServices("RegularPaper");
		  getaQuote.enterCompanyInfo("regular");
		  getaQuote.enterYourInfo("regular");
		  getaQuote.enterAdditionInfo("regular");
		  Assert.assertTrue(getaQuote.closeQuoteModal()); 
	  }
	  
	  @Test(dependsOnMethods = { "hdDestruction_Shearing__RegularPaperQuote" })
	  public void hdDestruction_Shearing__HardDriveQuote() {
		  
		  getaQuote.hardDriveAndPaperShredding("HDShearing");
		  getaQuote.selectServices("PurgeHardDrive");
		  getaQuote.enterCompanyInfo("regular");
		  getaQuote.enterYourInfo("regular");
		  getaQuote.enterAdditionInfo("regular");
		  Assert.assertTrue(getaQuote.closeQuoteModal()); 
	  }
	  
	  @Test(dependsOnMethods = { "hdDestruction_Shearing__HardDriveQuote" })
	  public void hdDestruction_Shearing__OtherMaterialQuote() {
		  
		  getaQuote.hardDriveAndPaperShredding("HDShearing");
		  getaQuote.selectServices("Other");
		  getaQuote.enterCompanyInfo("regular");
		  getaQuote.enterYourInfo("regular");
		  getaQuote.enterAdditionInfo("regular");
		  Assert.assertTrue(getaQuote.closeQuoteModal()); 
	  }
	  
	   
	/*   * 
	   * Hard Drive Destruction  -- Crushing Services
	   * 
	   * 	
	  */
	  @Test(dependsOnMethods = { "hdDestruction_Shearing__OtherMaterialQuote" })
	  public void hdDestruction_Crushing_PaperQuote() {
		  
		  getaQuote.hardDriveAndPaperShredding("HDCrushing");
		  getaQuote.selectServices("PurgePaper");
		  getaQuote.enterCompanyInfo("regular");
		  getaQuote.enterYourInfo("regular");
		  getaQuote.enterAdditionInfo("regular");
		  Assert.assertTrue(getaQuote.closeQuoteModal()); 
	  }
	  
	  @Test(dependsOnMethods = { "hdDestruction_Crushing_PaperQuote" })
	  public void hdDestruction_Crushing_RegularPaperQuote() {
		  
		  getaQuote.hardDriveAndPaperShredding("HDCrushing");
		  getaQuote.selectServices("RegularPaper");
		  getaQuote.enterCompanyInfo("regular");
		  getaQuote.enterYourInfo("regular");
		  getaQuote.enterAdditionInfo("regular");
		  Assert.assertTrue(getaQuote.closeQuoteModal()); 
	  }
	  
	  @Test(dependsOnMethods = { "hdDestruction_Crushing_RegularPaperQuote" })
	  public void hdDestruction_Crushing_HardDriveQuote() {
		  
		  getaQuote.hardDriveAndPaperShredding("HDCrushing");
		  getaQuote.selectServices("PurgeHardDrive");
		  getaQuote.enterCompanyInfo("regular");
		  getaQuote.enterYourInfo("regular");
		  getaQuote.enterAdditionInfo("regular");
		  Assert.assertTrue(getaQuote.closeQuoteModal()); 
	  }
	  
	  @Test(dependsOnMethods = { "hdDestruction_Crushing_HardDriveQuote" })
	  public void hdDestruction_Crushing_OtherMaterialQuote() {
		  
		  getaQuote.hardDriveAndPaperShredding("HDCrushing");
		  getaQuote.selectServices("Other");
		  getaQuote.enterCompanyInfo("regular");
		  getaQuote.enterYourInfo("regular");
		  getaQuote.enterAdditionInfo("regular");
		  Assert.assertTrue(getaQuote.closeQuoteModal()); 
	  }
	  
	  


}
