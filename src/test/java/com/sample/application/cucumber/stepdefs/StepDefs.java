package com.sample.application.cucumber.stepdefs;

import com.sample.application.SampleMicroserviceApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = SampleMicroserviceApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
