package xpathStructure;

public interface GetQuoteXpath {
	
	//MethodName  : selectQuoteType
	String home_GetaQuoteXpath = "//div[@id='wrapper']//a[@class='home-hero-btn shredit-modal-trigger']";
	String PaperShreddingXpath = "//*[@id='page-content']//div[@class='container_12 services']//div[1]//img";
	String hardDriveShreddingXpath = "//*[@id='page-content']//div[@class='container_12 services']//div[2]//img";
	String footerShreddingXpath = ".//*[@id='wrapper']//a[@class='get-quote-footer shredit-modal-trigger']";
	
	
	//MethodName : selectServices
	String purgePaperXpath = "//label[@class='PurgePaper']/span";
	String  regularPaperXpath = "//label[@class='RegularPaper']/span";
	String purgeHardDriveXpath = "//label[@class='PurgeHardDrive']/span";
	String otherXpath = "//label[@class='OtherOther']/span";
	
	
	//Method Name : hardDriveAndPaperShredding
	String headerQuoteXpath = ".//*[@id='wrapper']/header[2]/div[3]//a";
	String  hDShearingXpath = ".//*[@id='page-content']/section[2]/div/div[1]/div[2]/p/a";
	String hdCrushingXpath = ".//*[@id='page-content']/section[2]/div/div[2]/div[2]/p/a";
	
	//Method Name  : enterCompanyInfo
	String step1Xpath = ".//*[@id='Step1-next']/a";
	String companyNameXpath = "//div[@id='Step2' and contains(@style,'display: block')]//*[@id='p_lt_ctl22_SIR_BizForm_Full_page_MultiStep_BizForm_Company_txtText']";
	String postalCodeXpath = "//div[@id='Step2' and contains(@style,'display: block')]//.//*[@id='p_lt_ctl22_SIR_BizForm_Full_page_MultiStep_BizForm_PostalCode_txtText']";
	String step2Xpath = ".//*[@id='Step2-next']/a";
	
	//Method Name : enterYourInfo
	String firstNameXpath =  "//div[@id='Step3' and contains(@style,'display: block')]//*[@id='p_lt_ctl22_SIR_BizForm_Full_page_MultiStep_BizForm_FirstName_txtText']";
	String lastNameXpath = "//div[@id='Step3' and contains(@style,'display: block')]//*[@id='p_lt_ctl22_SIR_BizForm_Full_page_MultiStep_BizForm_LastName_txtText']";
	String phoneNumberXpath = "//div[@id='Step3' and contains(@style,'display: block')]//*[@id='p_lt_ctl22_SIR_BizForm_Full_page_MultiStep_BizForm_Phone_txtText']";
	String emailAddressXpath = "//div[@id='Step3' and contains(@style,'display: block')]//*[@id='p_lt_ctl22_SIR_BizForm_Full_page_MultiStep_BizForm_Email_txtText']";
	String step3Xpath = ".//*[@id='Step3-next']/a";
	
	
	//Method Name  : enterAdditionInfo
	String additionalInfoTextXpath = "//div[@id='Step4' and contains(@style,'display: block')]//h3";
	String additionInfoTextAreaXpath = "//div[@id='Step4' and contains(@style,'display: block')]//*[@id='p_lt_ctl22_SIR_BizForm_Full_page_MultiStep_BizForm_Comments_txtText']";
	String additionalSubmitButtonXpath = ".//*[@id='p_lt_ctl22_SIR_BizForm_Full_page_MultiStep_BizForm_btnOK']";
	
	//Method Name : closeQuoteModal
	String closeButtonXpath = "//div[@class='inner' and contains(@style,'display: block')]//a[@href='']";
	String thankyouTextXpath = ".//*[@id='p_lt_ctl22_SIR_BizForm_Full_page_MultiStep_FormUpdatePanel']/div/h2";
	String thankyouGreetingsTextXpath = "//*[@id='p_lt_ctl22_SIR_BizForm_Full_page_MultiStep_FormUpdatePanel']/div/p[1]";
	
	
	//Class Name : RightRailFormTest.java
	//Method Name : 
	String regionCompanyNameXpath = "//div[@id='Step2' and contains(@style,'display: block')]//*[@id='p_lt_ctl12_pageplaceholder_p_lt_ctl07_SIR_BizForm_Full_page_MultiStep_BizForm_Company_txtText']";
	String regionPostalCodeXpath = "//div[@id='Step2' and contains(@style,'display: block')]//*[@id='p_lt_ctl12_pageplaceholder_p_lt_ctl07_SIR_BizForm_Full_page_MultiStep_BizForm_PostalCode_txtText']";
	String regionFirstNameXpath =  "//div[@id='Step3' and contains(@style,'display: block')]//*[@id='p_lt_ctl12_pageplaceholder_p_lt_ctl07_SIR_BizForm_Full_page_MultiStep_BizForm_FirstName_txtText']";
	String regionLastNameXpath = "//div[@id='Step3' and contains(@style,'display: block')]//*[@id='p_lt_ctl12_pageplaceholder_p_lt_ctl07_SIR_BizForm_Full_page_MultiStep_BizForm_LastName_txtText']";
	String regionPhoneNumberXpath = "//div[@id='Step3' and contains(@style,'display: block')]//*[@id='p_lt_ctl12_pageplaceholder_p_lt_ctl07_SIR_BizForm_Full_page_MultiStep_BizForm_Phone_txtText']";
	String regionEmailAddressXpath = "//div[@id='Step3' and contains(@style,'display: block')]//*[@id='p_lt_ctl12_pageplaceholder_p_lt_ctl07_SIR_BizForm_Full_page_MultiStep_BizForm_Email_txtText']";
	String regionAdditionalInfoTextXpath = "//div[@id='Step4' and contains(@style,'display: block')]//h3";
	String regionAdditionInfoTextAreaXpath = "//div[@id='Step4' and contains(@style,'display: block')]//*[@id='p_lt_ctl12_pageplaceholder_p_lt_ctl07_SIR_BizForm_Full_page_MultiStep_BizForm_Comments_txtText']";
	String regionAdditionalSubmitButtonXpath = "//*[@id='p_lt_ctl12_pageplaceholder_p_lt_ctl07_SIR_BizForm_Full_page_MultiStep_BizForm_btnOK']";
	
	
	/**
	 * GetQuote Data Call
	 */
	
	String dataActualGreetingstext = "Thank you!A Shred-it representative will contact you shortly. In the meantime, head back to the website to learn more about our services.";
	String dataCompanyName = "testEcentricarts";
	String dataPostalCode = "M1P8AI";
	String dataFirstName = "TestQA";
	String dataLastName = "Ecentricarts";
	String dataPhoneNumber = "6578941252";
	String dataEmailAddress = "testQA@ecentricarts.com";
	
	
	
	
	
	
	
	
	
	
	
}
