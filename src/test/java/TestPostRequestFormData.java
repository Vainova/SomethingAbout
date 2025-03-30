import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class TestPostRequestFormData {

    @Test
    public void testPostRequestFormData(){
        Person person = new Person("123", "Michael");
        RestAssured.baseURI = "https://postman-echo.com";

        Response response = given().log().all()
                .contentType("application/x-www-form-urlencoded; charset=utf-8")
                .formParam("id", person.getId())
                .formParam("name", person.getName())
                .when()
                .post("/post");

        response.then().statusCode(200);
        response.then().body("form.id",equalTo(person.getId()));
        response.then().body("form.name",equalTo(person.getName()));
    }
}
