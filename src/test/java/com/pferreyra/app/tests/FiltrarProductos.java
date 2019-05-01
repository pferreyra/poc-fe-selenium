package com.pferreyra.app.tests;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.pferreyra.app.pages.HomePage;
import com.pferreyra.app.pages.ListadoResultados;

class FiltrarProductos {
  WebDriver driver;
  HomePage busquedaProducto;
  ListadoResultados filtradoProducto;

  @BeforeEach
  void setUp() throws Exception {
    System.setProperty("webdriver.gecko.driver", "//Users//paulaferreyra//Java//Repositorios//Selenium//geckodriver");
    driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().window().maximize();
  }

  @AfterEach
  void tearDown() throws Exception {
    driver.quit();
  }

  @Test
  void testFiltrado() {
    busquedaProducto = new HomePage(driver);
    busquedaProducto.ingresarSitio();
    String busqueda = "Notebook";
    busquedaProducto.ingresarBusqueda(busqueda);
    filtradoProducto = new ListadoResultados(driver);
    String filtroAplicado = filtradoProducto.seleccionarFiltro();
    System.out.println(filtroAplicado);
  }

}
