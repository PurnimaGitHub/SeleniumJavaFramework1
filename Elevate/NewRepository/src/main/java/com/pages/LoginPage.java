package com.pages;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.Select;

	public  class LoginPage {
		// This class will store all the locators and defined getters and setters,constructors and methods of login

		WebDriver driver;
		String Username;
		String Password;
		String Localevalue;
		@FindBy(id = "LOGIN_NAME")
		WebElement username;
		@FindBy(id = "DISPLAY_PASSWORD")
		WebElement password;
		@FindBy(id = "locale")
		WebElement localeSelection;
		@FindBy(id = "log_in")
		WebElement loginbutton;
		@FindBy(id = "REMEMBER_ME")
		WebElement rememberCheckbox;

		public LoginPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		public void setUserName(String Username) {
	           this.Username = Username;
			username.sendKeys(Username);
		}
		 public String getUserName(){
			 return Username;
		 }

		public void setPassword(String Password) {
			this.Password = Password;
			password.sendKeys(Password);
		}
		
		public String getPassword(){
			return Password;
		}
		
		public void clickLoginButton(){
			loginbutton.click();
		}
		

}
