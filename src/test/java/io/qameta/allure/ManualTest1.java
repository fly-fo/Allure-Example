package io.qameta.allure;

import org.junit.jupiter.api.Test;
import io.qameta.allure.Allure;
import io.qameta.allure.AllureId;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

@Epic("Authentication")
@Feature("Login Functionality")
public class ManualTest1 {

    @Test
    @AllureId("10901") // This links to existing manual test case in Allure TestOps
    @Story("Successful Login")
    @Description("Verify user can login with valid credentials")
    public void manualLoginTest() {
        // Manual test steps description
        Allure.step("1. Open the application login page");
        Allure.step("2. Enter valid username in username field");
        Allure.step("3. Enter valid password in password field");
        Allure.step("4. Click on Login button");
        Allure.step("5. Verify user is redirected to dashboard page");
        Allure.step("6. Verify welcome message contains username");

        // You can add automated assertions if needed
        // Assertions.assertTrue(true, "Sample assertion");
    }
}
