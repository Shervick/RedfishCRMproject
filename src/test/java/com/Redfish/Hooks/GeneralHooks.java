package com.Redfish.Hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class GeneralHooks {
	Scenario scn;
	public WebDriver driver;
	// 1 Create the Public Method
	// 2 Use the @Before and @After Annotations with the methods
	// 3 Specify the package in the runner
	
	@Before
	
	public void screenshotssetup(Scenario s) {
		this.scn=s;
	}
	@After
	public void errorscreenshot() {
		
		TakesScreenshot scrnShot=(TakesScreenshot)driver;
		final byte[] data =scrnShot.getScreenshotAs(OutputType.BYTES);
		scn.embed(data, "image/png");
	}

}
