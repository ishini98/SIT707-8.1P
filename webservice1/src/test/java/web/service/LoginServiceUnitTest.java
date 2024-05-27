package web.service;

import org.junit.Assert;
import org.junit.Test;

public class LoginServiceUnitTest {

    @Test
    public void testValidLogin() {
        // Arrange
        String username = "Ishini";
        String password = "Ishini_pass";
        String dob = "1998-03-16";

        // Act
        boolean result = LoginService.login(username, password, dob);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void testInvalidUsername() {
        // Arrange
        String username = "invalid_user";
        String password = "Ishini_pass";
        String dob = "1998-03-16";

        // Act
        boolean result = LoginService.login(username, password, dob);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void testInvalidPassword() {
        // Arrange
        String username = "Ishini";
        String password = "invalid_password";
        String dob = "1998-03-16";

        // Act
        boolean result = LoginService.login(username, password, dob);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void testInvalidDOB() {
        // Arrange
        String username = "Ishini";
        String password = "Ishini_pass";
        String dob = "01/11/2000"; // Invalid date format

        // Act
        boolean result = LoginService.login(username, password, dob);

        // Assert
        Assert.assertFalse(result);
    }
}
