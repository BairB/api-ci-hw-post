package ru.domain.netology;

import io.restassured.mapper.ObjectMapper;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;

class PostTest {
    @Test
    void shouldSendBodyRequest() {
        // Given - When - Then
// Предусловия
        given()
                .baseUri("https://postman-echo.com")
                // отправляемые данные (заголовки и query можно выставлять аналогично)

                .body("Birthday - 25.05")
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(202)

                .body("data", equalTo("Birthday - 25.05"))


        ;
    }
}
