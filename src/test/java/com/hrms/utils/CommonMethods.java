package com.hrms.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.hrms.testbase.BaseClass;
import com.hrms.testbase.PageInitiliazer;

//command+o --> to see all methods within the class

public class CommonMethods extends PageInitiliazer {
	
	
	/**
	 * This methods accept the alert
	 * @throws will throw NoAlertPresentException if alert is not present
	 * 
	 */
	
	public static void acceptAlert() {
		
		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		}catch(NoAlertPresentException e) {
			System.err.println("Alert is not present");
		}
	}
	
	
	
	/**
	 * This methods dismiss the alert
	 * @throws will throw NoAlertPresentException if alert is not present
	 * 
	 */
	
	public static void dismissAlert() {
		
		try {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
		}catch(NoAlertPresentException e) {
			System.err.println("Alert is not present");
		}
		
	}	
	
	
	
		/**
		 * This method get a text from alert
		 * @return text of the alert
		 * @throws will throw NoAlertPresentException if alert is not present
		 */
		
		public static String getAlertText() {
				
			String text = null;
			
			try {
				Alert alert = driver.switchTo().alert();
				text = alert.getText();
			}catch(NoAlertPresentException e) {
				System.err.println("Alert is not present");
			}
			return text;
		}
		
		
		
		
		/**
		 * This methods with switch to the frame
		 * @param nameOrId
		 */
		
		public static void switchToFrame(String nameOrId) {
			
			try {
				driver.switchTo().frame(nameOrId);
			}catch(NoSuchFrameException e) {
				System.err.println("Frame is not present");
			}
			
		}
		
		
		
		/**
		 * This methods with switch to the frame
		 * @param WebElement
		 */
		
		public static void switchToFrame(WebElement element) {
			
			try {
				driver.switchTo().frame(element);
			}catch(NoSuchFrameException e) {
				System.err.println("Frame is not present");
			}
			
		}
		
		
		
		
		/**
		 * This methods with switch to the frame
		 * @param index
		 */
		
		public static void switchToFrame(int index) {
			
			try {
				driver.switchTo().frame(index);
			}catch(NoSuchFrameException e) {
				System.err.println("Frame is not present");
			}
			
		}
		
		
		/**
		 * This method click on the element using JSExecutor
		 * @param element
		 */
		
		public static void jsClick(WebElement element) {
			
			JavascriptExecutor js =	(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", element);
		}
		
		
		/**
		 * This method scroll page until specified element
		 * @param element
		 */
		
		public static void scrollIntoElement(WebElement element) {
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true);", element);
		}
		
		
		/**
		 * This method scroll page down 
		 * @param pixel
		 */
		
		public static void scrollDown(int pixel) {
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0," + pixel + ")");
		}
		
		
		/**
		 * This method scroll page up
		 * @param pixel
		 */
		
		public static void scrollUp(int pixel) {
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,-" + pixel + ")");
		}
		
		/**
		 * This method will take a screenshot
		 * @param fileName
		 */
		
		public static byte[] takeScreenshot(String fileName) {
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd_HHmmss");
			String timeStamp = sdf.format(date.getTime());
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			//create picture in a form of bytes -> we need to 
			byte[] picture = ts.getScreenshotAs(OutputType.BYTES);
			
			File file = ts.getScreenshotAs(OutputType.FILE);
			String screenshotFile = Constants.SCREENSHOTS_FILEPATH + fileName+timeStamp + ".png";
			try {
				FileUtils.copyFile(file, new File(screenshotFile));
			} catch (IOException e) {
				System.out.println("Cannot take a screenshot");
			}
			
			return picture;
		}
		
		
		
		/**
	     * This method will enter text
	     * 
	     * @param element
	     * @param value
	     */
	    public static void sendText(WebElement element, String value) {
	        element.clear();
	        element.sendKeys(value);
	    }
	    /**
	     * This method will create an Object of WebDriverWait
	     * 
	     * @return WebDriverWait
	     */
	    public static WebDriverWait getWaitObject() {
	        WebDriverWait wait = new WebDriverWait(driver, Constants.EXPLICIT_LOAD_TIME);
	        return wait;
	    }
	    /**
	     * This method will wait until element becomes clickable
	     * 
	     * @param element
	     */
	    public static void waitForClickability(WebElement element) {
	        getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
	    }
	    /**
	     * This method will wait until element becomes visible
	     * 
	     * @param element
	     */
	    public static void waitForVisibility(WebElement element) {
	        getWaitObject().until(ExpectedConditions.visibilityOf(element));
	    }
	    /**
	     * This method will wait until element becomes invisible
	     * 
	     * @param element
	     */
	    public static void waitForInvisibility(WebElement element) {
	        getWaitObject().until(ExpectedConditions.invisibilityOf(element));
	    }
	    
	    
	    /**
	     * This method will click on the element
	     * @param element
	     */
	    public static void click(WebElement element) {
	        waitForClickability(element);
	        element.click();
	    }
	    
	    
	    
	    /**
	     * This method take data from settings.properties file.
	     * Method takes propertyKey as a parameter and return value
	     * For example: 
	     * usePropertiesFile(login)
	     * return: Admin
	     * @param propertyKey
	     * @return
	     */
	    public static String usePropertiesFile(String propertyKey) {
	    	String filePath = System.getProperty("user.dir") + "/src/test/resources/configs/Configurations.properties";
	    	Properties property = null;
	    	try {
				FileInputStream fis = new FileInputStream(filePath);
				property = new Properties();
				property.load(fis);
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
	    	String value = property.getProperty(propertyKey);
	    	
	    	return value;
	    }

	   /**
	    * This method select value from dropdown menu by visible text
	    * @param element
	    * @param visibleText
	    */
	    public static void selectDropDownValue(WebElement element, String visibleText) {
	    	Select select = new Select(element);
	    	List<WebElement> dropDownOptions = select.getOptions();
	    	
	    	boolean isFound = false;
	    	for(WebElement option: dropDownOptions) {
	    		if(option.getText().equals(visibleText)) {
	    			select.selectByVisibleText(visibleText);
	    			isFound = true;
	    			break;
	    		}
	    	}
	    	
	    	if(!isFound) {
	    		System.err.println("Value " + visibleText + " was not found in the dropdown");
	    	}
	    }

	    /**
	     * This method select value from dropdown menu by index
	     * @param element
	     * @param index
	     */
		public static void selectDropDownValue(WebElement element, int index) {
			Select select = new Select(element);
			boolean isFound = false;
			List<WebElement> dropDownOptions = select.getOptions();
			if(dropDownOptions.size()>index) {
				select.selectByIndex(index);
				isFound = true;
			}
			
			if(!isFound) {
	    		System.err.println("Value with index " + index + " was not found in the dropdown");
			}
		}
		
		
		/**
		 * This method click on the radio button based on the text
		 * @param elements
		 * @param radioText
		 */
		public static void clickRadioButton(List<WebElement> elements, String radioText) {
			for(WebElement element: elements) {
				if(element.getText().equals(radioText)) {
					element.click();
					break;
				}
			}
		}
		
		static String jsonFile;
		public static String readJson(String fileName) {
			
			try {
				jsonFile = new String(Files.readAllBytes(Paths.get(fileName)));
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			return jsonFile;
		}
		
		
		
		
//		public static WebDriver setUp(String browser) {
//		
//		if(browser.equalsIgnoreCase("chrome")) {
//			System.setProperty("webdriver.chrome.driver", "/Users/natalia/eclipse-workspace/Selenium/drivers/chromedriver");
//			driver = new ChromeDriver();
//			
//		}else if(browser.equalsIgnoreCase("firefox")) {
//			System.setProperty("webdriver.gecko.driver", "/Users/natalia/eclipse-workspace/Selenium/drivers/geckodriver");
//			driver = new FirefoxDriver();
//		}
//		
//		return driver;
//	}

}
