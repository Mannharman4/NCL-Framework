package com.ncl.testbase;

import com.ncl.pages.HomePage;
import com.ncl.testbase.BaseClass;

public class PageInitiliazer extends BaseClass {
	
	protected static HomePage home;
	
	public static void initialzePage(){
		home = new HomePage();
		
	}

}
