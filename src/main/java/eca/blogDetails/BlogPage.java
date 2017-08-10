package eca.blogDetails;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import eca.getQuoteTest.BaseClassTest;
import eca.utility.Waiting;

/*
 * Author : Arun Bharath Krishnan
 * email : abharath@ecentricarts.com
 * QA Url : http://shredit-qa.ecentricarts.com/en-us/blog/securing-your-information
 * */
 
public class BlogPage {
	
	WebDriver webDriver;
	
	
	public BlogPage(WebDriver webDriver) {
		
		this.webDriver = webDriver;
	}
	
	
	
	public boolean subscribeBlog() {
		
		return webDriver.findElement(By.xpath("//div[@id='p_lt_ctl12_pageplaceholder_p_lt_ctl02_SIR_BizForm_Full_page_FormUpdatePanel']")).isDisplayed();
	}
	
	
	public boolean emailValidation() {
		
		Waiting.waitForPageLoaded(webDriver);
		webDriver.findElement(By.
				xpath(".//*[@id='p_lt_ctl12_pageplaceholder_p_lt_ctl02_SIR_BizForm_Full_page_BizForm_Email_txtText']"))
						.sendKeys("automation@ecentricarts.com");
		webDriver.findElement(By.xpath(".//*[@id='p_lt_ctl12_pageplaceholder_p_lt_ctl02_SIR_BizForm_Full_page_BizForm_btnOK']"))
						.click();
		Waiting.waitForElementToLoad(webDriver, ".//section [@class='cta-wrap'][1]");
		return webDriver.findElement(By.xpath(".//section [@class='cta-wrap'][1]")).isDisplayed();
		
	}
	
	
	public boolean archivesRightRail() {
		
		Waiting.waitForElementToLoad(webDriver, ".//*[@id='post-archives']");
		return webDriver.findElement(By.xpath(".//*[@id='post-archives']")).isDisplayed();
		
	}
	
	public boolean olderPosts() {
		
		Waiting.waitForElementToLoad(webDriver, "//input[@class='FormButton older-posts']");
		return webDriver.findElement(By.xpath("//input[@class='FormButton older-posts']")).isDisplayed();
		
	}
	
	public boolean RssLinkVerificatin() {
		
		webDriver.get("http://shredit-qa.ecentricarts.com/en-us/blog/securing-your-information");
		Waiting.waitForElementToLoad(webDriver, ".//*[@class='blog-subscribe-rss']/a");
		
		if(webDriver.findElement(By
				.xpath(".//*[@class='blog-subscribe-rss']/a"))
						.isDisplayed()) {
			
			webDriver.findElement(By.xpath(".//*[@class='blog-subscribe-rss']/a")).click();
			
			return webDriver.findElement(By.xpath(".//*[@id='bannerblock']/h1/a")).isDisplayed();	
			
		}else
		return false;
	}
	
	public boolean continueReadingLinkVerification() {
		
		Waiting.waitForElementToLoad(webDriver, ".//*[@id='page-content']/di/li[1]/p[3]/a");
		webDriver.findElement(By.xpath(".//*[@id='page-content']/div/div/div/ul/li[1]/p[3]/a")).click();
		Waiting.waitForPageLoaded(webDriver);
		return webDriver.findElement(By.xpath("//div[@class='blog-post']")).isDisplayed();
		
	}
	
	public void clickBlog() {
		
		Waiting.waitForPageLoaded(webDriver);
		webDriver.findElement(By.xpath(".//*[@id='p_lt_ctl08_SIR_Widget_PrimaryNavigation_lnkItem4']")).click();
	}
	
	public void openBlogPage() {
		
		webDriver.get("http://shredit-qa.ecentricarts.com/en-us/blog/securing-your-information");
		webDriver.manage().window().maximize();
		Waiting.waitForPageLoaded(webDriver);
		
	}

}
