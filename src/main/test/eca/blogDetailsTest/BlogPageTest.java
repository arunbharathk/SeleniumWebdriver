package eca.blogDetailsTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import eca.blogDetails.BlogPage;
import eca.getQuoteTest.BaseClassTest;

public class BlogPageTest extends BaseClassTest{
	
	
	BaseClassTest baseClassTest;
	BlogPage blogPage;
	
	 @BeforeClass
	  public void beforeClass() {
		  
		 blogPage = PageFactory.initElements(driver, BlogPage.class);
	
	 }
	 
	 @Test
	  public void testBannerContents() throws Exception { 
		  
		  
	  }
	  
	  @Test(dependsOnMethods = { "testBannerContents" })
	  public void testContinueReadingLink() throws Exception { 
		  
		  blogPage.clickBlog();
		  Assert.assertTrue(blogPage.continueReadingLinkVerification());
	  }
	  
	  @Test(dependsOnMethods = { "testContinueReadingLink" })
	  public void testSubscribeBlog() throws Exception { 
		  
		  Assert.assertTrue(blogPage.subscribeBlog());
		  
	  }  
		  
	  @Test(dependsOnMethods = { "testSubscribeBlog" })
	  public void testEmailValidation() throws Exception { 
			  
		 Assert.assertTrue(blogPage.emailValidation());	  
	  }
	
	  @Test(dependsOnMethods = { "testEmailValidation" })
	  public void testArchivesContent() throws Exception { 
			  
		Assert.assertTrue(blogPage.archivesRightRail());	  
	  }
	  
	  @Test(dependsOnMethods = { "testEmailValidation" })
	  public void testOlderPostButton() throws Exception { 
		
		  Assert.assertTrue(blogPage.olderPosts());
      }
	  
	  @Test(dependsOnMethods = { "testEmailValidation" })
	  public void testBottomRailWidget() throws Exception { 
		  
		  
			  
      }
	  
	  @Test(dependsOnMethods = { "testBottomRailWidget" })
	  public void testRssButton() throws Exception { 
		  
		  Assert.assertTrue(blogPage.RssLinkVerificatin());
			  
      }


}
