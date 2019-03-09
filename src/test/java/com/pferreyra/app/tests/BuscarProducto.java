package com.pferreyra.app.tests;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.pferreyra.app.pages.HomePage;



class BuscarProducto {

  WebDriver driver;
  HomePage busquedaProducto;

  @BeforeEach
  void setUp() throws Exception {
    System.setProperty("webdriver.gecko.driver", "//Users//paulaferreyra//Java//Repositorios//Selenium//geckodriver");
    driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().window().maximize();
  }

  @AfterEach
  void tearDown() throws Exception {
  }

  @Test
  public void test() throws InterruptedException {
    busquedaProducto = new HomePage(driver);
    busquedaProducto.ingresarSitio();
    Thread.sleep(20000);
    String busqueda = "Notebook";
    busquedaProducto.ingresarBusqueda(busqueda);
  }

}
