package com.ncl.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ncl.utils.CommonMethods;
public class HomePage extends CommonMethods {

	
		@FindBy(xpath="//div[@class='c22_menu']")
		public WebElement des;

		@FindBy(xpath="//span[@class='e5_label']")
		public WebElement Ac;
		
		@FindBy(linkText="Apply")
		public WebElement Ap;
		
		@FindBy(xpath="//div[@class='e1']")
		public WebElement date;
		
		@FindBy(xpath="//label[@class='btn btn-outline-primary']")
		public WebElement Mon;
		
		
		@FindBy(linkText="Find a Cruise")
		public WebElement btm;
		
		@FindBy(xpath="//a[@class='btn btn-secondary btn-lg']")
		public WebElement veiw;
		
		@FindBy(linkText="$719")
		public WebElement price;
		
		@FindBy(xpath="//a[@class='c133_link nav-link link-2']")
		public WebElement datePrice;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
