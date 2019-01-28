package com.pferreyra.app.tests;

import com.pferreyra.app.pages.HomePage;
import static org.junit.jupiter.api.Assertions.fail;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



class BuscarPaquete {

  WebDriver driver;
  HomePage busquedaPaquete;

  @BeforeEach
  void setUp() throws Exception {
    driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().window().maximize();
  }

  @AfterEach
  void tearDown() throws Exception {
  }

  @Test
  public void test() {
	  busquedaPaquete = new HomePage(driver);
	  busquedaPaquete.ingresarSitio();
	  String desde = "Buenos Aires";
	  busquedaPaquete.ingresarOrigen(desde);
  }

}
