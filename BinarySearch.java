import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    
    // Binary search method
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // If target is found at mid
            if (arr[mid] == target) {
                return mid;
            }
            
            // If target is greater, ignore left half
            if (arr[mid] < target) {
                left = mid + 1;
            }
            // If target is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }
        
        // Target not found
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Sample sorted array
        int[] numbers = {2, 5, 8, 12, 16, 23, 38, 45, 56, 67, 78};
        
        System.out.println("Binary Search Program");
        System.out.println("====================");
        System.out.println("Sorted Array: " + Arrays.toString(numbers));
        
        System.out.print("Enter a number to search: ");
        int target = scanner.nextInt();
        
        int result = binarySearch(numbers, target);
        
        if (result != -1) {
            System.out.println("Number " + target + " found at index: " + result);
            System.out.println("Number of comparisons: " + (int)(Math.log(numbers.length) / Math.log(2)) + 1);
        } else {
            System.out.println("Number " + target + " not found in the array.");
        }
        
        // Demonstrate time complexity advantage
        System.out.println("\nTime Complexity: O(log n)");
        System.out.println("For array of size " + numbers.length + ", maximum comparisons needed: " + 
                          (int)(Math.log(numbers.length) / Math.log(2)) + 1);
        
        scanner.close();
    }
}