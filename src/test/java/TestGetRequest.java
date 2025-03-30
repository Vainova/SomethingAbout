import io.restassured.RestAssured;
import io.restassured.response.Response;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class TestGetRequest {

    @Test
    public void testGetRequest() {
        get();
    }

    public void get() {
        RestAssured.baseURI = "https://postman-echo.com";

           Response response =  given().log().all()
                    .param("foo1", "bar1")
                    .param("foo2", "bar2")
                    .when()
                    .get("/get");
           response.then().statusCode(200);
           response.then().body("args.foo1", equalTo("bar1"));
           response.then().body("args.foo2", equalTo("bar2"));
    }
}
