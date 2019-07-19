package helpers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {

	private WebDriver driver;
	protected final String url = "https://www.mercadolibre.com.ar/";

	public BasePage(WebDriver driver) {
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	public void ingresarSitio() {
		driver.get(url);
	}

	public WebDriver getDriver() {
		return driver;
	}
	
//	protected void setUp() throws Exception {
//		System.setProperty("webdriver.gecko.driver",
//				"//Users//paulaferreyra//eclipse-workspace//selenium//geckodriver");
//		driver = new FirefoxDriver();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//	}
}
