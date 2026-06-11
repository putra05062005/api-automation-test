package tests;

import org.junit.jupiter.api.Test;
import requests.UserRequest;
import utils.AuthHelper;
import utils.BaseTest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class UserTest extends BaseTest {

    @Test
    void getAllStudents() {
        String token = AuthHelper.getToken();

        UserRequest.getAllStudents(token)
                .then()
                .statusCode(200)
                .body("success", equalTo(true));
    }

    @Test
    void getStudentById() {
    String token = AuthHelper.getToken();

    UserRequest.getAllStudents(token)
            .then()
            .statusCode(200)
            .body("data", notNullValue());
    }

    @Test
    void createStudent() {
        String token = AuthHelper.getToken();

    long random = System.currentTimeMillis();

    String body = """
    {
      "nama": "Test User",
      "nis": "%d",
      "kelas": "X-IPA-1",
      "jurusan": "IPA",
      "email": "test%d@mail.com"
    }
    """.formatted(random, random);

        UserRequest.createStudent(token, body)
                .then()
                .statusCode(anyOf(is(200), is(201)));
    }

    @Test
    void checkStudentExists() {
        String token = AuthHelper.getToken();

        UserRequest.getAllStudents(token)
                .then()
                .statusCode(200)
                .body("data", notNullValue());
    }

    @Test
    void responseTimeCheck() {
        String token = AuthHelper.getToken();

        UserRequest.getAllStudents(token)
                .then()
                .time(lessThan(5000L));
    }

    @Test
    void getStudentsWithoutToken() {
        given()
        .when()
            .get("/api/siswa")
        .then()
            .statusCode(401);
    }
}