package com.pages;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;

public class RFEPage {

	public static WebDriver driver;
	public static JavascriptExecutor js;

	@FindBy(id = "rp")
	public static WebElement recentProject;
	@FindBy(linkText = "RegressionProject")
	public static WebElement ProjectName;
	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Buying'])[1]/following::span[1]")
	public static WebElement Estimates;
	@FindBy(id = "CREATE_RFE_ELLIPSIS")
	public static WebElement createRFE;
	//@FindBy(id = "specRefId")
	//public static WebElement selectSpec;
	@FindBy(xpath = "//input[@value='5091443_5106391']")
	public static WebElement selectspec1;
	@FindBy(id = "continue")
	public static WebElement continueButton;
	@FindBy(id = "rfe_0.title")
	public static WebElement RFEtitle;
	@FindBy(id = "rfe_0.dueDate")
	public static WebElement dueDate;
	@FindBy(id = "open_calendar")
	public static WebElement calenderselection;
	@FindBy(id = "calendarContent")
	public static WebElement calencontent;
	@FindBy(id = "rfe_0.proposedCompletionDate")
	public static WebElement completionDate;
	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Proposed Order Completion Date:'])[1]/following::img[1]")
	public static WebElement selection;
	@FindBy(linkText = "25")
	public static WebElement selectcompletiondate;
	@FindBy(xpath="(.//*[normalize-space(text()) and normalize-space(.)='Add Item =>'])[1]/following::input[1]")
	public static WebElement userenteredSupplier;
	@FindBy( id="ui-active-menuitem")
	public static WebElement autoselect;
	@FindBy(id = "send_RFE")
	public static WebElement sendRFEButton;
	
	public RFEPage(WebDriver driver) {
		RFEPage.driver = driver;
	}

	public void selectProject() throws InterruptedException {
		recentProject.click();
		ProjectName.click();
		Thread.sleep(4000);
	}

	public void findEstimates() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		Actions act = new Actions(driver);
		act.moveToElement(Estimates).click().build().perform();
		Estimates.click();
	}

	public void createRFE() throws Exception {
		Thread.sleep(2000);
		createRFE.click();
		Thread.sleep(4000);
		//selectSpec.click();
		selectspec1.click();
		Thread.sleep(2000);
		continueButton.click();
	}

	public void RFEpage(String RFEname) {

		RFEtitle.sendKeys(RFEname);
	}

	public void dueDate() throws Exception {
		dueDate.click();
		Thread.sleep(1000);
		calenderselection.click();
		Thread.sleep(1000);
		List<WebElement> allValidDates = calencontent.findElements(By.tagName("a"));
		Thread.sleep(3000);
		for (WebElement date : allValidDates) {
			if (date.getText().equals("25")) {
				date.click();
				break;
			}}}

	
	public void completionDate() throws Exception
	{
		completionDate.click();
		Thread.sleep(1000);
		selection.click();
		Thread.sleep(2000);
		selectcompletiondate.click();
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(500);
		userenteredSupplier.click();
		Thread.sleep(1000);
		userenteredSupplier.sendKeys("j");
		Thread.sleep(4000);
		Actions action = new Actions(driver);
		WebElement supplierName =  driver.findElement(By.xpath("//ul[@class= 'ui-autocomplete ui-menu ui-widget ui-widget-content ui-corner-all']/child::li"));
		action.moveToElement(supplierName).click(supplierName).build().perform();
				sendRFEButton.click();				
			}
	}
	

	
	 

