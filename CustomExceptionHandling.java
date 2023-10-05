
package Unit1;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
public class CustomExceptionHandling {
     public static void main(String[] args) {
        try {
            // Simulate a situation where a custom exception is thrown
            int age = -5;
            if (age < 0) {
                throw new CustomException("Age cannot be negative.");
            }

            System.out.println("Age: " + age);
        } catch (CustomException e) {
            // Catch the custom exception and handle it
            System.err.println("CustomException caught: " + e.getMessage());
        }
    }
}
