package web.service;

/**
 * Business logic to handle login functions.
 * 
 * @author Ahsan.
 */
public class LoginService {

    /**
     * Static method returns true for successful login, false otherwise.
     * @param username
     * @param password
     * @param dob
     * @return
     */
    public static boolean login(String username, String password, String dob) {
        // Match a fixed user name, password, and date of birth.
        if ("Ishini".equals(username) && "Ishini_pass".equals(password) && "1998-03-16".equals(dob)) {
            return true;
        }
        return false;
    }
    
}
