package com.pferreyra.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
  WebDriver driver;
  By origen = By.xpath("//input[class*='sbox-origin']");
  By destino = By.xpath("//input[class*='sbox-destination");
  By fechaIda = By.xpath("//input[class*='sbox-checkin-date");
  By fechaVuelta = By.xpath("//input[class*='sbox-checkout-date");
  
  


  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

}
