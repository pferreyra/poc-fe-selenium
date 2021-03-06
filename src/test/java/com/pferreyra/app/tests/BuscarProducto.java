package com.pferreyra.app.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.pferreyra.app.pages.HomePage;

public class BuscarProducto {

	WebDriver driver;
	HomePage busquedaProducto;

	@BeforeEach
	void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\paula.ferreyra\\eclipse-workspace\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void testBusqueda() throws InterruptedException {
		busquedaProducto = new HomePage(driver);
		String busqueda = "notebook";
		String busquedaAplicada = busquedaProducto.ingresarBusqueda(busqueda);
		assertEquals(busqueda, busquedaAplicada, "La búsqueda aplicada es diferente de la especificada");
	}

}
