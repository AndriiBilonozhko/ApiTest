import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class FirstTest {
    @Test
    public void getRequestTest() {
        given()
                .baseUri("https://reqres.in")
                .contentType(ContentType.JSON)
                .queryParam("page", 2)
                .get("https://reqres.in/api/users")
                .then().log().all()
                .and()
                .statusCode(200);
    }

    @Test
    public void postRequestTest() {
        given()
                .baseUri("https://reqres.in")
                .contentType(ContentType.JSON)
                .post("https://reqres.in/api/users")
                .then().log().all()
                .and()
                .statusCode(201);
    }
}
