import java.util.InputMismatchException;
import java.util.Scanner;

public class javaExceptionHandling {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
       try {
           int x = scanner.nextInt();
           int y = scanner.nextInt();
           System.out.println(x / y);
       }catch (ArithmeticException arithmeticException){
           System.out.println("java.lang.ArithmeticException: / by zero");
       }catch (InputMismatchException inputMismatchException){
           System.out.println("java.util.InputMismatchException");
       }catch(Exception exception){
           System.out.println(exception);
       }
    }
}
