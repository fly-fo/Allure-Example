package io.qameta.allure;

import io.qameta.allure.Allure;
import io.qameta.allure.AllureId;
import io.qameta.allure.Manual;
import org.junit.jupiter.api.Test;

public class ManualTest2 {

    @Test
    @AllureId("10903")
    @Manual
    @io.qameta.allure.Epic("Test Execution")
    @io.qameta.allure.Feature("Manual Test Run")
    @io.qameta.allure.Story("Run Single Manual Test")
    @io.qameta.allure.Description("Test the execution of a single manual test case")
    public void testRunOneManualTest() {
        Allure.step("Go to Test Cases section", () -> {});

        Allure.step("Find manual test in the table", () -> {});

        Allure.step("Initiate test run via context menu", () -> {
            Allure.step("Right-click on test name in the test list", () -> {
                Allure.step("Expected Result", () -> {
                    Allure.step("Context menu appears", () -> {});
                    Allure.step("Menu contains 'Run' option", () -> {});
                });
            });
        });

        Allure.step("Left-click on 'Run' option", () -> {
            Allure.step("Expected Result", () -> {
                Allure.step("Launch dialog appears showing we're running 1 manual test (see screenshot)", () -> {});
            });
        });

        Allure.step("Click 'Submit' button", () -> {
            Allure.step("Expected Result", () -> {
                Allure.step("Notification about launch creation appears in bottom-right corner", () -> {});
            });
        });

        Allure.step("Go to Launches section", () -> {});

        Allure.step("Find the newly created launch in the list", () -> {});
    }
}
