package com.pferreyra.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class VistaProducto {
	protected WebDriver driver;
	private By tituloProducto = By.className("item-title__primary");
	private By botonComprarAhora = By.id("BidButtonTop");

	public VistaProducto(WebDriver driver) {
		    this.driver = driver;
		  }
	
	public String ProductoPreview() {
		String tituloObtenido = driver.findElement(tituloProducto).getText();
		return tituloObtenido;
	}
	
	public void IngresarAlCheckout() {
		driver.findElement(botonComprarAhora).click();
	}
	
}
