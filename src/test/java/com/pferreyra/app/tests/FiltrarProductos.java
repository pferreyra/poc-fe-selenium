package com.pferreyra.app.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.pferreyra.app.pages.HomePage;
import com.pferreyra.app.pages.ListadoResultados;

public class FiltrarProductos {
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
		int cantidadDeFiltros = filtradoProducto.filtrosListados();
		for (int i = 0; i <= cantidadDeFiltros; i++) {
			String filtroAplicado = filtradoProducto.seleccionarFiltro(i);
			String tituloFiltroAplicado;
			if (filtroAplicado == null) {
				tituloFiltroAplicado = null;
			} else {
				tituloFiltroAplicado = filtradoProducto.tituloFiltroAplicado();
			}
			assertEquals(filtroAplicado, tituloFiltroAplicado, "El filtro aplicado es diferente al especificado");
		}

	}

}
