package eca.getQuote;
/*
 * Author : Arun Bharath Krishnan
 * email : abharath@ecentricarts.com
 * QA Url : http://shredit-qa.ecentricarts.com/en-us/secure-shredding-services/hard-drive-destruction
 * */
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import eca.utility.PropertyUtils;
import eca.utility.Waiting;
import xpathStructure.GetQuoteXpath;

public class GetQuote{
	
public PropertyUtils xpathFile;	
WebDriver webdriver;


	
	public GetQuote(WebDriver webdriver) {
		// TODO Auto-generated constructor stub
		this.webdriver = webdriver;
		
	}
	
	
	public void selectServices(String serviceType) {
		
		Waiting.waitForPageLoaded(webdriver);
		 switch (serviceType) {
		 
		 case "PurgePaper" :
			 
			 Waiting.waitForElementToLoad(webdriver,GetQuoteXpath.purgePaperXpath);	
			 webdriver.findElement(By.xpath(GetQuoteXpath.purgePaperXpath)).click();
			 break;
			 
		 case "RegularPaper" :
			 
			 webdriver.findElement(By.xpath(GetQuoteXpath.regularPaperXpath)).click();
			 break;
			 
		 case "PurgeHardDrive" :
			 
			 webdriver.findElement(By.xpath(GetQuoteXpath.purgeHardDriveXpath)).click();
			 break;
			 
		 case "Other" :
			 
			 webdriver.findElement(By.xpath(GetQuoteXpath.otherXpath)).click();
			 break;
			 
		 default :
		
             throw new IllegalArgumentException("Invalid service type: " + serviceType);
             
		 }
		
	}
	
	public void selectQuoteType(String pageType) throws Exception {
		
		Waiting.waitForPageLoaded(webdriver);
		 switch (pageType) {
		 
		 case "Home" :
			 
			 webdriver.findElement(By.xpath(GetQuoteXpath.home_GetaQuoteXpath)).click();
			 break;
			 
		 case "PaperShredding" :
			 
			 webdriver.findElement(By.xpath(GetQuoteXpath.PaperShreddingXpath)).click();
			 break;
			 
		 case "HardDriveShredding" :
			 
			 webdriver.findElement(By.xpath(GetQuoteXpath.hardDriveShreddingXpath)).click();
			 break;
			 
		 case "FooterShredding" :
			 
			 webdriver.findElement(By.xpath(GetQuoteXpath.footerShreddingXpath)).click(); 
			 break;
			 
		 default :
				
             throw new IllegalArgumentException("Invalid service type: " + pageType);
		 
		 }	 
			  
}
	
	
	public void hardDriveAndPaperShredding(String getQuoteType) {
		
		Waiting.waitForPageLoaded(webdriver);
		switch(getQuoteType) {
		
		case "HeaderQuote" :
			
			webdriver.findElement(By.xpath(GetQuoteXpath.headerQuoteXpath)).click();
			break;
			
		case "HDShearing" :
			
			webdriver.findElement(By.xpath(GetQuoteXpath.hDShearingXpath)).click();
			break;
			
		case "HDCrushing" :
			
			webdriver.findElement(By.xpath(GetQuoteXpath.hdCrushingXpath)).click();
			break;
			
		 default :
				
             throw new IllegalArgumentException("Invalid page type: " + getQuoteType);
             
		}
				
    }
	
	

	
	public void enterCompanyInfo(String typeQuote) {
		
		if(typeQuote.equalsIgnoreCase("region")) {
			
			webdriver.findElement(By.xpath(GetQuoteXpath.step1Xpath)).click();
			Waiting.waitForElementToLoad(webdriver, GetQuoteXpath.regionCompanyNameXpath);
			webdriver.findElement(By.xpath(GetQuoteXpath.regionCompanyNameXpath)).sendKeys(GetQuoteXpath.dataCompanyName);
			webdriver.findElement(By.xpath(GetQuoteXpath.regionPostalCodeXpath)).sendKeys(GetQuoteXpath.dataPostalCode);
		    webdriver.findElement(By.xpath(GetQuoteXpath.step2Xpath)).click();
			
		}else {
			webdriver.findElement(By.xpath(GetQuoteXpath.step1Xpath)).click();
			Waiting.waitForElementToLoad(webdriver, GetQuoteXpath.companyNameXpath);
			webdriver.findElement(By.xpath(GetQuoteXpath.companyNameXpath)).sendKeys(GetQuoteXpath.dataCompanyName);
			webdriver.findElement(By.xpath(GetQuoteXpath.postalCodeXpath)).sendKeys(GetQuoteXpath.dataPostalCode);
			webdriver.findElement(By.xpath(GetQuoteXpath.step2Xpath)).click();
		}
	}
	
	public void enterYourInfo(String typeQuote) {
		
		if(typeQuote.equalsIgnoreCase("region")) {
			
			Waiting.waitForElementToLoad(webdriver,GetQuoteXpath.regionFirstNameXpath);
			webdriver.findElement(By.xpath(GetQuoteXpath.regionFirstNameXpath)).sendKeys(GetQuoteXpath.dataFirstName);
			webdriver.findElement(By.xpath(GetQuoteXpath.regionLastNameXpath)).sendKeys(GetQuoteXpath.dataLastName);
			webdriver.findElement(By.xpath(GetQuoteXpath.regionPhoneNumberXpath)).sendKeys(GetQuoteXpath.dataPhoneNumber);
			webdriver.findElement(By.xpath(GetQuoteXpath.regionEmailAddressXpath)).sendKeys(GetQuoteXpath.dataEmailAddress);
			webdriver.findElement(By.xpath(GetQuoteXpath.step3Xpath)).click();
			
		}else {
			Waiting.waitForElementToLoad(webdriver,GetQuoteXpath.firstNameXpath);
			webdriver.findElement(By.xpath(GetQuoteXpath.firstNameXpath)).sendKeys(GetQuoteXpath.dataFirstName);
			webdriver.findElement(By.xpath(GetQuoteXpath.lastNameXpath)).sendKeys(GetQuoteXpath.dataLastName);
			webdriver.findElement(By.xpath(GetQuoteXpath.phoneNumberXpath)).sendKeys(GetQuoteXpath.dataPhoneNumber);
			webdriver.findElement(By.xpath(GetQuoteXpath.emailAddressXpath)).sendKeys(GetQuoteXpath.dataEmailAddress);
			webdriver.findElement(By.xpath(GetQuoteXpath.step3Xpath)).click();
		}
	}
	public void enterAdditionInfo(String typeQuote) {
		
		if(typeQuote.equalsIgnoreCase("region")) {
			
			Waiting.waitForElementToLoad(webdriver,GetQuoteXpath.regionAdditionalInfoTextXpath);
			webdriver.findElement(By.xpath(GetQuoteXpath.regionAdditionInfoTextAreaXpath)).sendKeys("Automation Testing");
			webdriver.findElement(By.xpath(GetQuoteXpath.regionAdditionalSubmitButtonXpath)).click();
			
		} else {
			Waiting.waitForElementToLoad(webdriver,GetQuoteXpath.additionalInfoTextXpath);
			webdriver.findElement(By.xpath(GetQuoteXpath.additionInfoTextAreaXpath)).sendKeys("Automation Testing");
			webdriver.findElement(By.xpath(GetQuoteXpath.additionalSubmitButtonXpath)).click();
		}
	}
	
	
	
	public boolean closeQuoteModal() {
		
		
		Waiting.waitForElementToLoad(webdriver, GetQuoteXpath.closeButtonXpath);
		String thanksText = webdriver.findElement(By.xpath(GetQuoteXpath.thankyouTextXpath)).getText();
		String greetingsText = webdriver.findElement(By.xpath(GetQuoteXpath.thankyouGreetingsTextXpath)).getText();
		webdriver.findElement(By.xpath(GetQuoteXpath.closeButtonXpath)).click();
		
		String expectedGreetingsText = thanksText.concat(greetingsText);
		if (expectedGreetingsText.trim().equalsIgnoreCase(GetQuoteXpath.dataActualGreetingstext.trim())) {
		  return true;
		  }
		else {return false;}
	}
	
		
	public boolean finalQuotePopUp() {
		
		return webdriver.findElement(By.xpath(".//*[@id='p_lt_ctl12_pageplaceholder_p_lt_ctl07_SIR_BizForm_Full_page_MultiStep_FormUpdatePanel']//h2")).isDisplayed();
	}
		
	}

