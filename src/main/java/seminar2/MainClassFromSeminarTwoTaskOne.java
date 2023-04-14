package seminar2;

import java.util.Scanner;
public class MainClassFromSeminarTwoTaskOne {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        String string = in.next();
        System.out.println(isPalindrome(string));
        in.close();
    }
    public static boolean isPalindrome(String string) {
        return string.equals((new StringBuilder(string)).reverse().toString());
    }
}
