package com.StepDefination;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="OHRM",glue={"com.OrangeHRMLogInTest"})


public class TestRunner {

}
