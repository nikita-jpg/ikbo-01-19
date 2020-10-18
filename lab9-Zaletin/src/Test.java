import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner scanner = new Scanner( System.in );
        int i = 1;

        while(i != -1){
            System.out.print( "Введите целое число или \"-1\" для завершения");
            String intString = scanner.next();
            try{
                i = Integer.parseInt(intString);
                System.out.println( 2 / i );
            }  catch ( NumberFormatException e ) {
                System.out.println("Не целове число");
            } catch ( ArithmeticException e ) {
                System.out.println("Деление на 0");
            } finally {
                System.out.print("");
            }
        }

        System.out.println("Собственное исключение");
        ThrowsDemo t = new ThrowsDemo();
        t.getKey();
    }
}
