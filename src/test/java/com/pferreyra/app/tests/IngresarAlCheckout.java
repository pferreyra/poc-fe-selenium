package com.pferreyra.app.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.pferreyra.app.pages.*;


class IngresarAlCheckout {
	  WebDriver driver;
	  ListadoResultados filtradoProducto;
	  HomePage busquedaProducto;
	  VistaProducto detalleProducto;
	  LoginCheckout loginCheckout;

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
			String tituloEsperadoLogin = "¡Hola! Para comprar, ingresá a tu cuenta";
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
			loginCheckout = new LoginCheckout();
			String tituloLogin = loginCheckout.TituloSinLogin();
			assertEquals(tituloEsperadoLogin, tituloLogin, "El título del Login en el Checkout no es correcto");
			}
	}

}
