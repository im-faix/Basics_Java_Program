package strings;

import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String str = sc.nextLine();
        System.out.println("Original String ");
        
        System.out.println(str);
        System.out.println("After Reverse Each Word In String");
        System.out.println(reverseWords(str));
    }
    public static String reverseWords(String s)
    {
        String[] str = s.split(" ");
        String words = "";
        for(int i=0;i<str.length;i++)
        {
            String word = str[i];
            String reverse = "";
            for(int j=word.length()-1;j>=0;j--)
            {
                reverse += word.charAt(j);
            }
            words += reverse +" ";

        }
        return words.trim();
    }
}
