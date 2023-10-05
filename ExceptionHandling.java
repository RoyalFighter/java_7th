/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit1;


// it is a mechanism to handle runtime error, it uses following keywords
// try: used to surround the code that might cause error
// catch: used to handle error that is caught on try
// throw: to explicitly throw an error i.e. to throw error from any place
// finally: whether exception happens of not, anything inside this block will run
// throws: to handle error that might generate from method
public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catch the exception and handle it
            System.err.println("An error occurred: " + e.getMessage());
        } finally {
            // Code that will always execute, regardless of whether an exception occurred
            System.out.println("Finally block executed.");
        }
    }

    public static int divide(int num1, int num2) {
        // Attempt to divide num1 by num2
        return num1 / num2;
    }
}
