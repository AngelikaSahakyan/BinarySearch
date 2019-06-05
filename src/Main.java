import java.util.Scanner;
/**
 * best case O(1)
 * worst case O(log n)
 */
public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 6, 7, 8, 9, 11, 22, 44, 56, 78, 90, 99, 132};
        BinarySearch binarySearch = new BinarySearch();
        System.out.println("Hello , please enter a number ");
        Scanner scanner = new Scanner(System.in);
        int element = scanner.nextInt();
        boolean isFound = binarySearch.binarySearch(arr, element);
        if (isFound) {
            System.out.println("Index of " + element + " is " + binarySearch.getIndex());
        } else {
            System.out.println("Not found ");
        }
    }
}
