package com.bookingpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ObjectModel extends BasePage{

	public ObjectModel(WebDriver driver) {
		super(driver);
		
	}@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[1]")
	WebElement editRoundtrip;
	
	public void clickround() {
		editRoundtrip.click();
		
	}public void   Passenger() {
	WebElement editpassenger=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/b/select"));
	 
	Select sel=new Select(editpassenger);
	sel.selectByVisibleText("3");
	
	}
	
	public void Deperting() {
		WebElement deperting=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/select"));
		Select sel=new Select(deperting);
		sel.selectByVisibleText("New york");
		
	}	
	public void Month() {
		WebElement month=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[5]/td[2]/select[1]"));
		Select sel=new Select(month);
		sel.selectByVisibleText("July");
		
	}
	public void Date() {
		WebElement date=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[5]/td[2]/select[2]"));
		Select sel=new Select(date);
		sel.selectByVisibleText("15");
	
	}
	public void Arriving() {
		WebElement arriving=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[6]/td[2]/select"));
		Select sel=new Select(arriving);
		sel.selectByVisibleText("Paris");
	
	
	}
	public void ReturnMonth() {
		WebElement returnmonth=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/select[1]"));
		Select sel=new Select(returnmonth);
		sel.selectByVisibleText("july");
		
	}	
	public void ReturnDate() {
		WebElement returndate=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/select[2]"));
		Select sel=new Select(returndate);
		sel.selectByVisibleText("20");
		
	}@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/input")
	WebElement Class;
	public void ServiceClass() {
	Class.click();
		 
	}
	public void Airline() {
		WebElement airline=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/select"));
		Select sel=new Select(airline);
		sel.selectByVisibleText("Unified Airlines");
		
	}@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td/input")
	WebElement Continue;
	public void ClickContinue() {
		Continue.click();
		 
	}
	
	
	
	
	

}
