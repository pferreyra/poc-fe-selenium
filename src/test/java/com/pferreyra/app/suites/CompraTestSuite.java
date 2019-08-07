package com.pferreyra.app.suites;

import org.junit.runner.RunWith;
import com.pferreyra.app.tests.*;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;

@RunWith(JUnitPlatform.class)
@SelectClasses(BuscarProducto.class)
public class CompraTestSuite {

}