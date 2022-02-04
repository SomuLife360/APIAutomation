package com.cucumber.auto;

import com.automation.cucumber.Helpers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;

public class stepDefinition {
    Helpers help = new Helpers();
    JSONObject jobj = help.readJson("src/main/resources/fixtures.json");
    JSONArray body = new JSONArray();
    String url = "";
    JSONObject payload = new JSONObject();
    String methods = "";



    @Given("job is running and available for (.*)$")
    public void jobIsRunningAndAvailableForMETHOD(String method) {
        Helpers help = new Helpers();
        JSONObject jobj  = help.readJson("src/main/resources/fixtures.json");
        String url = "";
        ArrayList<Object> listOfTests = new ArrayList<>();
        for(Object keys : jobj.keySet()) {
            body.add((JSONObject) jobj.get(keys) );
        }
//        System.out.println(body);
    }

    @When("when we send a request for (.*) and (.*) and requested operation is (.*) and action is (.*)$")
    public void whenWeSendARequestForAPIAndSTATUSAndRequestedOperationIsMETHODAndActionIsACTION(String api, String status, String method, String action) throws NoSuchMethodException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, InstantiationException {
        JSONObject tests = new JSONObject();

        HashMap<String, JSONObject> getCurrentTest = new HashMap<>();
//        Iterable<String> keys =
        for (int i = 0 ; i < body.size() ; i++){
            JSONObject getOptions = (JSONObject)body.get(i);
            JSONObject getValues = (JSONObject) getOptions.get(action);
            url = (String) getValues.get("url");
            Class<?> className = Class.forName("com/automation/cucumber/Helpers");
            Object obj = className.newInstance();
            Method setMethodName = className.getMethod(method,String.class);
            Response getResponse = (Response) setMethodName.invoke(obj,url);
            System.out.println(getResponse);

        }


    }

    @Then("response code is (.*) is (.*)$")
    public void responseCodeIsACTIONIsSTATUS(String action , String status) {

    }


}
