package com.pferreyra.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pferreyra.app.helpers.*;

public class HomePage extends BasePage {
	private By buscar = By.name("as_word");
	private By botonBuscar = By.className("nav-search-btn");
	private By tituloFiltro = By.className("breadcrumb__title");
	protected WebDriver driver;
	//TODO pasar todo a pagefactory

	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		ingresarSitio();
		String currentURL = driver.getCurrentUrl();
		if (!baseUrl.equals(currentURL)) {
			System.out.println("El sitio ingresado es incorrecto, el sitio es: " + currentURL);
		}
	}

//	public void HomePageSetUp() throws Exception {
//		setUp();
//	}
	/**
	 * Ingresar una búsqueda de producto
	 * 
	 * @param busqueda texto del producto a buscar
	 */
	public String ingresarBusqueda(String busqueda) {
		driver.findElement(buscar).sendKeys(busqueda);
		driver.findElement(botonBuscar).click();
		String busquedaAplicada = driver.findElement(tituloFiltro).getText();
		return (busquedaAplicada);
	}

}
