package com.cucumber.auto;

import com.automation.cucumber.Helpers;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class tester {
    public static void main(String [] args) throws ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        Helpers help = new Helpers();
//        JSONObject jobj  = help.readJson("src/main/resources/fixtures.json");
//        String url = "";
//        ArrayList<Object> listOfTests = new ArrayList<>();
//        JSONObject body = new JSONObject();
//        for(Object keys : jobj.keySet()) {
//            body = (JSONObject) jobj.get(keys) ;
//        }

//User-Agent:com.life360.android.safetymapqa 99.0 TestNG-Automation

//        https://android.life360.com/v3/users/lookup?countryCode=1&phone=5059773266&returnAllMatches=0
        String url = "https://develop.life360.com/v3/users/lookup.json?phone=7327717104&countryCode=1' --header 'Authorization: Basic Y2F0aGFwYWNyQVBoZUtVc3RlOGV2ZXZldnVjSGFmZVRydVl1ZnJhYzpkOEM5ZVlVdkE2dUZ1YnJ1SmVnZXRyZVZ1dFJlQ1JVWQ==' --header 'User-Agent: com.life360.android.safetymapqa 99.0 TestNG-Automation";
//        String url = "https://google.com";
        JSONObject payload = new JSONObject();
        Class<?> className = Class.forName("com.automation.cucumber.Helpers");
        Method call = className.getDeclaredMethod("getRequestForm",String.class);

        Object obj = className.newInstance();
        Response getResponse = (Response) call.invoke(obj,url);
        System.out.println(getResponse.statusCode());
//        System.out.println(getResponse.body().prettyPrint());

//        Method setMethodName = obj.getClass().getDeclaredMethod("getRequest",String.class);
//        System.out.println(className.getMethods());
//        Method setMethodName = obj.getClass().getDeclaredMethod("getRequest",String.class);
//        Method postMethodName = obj.getClass().getDeclaredMethod("postRequest",String.class,JSONObject.class);
//        Method setMethodName = obj.getClass().getMethod("getRequest");
//        System.out.println(postMethodName);
//        Response getResponse = (Response) setMethodName.invoke(obj,url);
//        System.out.println(getResponse);













//            for(Object key : getValues.keySet()){
//                JSONObject gettingPayload = (JSONObject) getValues.get(key) ;
//                url = (String) gettingPayload.get("url");
//                payload = (JSONObject) gettingPayload.get("payload");
//                method = (String) gettingPayload.get("method");
//            }
    }






//        for(Object elements : jobj.values()){
//            System.out.println(elements);
//        }
//        for(int i = 0; i < jobj.size();i++){
//            System.out.println(jobj.get(i));
//        }

//
//        System.out.println(jobj.size());
//        JSONArray values = (JSONArray) jobj.get(0);
//        System.out.println(values);
//        System.out.println(jobj.values());
//        JSONObject jarr = (JSONObject) jobj.values();
//        System.out.println(jarr);
//        Object getKeys = jobj.values();
//        System.out.println((JSONObject)getKeys);

//        String url = "https://life360-dev.tile-api.com/api/v1/users/self";
//        Response obj = (Response) help.getRequest(url);
//
//        System.out.println(obj.body());
//        System.out.println(obj.statusCode());


//        JSONObject jobj = new JSONObject();
//        jobj.put("email","rparashar@life360.com");
//        jobj.put("password","Check@123");
//        jobj.put("redirectURI","https://www.life360.com/tile-redirect");
//        jobj.put("responseType","code");
//        jobj.put("state","demostring");
//        jobj.put("clientID","h1NA2QAH0UKf9rrAackZVZOZsvBcuwfDw6dBrsT51RNNYUVfYlkaKPGeRlSAQfTP");
//        jobj.put("scope","user%20tile");
////        JSONObject jobj = help.getRequest("https://life360-dev.tile-api.com");
//        String url = "https://web-development.thetileapp.com/oauth/v2/authorization?response_type=code&client_id=h1NA2QAH0UKf9rrAackZVZOZsvBcuwfDw6dBrsT51RNNYUVfYlkaKPGeRlSAQfTP&redirect_uri=https://www.life360.com/tile-redirect&scope=user%20tile&state=demouniquestring";
////        Response jobj = help.getRequest(url);
//        System.out.println(jobj);
//        Response obj = (Response) help.postRequest(url,jobj);
////        JSONObject jobj = help.getRequest("http://www.google.com");
//        System.out.println(obj.statusCode());
//        System.out.println("Lookkkk**************");
//        System.out.println(obj.body().prettyPrint());
    }
//}

/*
*
* {
       "email": "rparashar@life360.com",
       "password": "check@123",
        "redirectURI": "https://www.life360.com/tile-redirect",
     "responseType": "code",
        "clientID": "h1NA2QAH0UKf9rrAackZVZOZsvBcuwfDw6dBrsT51RNNYUVfYlkaKPGeRlSAQfTP",
     "state": "demostring",
       "scope": "user%20tile"
      }*/