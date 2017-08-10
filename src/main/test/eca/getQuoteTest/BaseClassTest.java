package eca.getQuoteTest;

import java.io.File;

/*
 * Author : Arun Bharath Krishnan
 * email : abharath@ecentricarts.com
 * Main Class Test, Should extend this class on every test case class
 * */
 
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import eca.utility.dataprovider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import eca.utility.Waiting;

public class BaseClassTest {
	
	public String className;
	public String methodName;
	protected static WebDriver driver;
	dataprovider dataprovider;

	/**
	 * This function will execute before each Test tag in testng.xml
	 * @param browser
	 * @throws Exception
	 */
	
	@BeforeClass
	@Parameters({"browser","URL"})
	public void setup(String browser, String URL) throws Exception{
		
		
		dataprovider = new dataprovider();
		
		//Check if parameter passed from TestNG is 'firefox'
		if(browser.equalsIgnoreCase("firefox")){
		//create firefox instance
			
			System.setProperty("webdriver.firefox.marionette", System.getProperty("user.dir")+"\\src\\main\\resources\\geckodriver.exe");
			System.out.println(System.getProperty("user.dir")+"\\src\\main\\resources\\geckodriver.exe");
			driver = new FirefoxDriver();
			openBrowser(URL);
		}
		
		//Check if parameter passed as 'chrome'
		else if(browser.equalsIgnoreCase("chrome")){
			//set path to chromedriver.exe
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");
			//create chrome instance
			driver = new ChromeDriver();
			openBrowser(URL);
		}
		
		else{
			//If no browser passed throw exception
			throw new Exception("Browser is not correct");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	
	/* * Method to open the browser and Launch the targeted URL*/
	 
	public void openBrowser(String URL) {
		
		driver.get(URL);
		driver.manage().window().maximize();
		Waiting.waitForPageLoaded(driver);
	}
	
	
	/* * Quit the browser after every class*/
	 
	  @AfterClass
	  public void close() {
		  
		  driver.quit();
	  }
	  
	  @BeforeMethod
	 
	    public void methodName(Method m) throws Exception{
		  
		 
		   className = getClass().getSimpleName();
		   methodName = m.getName();
	       
	  }


	  
	  
	  
	/*   * DataProvider method which used to read the input from excel*/
	   
	 // @BeforeMethod
	  @DataProvider(name = "input")
	    public Object[][] createData1(Method m) throws Exception{
		  
		  
		  System.out.println(getClass().getSimpleName());
		  System.out.println(m.getName());
	        Object[][] retObjArr=dataprovider.getTableArray("C:\\Users\\abharath\\eclipse-workspace\\ShredIt-UiAutomation\\src\\main\\resources\\shredItQA.xls",getClass().getSimpleName(),m.getName());
	        return(retObjArr);
	    
	  }


	public static WebDriver getDriver() {
		// TODO Auto-generated method stub
		return driver;
	}


}
