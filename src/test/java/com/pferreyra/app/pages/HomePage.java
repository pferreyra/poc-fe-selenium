package com.pferreyra.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {
  private WebDriver driver;
  private final String url = "https://www.mercadolibre.com.ar/";
  private By buscar = By.name("as_word");
  private By botonBuscar = By.className("nav-search-btn");


  public HomePage (WebDriver driver){
    this.driver = driver;
  }

  /**
   * Ingresar a la página
   */
  public void ingresarSitio () {
    driver.get(url);
  }

  /**
   * Ingresar una búsqueda de producto
   * @param busqueda texto del producto a buscar
   */
  public void ingresarBusqueda (String busqueda) {
    driver.findElement(buscar).sendKeys(busqueda);
    driver.findElement(botonBuscar).click();
  }


  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }
}
