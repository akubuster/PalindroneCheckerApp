/**
 * UC1: Application Entry & Welcome Message
 * Palindrome Checker Application
 */

public class UseCase1PalindromeCheckerApp {

    // Application constants
    private static final String APP_NAME = "Palindrome Checker Application";
    private static final String APP_VERSION = "Version 1.0";
    /**
     * Main Method - Entry point of the Java application
     * JVM invokes this method automatically
     */
    public static void main(String[] args) {

        // Display Welcome Message
        System.out.println("========================================");
        System.out.println("        Welcome to the Application      ");
        System.out.println("========================================");

        // Display Application Details
        System.out.println("Application Name : " + APP_NAME);
        System.out.println("Application Version : " + APP_VERSION);

        System.out.println("========================================");
        System.out.println("Application Started Successfully!");
        System.out.println("Proceeding to next use case...");
        System.out.println("========================================");

        // End of UC1 - Control will move to next use case in future implementation
    }
}}
}
