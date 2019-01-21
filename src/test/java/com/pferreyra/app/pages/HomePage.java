package com.pferreyra.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class HomePage {
  WebDriver driver;
  final String url = "https://www.despegar.com.ar/";
  By origen = By.xpath("input[class*='sbox-origin']");
  By destino = By.xpath("input[class*='sbox-destination");
  By fechaIda = By.xpath("input[class*=sbox-checkin-date]");
  By fechaVuelta = By.xpath("input[class*='sbox-checkout-date");
  By buscar = By.xpath("//div[@class='sbox-button-horizontal-medium']//em[@class='btn-text']");
  By fechas = By.xpath("//input[contains(@type,'text') and contains(@class,'sbox-checkin-date')]");
  List<WebElement> calendario = driver.findElements(By.xpath("//span[contains(@class,'_dpmg2--date _dpmg2--available')]"));

  public HomePage (WebDriver driver){
    this.driver = driver;
  }

  //Ingresar a la página
  public void ingresarSitio () {
    driver.get(url);
  }

  // Ingresar Origen
  public void ingresarOrigen (String desde) {
    driver.findElement(origen).sendKeys(desde);
  }
  
  //Ingresar Fecha Desde
  public void ingresarFechaDesde (List<WebElement> calendario, int i) {
	  this.calendario = calendario;
	  driver.findElement(fechas).click();
	  calendario.get(i).click();
  }


  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }
}
