package arrays;

import java.util.Arrays;
import java.util.Scanner;
/*
 *  Input arr = [7,9,8,2,3,4]
 * Ouput arr = [2,3,4,7,8,9]
 *  Output arr = [9,8,7,4,3,2]
 */
public class SortingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Array elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("Before Sorting ");
        System.out.println("=".repeat(20));
        System.out.println(Arrays.toString(arr));

        System.out.println("\n After Sorting");
        System.out.println("=".repeat(20));
        System.out.println("Sorting in Ascending Order");
        System.out.println(Arrays.toString(sortArrayAscending(arr)));
        System.out.println("=".repeat(20));
        System.out.println("Sorting in Descending Order");
        System.out.println(Arrays.toString(sortArrayDescending(arr)));

    }
    public static int[] sortArrayAscending(int[] arr)
    {
            if(arr.length==1)
                return arr;
            for(int i=0;i<arr.length;i++)
            {
                for (int j = 0; j < arr.length; j++) {
                    if(arr[i]<arr[j])
                    {
                        int temp = arr[j];
                        arr[j]=arr[i];
                        arr[i]=temp;
                    }
                }
            }
            return arr;
    }
    public static int[] sortArrayDescending(int[] arr)
    {
            if(arr.length==1)
                return arr;
            for(int i=0;i<arr.length;i++)
            {
                for (int j = 0; j < arr.length; j++) {
                    if(arr[i]>arr[j])
                    {
                        int temp = arr[j];
                        arr[j]=arr[i];
                        arr[i]=temp;
                    }
                }
            }
            return arr;
    }
}
