package com.pferreyra.app.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.pferreyra.app.pages.HomePage;
import com.pferreyra.app.pages.ListadoResultados;
import com.pferreyra.app.pages.VistaProducto;

class IngresarAlCheckout {
	  WebDriver driver;
	  ListadoResultados filtradoProducto;
	  HomePage busquedaProducto;
	  VistaProducto detalleProducto;

	@BeforeEach
	  void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\paula.ferreyra\\eclipse-workspace\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
	  }
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngresarAlCheckout() {
		 busquedaProducto = new HomePage(driver);
		    String busqueda = "notebook";
		    busquedaProducto.ingresarBusqueda(busqueda);
		    filtradoProducto = new ListadoResultados(driver);
			String tituloProducto = filtradoProducto.seleccionarPrimerItem();
			if (tituloProducto == null) {
				System.out.println("No hay productos listados");
			}
			else {
			detalleProducto = new VistaProducto(driver);
			detalleProducto.IngresarAlCheckout();
			}
	}

}
