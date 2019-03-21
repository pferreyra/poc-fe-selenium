package com.pferreyra.app.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListadoResultados {
  private WebDriver driver;
  private List<WebElement> listado;
  private By filtro = By.className("qcat-truncate");

  public ListadoResultados (WebDriver driver){
    this.driver = driver;
  }

  public String seleccionarFiltro () {
    listado = driver.findElements(filtro);
    String titulo = listado.get(1).getAttribute("Title");
    return titulo;
    // TODO Agregar para que busque random en el listado
  }

}
