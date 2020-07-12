package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class NewOwnerPage {

    By inputFirstName = By.cssSelector("#firstName");
    By inputLastName = By.cssSelector("#lastName");
    By inputAdress = By.cssSelector("#address");
    By inputCity = By.cssSelector("#city");
    By inputTelephone = By.cssSelector("#telephone");
    By addOwnerBtn = By.cssSelector("[type='submit']");

    public NewOwnerPage fillName(String name) {
        $(inputFirstName).shouldBe(Condition.visible).setValue(name);
        return this;
    }
    public NewOwnerPage fillLastName(String lastName){
        $(inputLastName).shouldBe(Condition.visible).setValue(lastName);
        return this;
    }
    public NewOwnerPage fillAdress(String adress){
        $(inputAdress).shouldBe(Condition.visible).setValue(adress);

        return this;
    }

    public NewOwnerPage fillCity(String city){
        $(inputCity).shouldBe(Condition.visible).setValue(city);
        return this;
    }

    public NewOwnerPage fillPhone(String phone){
        $(inputTelephone).shouldBe(Condition.visible).setValue(phone);
        return this;
    }

    public AllOwnersPage clickAddNewOwner(){
        $(addOwnerBtn).shouldBe(Condition.not(Condition.disabled)).click();
        return new AllOwnersPage();
    }

    public NewOwnerPage inputAllFields(String name, String lastName, String adress, String city, String phone){

        fillName(name);
        fillLastName(lastName);
        fillAdress(adress);
        fillCity(city);
        fillPhone(phone);
        return this;

    }





}
