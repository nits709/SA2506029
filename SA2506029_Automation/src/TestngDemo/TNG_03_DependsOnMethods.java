package TestngDemo;

import org.testng.SkipException;
import org.testng.annotations.Test;

import WebdriverDemos.baseFunction;

public class TNG_03_DependsOnMethods extends baseFunction {

	boolean flag = true;

	@Test(priority = 1)
	public void search() {
		if (flag) {
			throw new SkipException("Skipping test");
		}
		System.out.println("search a phone");
	}

	@Test(priority = 2, dependsOnMethods = { "search" })
	public void selectPhonefromPDP() {
		System.out.println("add phone to cart from PDP");
	}

	@Test(priority = 3, dependsOnMethods = { "search", "selectPhonefromPDP" })
	public void checkout() {
		System.out.println("checkout the phone");
	}

}
