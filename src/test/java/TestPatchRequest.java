import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class TestPatchRequest {

    @Test
    public void testPutRequest() {
        RestAssured.baseURI = "https://postman-echo.com";
        String requestBody = "This is expected to be sent back as part of response body.";

        Response response = given().log().all()
                .body(requestBody)
                .when()
                .patch("/patch");

        response.then().statusCode(200);
        response.then().body("data.",equalTo("This is expected to be sent back as part of response body."));
    }
}
