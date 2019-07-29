package com.pferreyra.app.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.pferreyra.app.pages.HomePage;
import com.pferreyra.app.pages.ListadoResultados;
import com.pferreyra.app.pages.VistaProducto;

public class SeleccionarUnProducto {
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
	    driver.quit();
	  }

	@Test
	public void testSeleccionarProducto() {
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
		String tituloObtenido = detalleProducto.ProductoPreview();
		assertEquals(tituloProducto, tituloObtenido, "El título del item seleccionado no es el mismo del obtenido");
		}
		
	}
	

}
