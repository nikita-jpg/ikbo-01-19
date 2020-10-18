import java.util.Scanner;

public class ThrowsDemo {

    ThrowsDemo(){}


    public void getKey() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print("Введите Key или \"-1\" для выхода из цикла");
        String key = "";
        while (!key.equals("-1")){
            try{key = myScanner.nextLine();
                printDetails( key );
            }
            catch (Exception e){
                System.out.println("Ошибка!");
            }
        }
    }
    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println( message );
    }
    private String getDetails(String key) throws Exception {
        if(key.equals("null")) {
            throw new Exception( "Key set to \"null\" string" );
        }
        return "data for " + key;
    }
}