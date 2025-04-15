package org.docker.DockerTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * Unit test for simple App.
 */
public class AppTest {

	@Test
	public void testUntitled() throws MalformedURLException {

		//ChromeOptions options = new ChromeOptions();
		FirefoxOptions options = new FirefoxOptions();
		URL gridUrl = new URL("http://localhost:4444/wd/hub");

		WebDriver driver = new RemoteWebDriver(gridUrl, options);
		driver.get("https://www.google.com/");
		System.out.println("Title: " + driver.getTitle());
		driver.quit();


	}
}
