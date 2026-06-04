package practiceProblem1.day19;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserRegistration {

    private static final String FIRST_NAME_REGEX = "^[A-Z][a-z]{2,}$";
    private static final String LAST_NAME_REGEX = "^[A-Z][a-z]{2,}$";
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
    private static final String MOBILE_REGEX = "^[0-9]{2}\\s[0-9]{10}$";
    private static final String PASSWORD_REGEX = "^(?=.*[A-Z])(?=.*[0-9])(?=[^[^a-zA-Z0-9\\s]]*[^a-zA-Z0-9\\s][^[^a-zA-Z0-9\\s]]*$).{8,}$";

    public static boolean validateFirstName(String firstName) {
        return Pattern.matches(FIRST_NAME_REGEX, firstName);
    }

    public static boolean validateLastName(String lastName) {
        return Pattern.matches(LAST_NAME_REGEX, lastName);
    }

    public static boolean validateEmail(String email) {
        return Pattern.matches(EMAIL_REGEX, email);
    }

    public static boolean validateMobileNumber(String mobile) {
        return Pattern.matches(MOBILE_REGEX, mobile);
    }

    public static boolean validatePassword(String password) {
        return Pattern.matches(PASSWORD_REGEX, password);
    }

    public static void main(String[] args) {
        System.out.println("=== USER REGISTRATION VALIDATOR PROTOTYPE ===\n");

        String firstName = "Prabhakaran";
        String lastName = "Jayapal";
        String mail = "prabha@gmail.com";
        String mobile = "91 9944354052";
        String password = "Prabha@123";

        System.out.println(firstName+" is Valid " + validateFirstName(firstName));
        System.out.println(lastName+" is Valid " + validateLastName(lastName));
        System.out.println(mail+" is Valid :" + validateEmail(mail));
        System.out.println(mobile+ "is Valid " + validateMobileNumber(mobile));
        System.out.println(password+" is Valid " + validatePassword(password));

    }
}
