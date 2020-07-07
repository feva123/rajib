package com.bookingpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserModel extends BasePage {

	public UserModel(WebDriver driver) {
		super(driver);
	
	}@FindBy(xpath=" /html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")
	WebElement Username;
	public void UserName(String username) {
	Username.sendKeys("mahmed");
	
	}@FindBy(xpath=" /html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input")
	WebElement Userpassword;
	public void Password(String password) {
	Userpassword.sendKeys("112233");
	
	}@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")
	WebElement Usersubmit;
	public void Submit() {
	Usersubmit.click();
	}

}
