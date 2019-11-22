package apiTest;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

/**
 * Created by User on 22.11.2019
 **/
public class Api_1 {

    @Test
    public void getWeatherDetails() {
        RestAssured.baseURI = "https://devkube.roomster.com/v2.0/gateway";
        RequestSpecification httpRequest = RestAssured.given();

        Response response = httpRequest.request(Method.GET, "/auth/providers");

        String responseBody = response.getBody().asString();
        System.out.println("responseBody = " + responseBody);
    }
}
