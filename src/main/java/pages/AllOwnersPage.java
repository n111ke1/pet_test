package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class AllOwnersPage {

By addOwnerBtn = By.cssSelector("button.btn-default");

    public NewOwnerPage clickAddNewOwner(){
        $(addOwnerBtn).shouldBe(Condition.visible).click();
        return new NewOwnerPage();
}

    public void checkOwnersFullName(String fullName){
        sleep(10000);
    $$("ownerFullName").texts().contains(fullName);
    }

}
