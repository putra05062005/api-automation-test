package utils;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class AuthHelper {

    public static String getToken() {

        String body = """
        {
          "email": "rftkohin@gmail.com",
          "password": "S1pr3t321"
        }
        """;

        Response response = given()
                .header("Content-Type", "application/json")
                .body(body)
                .post("/api/auth/login");

        return response.jsonPath().getString("data.token");
    }
}