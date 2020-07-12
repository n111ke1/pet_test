package uiTest;

import org.testng.annotations.Test;
import pages.MainPage;

public class uiTestNewOwner extends BaseTest {


    @Test
    public void createNewOwner(){
        new MainPage()
                .showAllOwners()
                .clickAddNewOwner()
                .inputAllFields("name", "lastName", "str.Test 234", "TestCity", "1231231231")
                .clickAddNewOwner()
                .checkOwnersFullName("name"+ " lastName");

    }






}
