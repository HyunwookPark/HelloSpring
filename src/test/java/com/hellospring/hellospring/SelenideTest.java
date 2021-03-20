package com.hellospring.hellospring;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.By;

public class SelenideTest {

//	@Test
	void testtest() {
		System.setProperty("webdriver.chrome.driver", "D:\\tools\\chromedriver_win32\\87.0.4280.88\\chromedriver.exe");
		open("http://google.com");
		$(By.name("q")).setValue("バナナ 大好き").pressEnter();

		$("#result-stats").shouldHave(text("約 13,200,000 件"));
	}
}
