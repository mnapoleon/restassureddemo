package dev.michaelnapoleon.restassureddemo.controllers;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class RADemoControllerTest {

  @Test
  void shouldReturn200_And_ResultText() {
    given().log().all()
        .when().get("/test")
        .then().log().body().statusCode(200)
        .assertThat().body("resultText", equalTo("test result"));
  }
}
