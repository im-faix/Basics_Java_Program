package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class ShiftingZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("The original array is: " + Arrays.toString(arr));
        System.out.println("The array after shifting zeros to the end is: " + Arrays.toString(shiftZeros(arr)));
         }
        public static int[] shiftZeros(int[] arr)
        {
            int n = arr.length;
            int count = 0; // Count of non-zero elements
            for (int i = 0; i < n; i++) {
                if (arr[i] != 0) {
                    arr[count++] = arr[i]; // Move non-zero elements to the front
                }
            }
            // Fill remaining positions with zeros
            while (count < n) {
                arr[count++] = 0;
            }
            return arr;
        }
}