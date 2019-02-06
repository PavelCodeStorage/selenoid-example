package com.project.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;


public class SearchPage extends BasePage {

    private By searchField = By.xpath("//input[@class='gLFyf gsfi']");
    private By submitButton = By.xpath("//div[@class='FPdoLc VlcLAe']//input[@type='submit' and not(contains(@jsaction, 'sf.lck'))]");

    public SearchPage(WebDriver driver) throws MalformedURLException {
        super(driver);
    }

    public SearchPage search(String value) {
        setElementText(searchField, value);
        clickReturn(submitButton);
        return this;
    }
}
