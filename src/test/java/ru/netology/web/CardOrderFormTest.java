package ru.netology.web;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CardOrderFormTest {
    private WebDriver driver;

    @BeforeAll
    static void setUpAll() {System.setProperty("webdriver.chrome.driver", "./driver/win/chromedriver.exe"); }

    @BeforeEach
    void setUp() { driver = new ChromeDriver(); }

    @AfterEach
    void tearDown() {
        driver.quit();
        driver = null;
    }

   g @Test
    void shouldTestV1() throws InterruptedException {
        driver.get("http://localhost:9999");
        Thread.sleep(50000);
    }
}
