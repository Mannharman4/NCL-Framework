package com.ncl.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ncl.testbase.PageInitiliazer;

public class CommonMethods extends PageInitiliazer {

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
	 * This method will wait for the element to be click-able and will click on the element
	 * 
	 * @param element
	 */
	public static void click(WebElement element) {
		try {
			waitForClickability(element);
			element.click();
		}catch(ElementNotVisibleException e){
			System.out.println("Element not clickable");
		}
	}
	
	/**
	 * This method will click on the element and wait for specific element to be visible
	 * 
	 * @param element
	 */
	public static void clickAndWait(WebElement elementClick, WebElement elementWait) {
		try {
			elementClick.click();
			waitForVisibility(elementWait);
		}catch(ElementNotVisibleException e){
		System.out.println("Element not visible");
	}
	}
	
	/**
	 * This method will enter text
	 * 
	 * @param element
	 * @param value
	 */
	public static void sendText(WebElement element, String value) {
	
		try {
		waitForVisibility(element);
		element.clear();
		element.sendKeys(value);
	}catch(ElementNotVisibleException e){
		System.out.println("Element not visible");
	}
	}
	
	/**
	 * This method will click on the element using JSExecutor
	 * 
	 * @param element
	 */
	public static void jsClick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}
	
	/**
	 * This method will take a screenshot
	 * 
	 * @param fileName
	 */
	public static byte[] takeScreenshot(String fileName) {
		
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy_MMdd_HHmmss");
		String timeStamp=sdf.format(date.getTime());
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		byte[] picture=ts.getScreenshotAs(OutputType.BYTES);
		File file = ts.getScreenshotAs(OutputType.FILE);
		String scrshotFile=Constants.SCREENSHOT_FILEPATH+fileName+timeStamp+".png";
		
		try {
			FileUtils.copyFile(file, new File(scrshotFile));
		} catch (IOException e) {
			System.out.println("Cannot take a screenshot");
		}
		
		return picture;
	}
}
	
	

