import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class TestDeleteRequest {

    @Test
    public void testDeleteRequest() {
        Person person = new Person("123", "Michael");

        RestAssured.baseURI = "https://postman-echo.com";

        Response response = given().log().all()
                .body(person.getId())
                .when()
                .delete("/delete");

        response.then().statusCode(200);
        response.then().body("data",equalTo(person.getId()));
    }
}
