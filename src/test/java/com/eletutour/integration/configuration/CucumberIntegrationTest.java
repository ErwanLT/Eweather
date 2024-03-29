package com.eletutour.integration.configuration;

import com.eletutour.integration.steps.SpringIntegrationTest;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = "com.eletutour.integration.steps")
public class CucumberIntegrationTest extends SpringIntegrationTest {
}