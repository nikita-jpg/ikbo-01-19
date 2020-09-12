public class Main {
    public static void main(String args[])
    {
        String palindrom = "ABA";
        String notPalindrom = "ASD";

        isPalindromeFor(palindrom);
        isPalindromeFor(notPalindrom);
    }
    static boolean isPalindromeFor(String str) {
        boolean flag = true;
        for (int i=0 ; i<str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i -1)) flag = false;
        }

        if(flag)
            System.out.println(str+" is palindrom");
        else
            System.out.println(str + " is not a palindrom");

        return flag;
    }
}
