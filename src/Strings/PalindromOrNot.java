package strings;

import java.util.Scanner;
/*
 *  Input : madam
 *  Output : The string is a palindrome
 * 
 *  Input : Hello
 * Output : The string is not a palindrome
 * 
 */

public class PalindromOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        sc.close();
        String rev = "";
        char[] c = str.toCharArray();
        for (int i = c.length - 1; i >= 0; i--) {
            rev += (c[i]);
        }
        if (str.equals(rev)) {
            System.out.println("The string is a palindrome");
        } else {
            System.out.println("The string is not a palindrome");
        }
    }
}
