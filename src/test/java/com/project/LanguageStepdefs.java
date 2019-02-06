package com.project;

import com.project.helper.AllureAttachment;
import com.project.pages.SearchPage;
import com.project.webdriver.Driver;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ru.yandex.qatools.allure.cucumberjvm.AllureReporter;

import java.net.MalformedURLException;

/**
 * Created by Pavel on 1/17/2018.
 */
public class LanguageStepdefs {

    private SearchPage search;

    @Before
    public void setUp() throws MalformedURLException {
        search =new SearchPage(Driver.getDriver());
        AllureReporter.applyFailureCallback(AllureAttachment.class);
    }
    
    @Given("^User on main search page$")
    public void userOnLoginPage() {
        search.openUrl("https://www.google.com/");
    }

    @When("^User enters value \"([^\"]*)\" in the search field$")
    public void userEntersValueInTheSearchField(String value)  {
        search.search(value);
    }

    @Then("^List of results is appeared$")
    public void listOfResultsIsAppeared() {
    }
}
