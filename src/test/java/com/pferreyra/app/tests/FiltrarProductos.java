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
				"C:\\Users\\paula.ferreyra\\eclipse-workspace\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
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
		int cantidadDeFiltros = filtradoProducto.tamañoListado();
		for (int i=0; i<=cantidadDeFiltros; i++) {
			String filtroAplicado = filtradoProducto.seleccionarFiltro(i);
			String tituloFiltroAplicado = filtradoProducto.tituloFiltroAplicado();
			//TODO Poner en el basePage un método para volver
			assertEquals(filtroAplicado, tituloFiltroAplicado, "El filtro aplicado es diferente al especificado");
		}


	}

}
