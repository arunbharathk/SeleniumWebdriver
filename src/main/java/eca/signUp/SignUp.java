package eca.signUp;

 /** Author : Arun Bharath Krishnan
 * email : abharath@ecentricarts.com
 * QA Url : http://shredit-qa.ecentricarts.com/en-us/secure-shredding-services/hard-drive-destruction
 * */
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import eca.utility.Waiting;
import xpathStructure.SignUpXpath;

public class SignUp {
	
	WebDriver webdriver;
	
	public SignUp(WebDriver webdriver) {
		// TODO Auto-generated constructor stub
		this.webdriver = webdriver;
	}
	
	
	
	public void homeSignUp() {
		
		Waiting.waitForPageLoaded(webdriver);
		webdriver.findElement(By.xpath(SignUpXpath.homeFirstnameXpath)).sendKeys("TestQA");
		webdriver.findElement(By.xpath(SignUpXpath.homeLastNameXpath)).sendKeys("TestLastName");
		webdriver.findElement(By.xpath(SignUpXpath.homeEmailXpath)).sendKeys("test@ecentricarts.com");
		webdriver.findElement(By.xpath(SignUpXpath.homeCompanyXpath)).sendKeys("Ecentricarts");
		webdriver.findElement(By.xpath(SignUpXpath.homeSignUpButtonXpath)).click();
		
	}
	
	public void shreddingServicesSignUp() {
		
		Waiting.waitForPageLoaded(webdriver);
		webdriver.findElement(By.xpath(SignUpXpath.shredFirstNameXpath)).sendKeys("TestQA");
		webdriver.findElement(By.xpath(SignUpXpath.shredLastNameXpath)).sendKeys("TestLastName");
		webdriver.findElement(By.xpath(SignUpXpath.shredEmailXpath)).sendKeys("test@ecentricarts.com");
		webdriver.findElement(By.xpath(SignUpXpath.shredCompanyXpath)).sendKeys("Ecentricarts");
		webdriver.findElement(By.xpath(SignUpXpath.shredSignUpButtonXpath)).click();
	}
	
	public void pricingSignUp() {
		
		Waiting.waitForPageLoaded(webdriver);
		webdriver.findElement(By.xpath(SignUpXpath.pricingFirstNameXpath)).sendKeys("TestQA");
		webdriver.findElement(By.xpath(SignUpXpath.pricingLastNameXpath)).sendKeys("TestLastName");
		webdriver.findElement(By.xpath(SignUpXpath.pricingEmailXpath)).sendKeys("test@ecentricarts.com");
		webdriver.findElement(By.xpath(SignUpXpath.pricingCompanyXpath)).sendKeys("Ecentricarts");
		webdriver.findElement(By.xpath(SignUpXpath.pricingSignUpButtonXpath)).click();
	}
	
	public void resourceCenterSignUp() {
		
		Waiting.waitForPageLoaded(webdriver);
		webdriver.findElement(By.xpath(SignUpXpath.resourceFirstNameXpath)).sendKeys("TestQA");
		webdriver.findElement(By.xpath(SignUpXpath.resourceLastNameXpath)).sendKeys("TestLastName");
		webdriver.findElement(By.xpath(SignUpXpath.resourceEmailXpath)).sendKeys("test@ecentricarts.com");
		webdriver.findElement(By.xpath(SignUpXpath.resourceCompanyXpath)).sendKeys("Ecentricarts");
		webdriver.findElement(By.xpath(SignUpXpath.resourceSignUpButtonXpath)).click();
	}
	
	public void aboutAndFaqsSignUp() {
		
		Waiting.waitForPageLoaded(webdriver);
		webdriver.findElement(By.xpath(SignUpXpath.aboutFirstNameXpath)).sendKeys("TestQA");
		webdriver.findElement(By.xpath(SignUpXpath.aboutLastNameXpath)).sendKeys("TestLastName");
		webdriver.findElement(By.xpath(SignUpXpath.aboutEmailXpath)).sendKeys("test@ecentricarts.com");
		webdriver.findElement(By.xpath(SignUpXpath.aboutCompanyXpath)).sendKeys("Ecentricarts");
		webdriver.findElement(By.xpath(SignUpXpath.aboutSignUpButtonXpath)).click();
	}
	
}
