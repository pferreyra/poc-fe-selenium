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
  private By filtroAplicado = By.className("applied-fliter");
  private List<WebElement> items;
  private By item = By.className("main-title");
  private int i;
  
  public ListadoResultados(WebDriver driver) {
    this.driver = driver;
  }

  public int tamañoListado() {
    listado = driver.findElements(filtro);
    int listadoSize = listado.size();
    return listadoSize;
  }
  
  public String seleccionarFiltro(int i) {
//    do {
//    randomFiltro = ThreadLocalRandom.current().nextInt(listadoSize);
//  } while (!listado.get(randomFiltro).isDisplayed());
	  this.i = i;
  	if (listado.get(i).isDisplayed()) {
  	    String titulo = listado.get(i).getAttribute("Title");
  	    listado.get(i).click();
  	    return titulo;
  	} else {
  		return null;
  	}

  }
   
  public String tituloFiltroAplicado () {
	    String tituloAplicado = driver.findElement(filtroAplicado).getText();
	    System.out.println(tituloAplicado);
	    return (tituloAplicado);
	  }
  
  public String seleccionarPrimerItem() {
	    items = driver.findElements(item);
	    int listadoSize = items.size();
	    String itemTitulo = null;
	    if (listadoSize > 0) {
	    	itemTitulo = items.get(0).getText();
	    	items.get(0).click();
	    }
		return itemTitulo;
	  }

}