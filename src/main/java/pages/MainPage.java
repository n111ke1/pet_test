package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class MainPage extends BasePage{

public AllOwnersPage showAllOwners(){
    $(byText("Owners")).shouldBe(Condition.visible).click();
    $(allInOwners).shouldBe(Condition.visible).click();
    return new AllOwnersPage();
}

}
