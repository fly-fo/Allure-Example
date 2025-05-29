package io.qameta.allure;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class TestAllure {
    @Test
    @AllureId("10865")
    @DisplayName("Authenticate with username and password (Google Chrome)")
    @Tag("critical")
    @Epic("Authentication and Access Management")
    @Owner("Amir")
    @Feature("Authentication")
    public void TestAllure1() {
        step("Navigate to Login Page", () -> {
            step("Enter the Allure TestOps login page URL into the browsers address bar and press Enter", () -> {
                step("Expected Result", () -> {
                    step("The Allure TestOps login page is displayed with the Username and Password fields and the Continue button");
                });
            });
        });
        step("Enter Username", () -> {
            step("Enter the valid username in the Username field", () -> {
                step("Expected Result", () -> {
                    step("The valid username is entered in the Username field");
                });
            });
        });
        step("Open Web Browser", () -> {
            step("Launch the web browser", () -> {
                step("Expected Result", () -> {
                    step("The web browser opens and displays its default homepage or a new tab");
                });
            });
        });
        step("Enter Password", () -> {
            step("Enter the valid password in the Password field", () -> {
                step("Expected Result", () -> {
                    step("The valid password is entered in the Password field and masked by dots");
                });
            });
        });
        step("Submit Login Form", () -> {
            step("Click the Continue button", () -> {
                step("Expected Result", () -> {
                    step("The Allure TestOps login form is submitted");
                });
            });
        });
        step("New step");
        step("Verify Successful Authentication", () -> {
            step("Observe the behavior of Allure TestOps after submitting its login form", () -> {
                step("Expected Result", () -> {
                    step("The user is redirected to the Allure TestOps homepage (projects page)");
                    step("The Allure TestOps homepage (projects page) displays a user-specific profile picture in the bottom left corner of the screen");
                });
            });
        });
    }
}