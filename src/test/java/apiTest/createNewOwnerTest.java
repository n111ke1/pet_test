package apiTest;

import io.restassured.RestAssured;
import models.Owner;
import org.testng.annotations.Test;

public class createNewOwnerTest extends BaseApiTest {


    @Test
    public void createOwnerTest(){
      Owner owner =  RestAssured
               .given()
               .body("{\n" +
                       "  \"address\": \"test\",\n" +
                       "  \"city\": \"test\",\n" +
                       "  \"firstName\": \"NikTest\",\n" +
                       "  \"id\": 0,\n" +
                       "  \"lastName\": \"last\",\n" +
                       "  \"pets\": null,\n" +
                       "  \"telephone\": \"1231231231\"\n" +
                       "}")
               .when()
               .post("/owners")
               .then()
               .statusCode(201).log().all()
               .extract()
               .body().as(Owner.class);


    }


}
