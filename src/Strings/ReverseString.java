package Strings;

import java.util.Scanner;
/*
 *  Input   : He is a good boy
 *  Output  : yob doog a si eH
 * 
 *   Input  : Jacob
 *   Output : bocaJ
 * 
 *   Input : A
 *   Output : A 
 */

public class ReverseString
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        sc.close();
        System.out.println("Original String is "+str );
        System.out.println("The Reverse of a string is " + reverseStr(str));

    }
    public static String reverseStr(String str)
    {
        String reverse="";
        if(str.length()==0)
            return "";
        else if(str.length()==1)
            return str;
        
        char[] c = str.toCharArray();
        for(int i=c.length-1;i>=0;i--)
        {
            reverse += (c[i]);
        }
        return reverse;
    }
}