package com.pferreyra.app.pages;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListadoResultados {
  private WebDriver driver;
  private List<WebElement> listado;
  private By filtro = By.className("qcat-truncate");

  public ListadoResultados(WebDriver driver) {
    this.driver = driver;
  }

  public String seleccionarFiltro() {
    listado = driver.findElements(filtro);
    int listadoSize = listado.size();
    int randomFiltro;
    do {
      randomFiltro = ThreadLocalRandom.current().nextInt(listadoSize);
    } while (!listado.get(randomFiltro).isDisplayed());
    String titulo = listado.get(randomFiltro).getAttribute("Title");
    listado.get(randomFiltro).click();
    return titulo;
    // TODO Agregar para ver si el filtro es clickeable
  }

}