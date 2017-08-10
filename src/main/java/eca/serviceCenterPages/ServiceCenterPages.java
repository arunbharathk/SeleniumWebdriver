package eca.serviceCenterPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import eca.utility.Waiting;

/*
 * Author : Arun Bharath Krishnan
 * email : abharath@ecentricarts.com
 * QA Url : http://shredit-qa.ecentricarts.com/en-us/secure-shredding-services/hard-drive-destruction
 * 
 */
public class ServiceCenterPages {
	
	WebDriver webdriver;
	
	public ServiceCenterPages(WebDriver webdriver) {
		
		this.webdriver = webdriver;
	}
	
	//90001 -- Los Angeles
	
	public void changeLocationByPostal() {
		
		Waiting.waitForPageLoaded(webdriver);
		webdriver.findElement(By.xpath(".//*[@class='utility-nav']//li[@class='location']/a")).click();
		Waiting.waitForElementToLoad(webdriver, ".//*[@id='p_lt_ctl05_SIR_UtilityNavigation_Nav1']/ul/li[1]/div");
		webdriver.findElement(By.xpath(".//*[@id='p_lt_ctl05_SIR_UtilityNavigation_Nav1']//input[@name='location']")).sendKeys("90001");
		webdriver.findElement(By.xpath(".//*[@id='p_lt_ctl05_SIR_UtilityNavigation_Nav1']//input[@class='submit']")).click();
		
		
	}
	
	public String getTitle() {
		
		Waiting.waitForPageLoaded(webdriver);
		
		System.out.println(webdriver.
				findElement(By.
						xpath("//div[@class='stationary']//div[@class='grid_4']/h2[1]")).getText());
		return  webdriver.
						findElement(By.
								xpath("//div[@class='stationary']//div[@class='grid_4']/h2[1]")).getText();
		
		//Shred-it Los Angeles
	}
	
	public String getDescription() {
		
		Waiting.waitForPageLoaded(webdriver);
		
		return  webdriver.
				findElement(By.
						xpath(".//*[@id='page-content']//section[2]/h1")).getText();
		
	}

	
	public String[] getRightRailContactNumber() {
		
		Waiting.waitForPageLoaded(webdriver);
		
		String telBranch = webdriver.findElement(By.xpath(".//*[@id='page-content']/div/div[2]/section/div/ul/li[1]")).getText();
		String telTollfree = webdriver.findElement(By.xpath(".//*[@id='page-content']/div/div[2]/section/div/ul/li[2]")).getText();
		return new String[] {telBranch,telTollfree} ;
		
	}
	
	public boolean getHeaderContactNumber() {
		
		boolean flag = false;
		Waiting.waitForPageLoaded(webdriver);
		
		String telBranch = webdriver.findElement(By.xpath("//nav[@class='secondary-nav']//li[@class='utility tel-branch']/span")).getText();
		String telTollfree = webdriver.findElement(By.xpath("//nav[@class='secondary-nav']//li[@class='utility tel-tollfree']/span")).getText();
		
		if (telBranch.equalsIgnoreCase("562.321.5809") & telTollfree.equalsIgnoreCase("888.750.6450")) {
			flag = true;
		}
		return flag;
		
	}
	
	public boolean verifyMapButton() {
		
		return webdriver.findElement(By.
				xpath(".//*[@id='page-content']/div/div[2]/section/div/p[2]/a"))
					.isDisplayed();
		
		
	}
	
	public void verifyMapInNewWindow() {
		
		//TO-DO ... 
	}
	
	public boolean verifyGetaQuoteModal() {
		
		return webdriver.findElement(By.
				xpath("//div[@class='gaq_page_multistep hasPadding']"))
					.isDisplayed();
		
	}
	
	public boolean verifyBottomRail() {
		
		return webdriver.
					findElement(By.xpath(".//*[@id='wrapper']/footer/div"))
							.isDisplayed();
	}
	
	public boolean CommunitieServed() {
		
		boolean flag = false;
		String homeRegionText = webdriver.
				findElement(By.
						xpath("//div[@class='stationary']//div[@class='grid_4']/h2[1]")).getText();
		
		String TitleRegionText = webdriver.
				findElement(By.
						xpath(".//*[@id='page-content']//section[2]/h1")).getText();
		
		if ((homeRegionText.contains("Los Angeles")) & (TitleRegionText.contains("Los Angeles"))){
			
			flag = true;
			
		}
		return flag;
		
	}
	
}
