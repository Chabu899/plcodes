import java.util.Scanner;

// Custom exception for wrong password
class WrongPasswordException extends Exception {
    public WrongPasswordException(String message) {
        super(message);
    }
}

public class exp4 {
    private static final String CORRECT_PASSWORD = "password123"; // Set the correct password here

    // Method to authenticate user
    public static void authenticate(String password) throws WrongPasswordException {
        if (!password.equals(CORRECT_PASSWORD)) {
            throw new WrongPasswordException("Authentication Failed: Wrong password!");
        } else {
            System.out.println("Authentication Successful: Welcome!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();

        try {
            authenticate(inputPassword); // Call the authentication method
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage()); // Print exception message if authentication fails
        } finally {
            scanner.close();
        }
    }
}
