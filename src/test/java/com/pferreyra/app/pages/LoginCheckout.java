package com.pferreyra.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginCheckout {
	protected WebDriver driver;
	private By tituloLoginCheckout = By.className("auth-title");
	public LoginCheckout(WebDriver driver) {
	    this.driver = driver;
	  }
	
	public String TituloSinLogin() {
		String titulo = driver.findElement(tituloLoginCheckout).getText();
		return titulo;
	}

}
