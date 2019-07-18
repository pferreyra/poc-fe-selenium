package com.pferreyra.app.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
		System.setProperty("webdriver.gecko.driver",
				"//Users//paulaferreyra//eclipse-workspace//selenium//geckodriver");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	void testFiltrado() throws InterruptedException {
		busquedaProducto = new HomePage(driver);
		String busqueda = "notebook";
		busquedaProducto.ingresarBusqueda(busqueda);
		filtradoProducto = new ListadoResultados(driver);
		String filtroAplicado = filtradoProducto.seleccionarFiltro();
		String tituloFiltroAplicado = filtradoProducto.tituloFiltroAplicado();
		assertEquals(filtroAplicado, tituloFiltroAplicado, "El filtro aplicado es diferente al especificado");
		Thread.sleep(2000);

	}

}
