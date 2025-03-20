package Arrays;

import java.util.Arrays;
import java.util.Scanner;
/*
 * 
 *  Input arr = {1, 2, 3, 4, 5}
 *   Output : The array is unique
 * 
 *  Input arr = {1, 2, 3, 4, 5, 1}
 *  Output : The array is not unique
 */
public class UniqueArrayOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("The original array is: ");
        System.out.println(Arrays.toString(arr));
        if(isUnique(arr))
        {
            System.out.println("The array is unique");
        }
        else
        {
            System.out.println("The array is not unique");
        }
        
    }
    public static boolean isUnique(int[] arr)
    {
        if(arr.length==0)
        {
            return false;
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                     return false;
            }
        }
        return true;
    }
}
