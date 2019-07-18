package helpers;

import org.openqa.selenium.WebDriver;

public class BasePage {

	private WebDriver driver;
	protected final String url = "https://www.mercadolibre.com.ar/";

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public void ingresarSitio() {
		driver.get(url);
	}

	public WebDriver getDriver() {
		return driver;
	}
}
