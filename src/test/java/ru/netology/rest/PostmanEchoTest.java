package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {
    @Test
    void test1() {
        given()
                .baseUri("https://postman-echo.com")
                .body("Happened")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("Happened"));
    }
}
