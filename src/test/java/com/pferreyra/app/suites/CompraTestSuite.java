package com.pferreyra.app.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import com.pferreyra.app.tests.*;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;

@RunWith(JUnitPlatform.class)
@SelectClasses ({
	BuscarProducto.class,
	FiltrarProductos.class,
	SeleccionarUnProducto.class
	
})
public class CompraTestSuite {

}