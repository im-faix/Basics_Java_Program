package arrays;

import java.util.Scanner;

public class MostFrequentElement {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }    
        int mostFrequent = findMostFrequent(arr, n);
        System.out.println("The most frequent element is: " + mostFrequent);
        sc.close();
    }

    public static int findMostFrequent(int[] arr, int n) {
        int maxCount = 0;
        int mostFrequent = arr[0];
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mostFrequent = arr[i];
            }
        }
        // If there are multiple elements with the same frequency, return the first one found
        // This is a simple approach; for a more complex case, you might want to use a HashMap or similar structure.
        // However, this is a straightforward solution for educational purposes.
        // In a real-world scenario, you might want to handle ties differently.
        // For example, you could return all elements with the maximum frequency or the largest/smallest one.
        // This implementation returns the first one found in the case of a tie.
        // If you want to return all elements with the maximum frequency, you can modify the code accordingly.
        // For example, you could use a List to store all elements with the maximum frequency and return that list.
        // This implementation is simple and easy to understand, but it is not the most efficient one.
        // For larger arrays, you might want to consider using a HashMap to count the frequencies more efficiently.
        // This implementation has a time complexity of O(n^2), which is not optimal for large arrays.
        // A more efficient approach would be to use a HashMap to count the frequencies in O(n) time.
        // However, this implementation is simple and easy to understand, which is why it is used here.
        // In a real-world scenario, you would want to use a more efficient approach, especially for larger arrays.
        // This implementation is a simple and straightforward solution for educational purposes.
        // In a real-world scenario, you would want to use a more efficient approach, especially for larger arrays.
        if(maxCount == 1) {
            System.out.println("All elements are unique.");
            return -1; // or any other indication of no frequent element
        }
        return mostFrequent;
    }
    
}