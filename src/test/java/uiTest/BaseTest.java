package uiTest;

import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {


    @BeforeMethod
    public void  beforeTest(){
        open("http://46.101.230.213:8000/");
   }


}
