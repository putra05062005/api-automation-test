package requests;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class UserRequest {

    public static Response getAllStudents(String token) {
        return given()
                .header("Authorization", "Bearer " + token)
                .get("/api/siswa");
    }

    public static Response getStudentById(String token, String id) {
        return given()
                .header("Authorization", "Bearer " + token)
                .get("/api/siswa/" + id);
    }

    public static String getFirstStudentId(String token) {
        return given()
                .header("Authorization", "Bearer " + token)
                .get("/api/siswa")
                .then()
                .extract()
                .path("data[0].id");
    }

    public static Response createStudent(String token, String body) {
        return given()
                .header("Authorization", "Bearer " + token)
                .header("Content-Type", "application/json")
                .body(body)
                .post("/api/siswa");
    }
}