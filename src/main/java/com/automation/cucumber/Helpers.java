package com.automation.cucumber;

import io.cucumber.messages.JSON;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import static io.restassured.RestAssured.given;


public class Helpers {
    private JSONObject retResponse;
//    private RestAssured.baseURI = "https://life360-dev.tile-api.com/";

    public Response getRequest(String url){
        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .get(url)
                .then()
                .extract().response();
        return response;
    }
    public Response getRequestForm(String url){
        Response response = given()
//                .contentType(ContentType.fromContentType())
                .when()
                .get(url)
                .then()
                .extract().response();
        return response;
    }

    public Response getRequestURI(String url){
        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .get(url)
                .then()
                .extract().response();
        return response;
    }
    public Response postRequest(String url, JSONObject payload){
        Response response = given()
                .header("Content-type","application/json")
                .body(payload)
                .and()
                .post(url)
                .then()
                .extract().response();
        return response;
    }

    public JSONObject putRequest(String url, JSONObject payload){
        return retResponse;
    }
    public JSONObject deleteRequest(String url){
        return retResponse;
    }

    public JSONObject readJson(String jsonfileUrl){
        JSONObject jobject = new JSONObject();
        JSONParser parser = new JSONParser();
        try(FileReader reader = new FileReader(jsonfileUrl)){
            jobject = (JSONObject)parser.parse(reader);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }


        return jobject;
    }

}
