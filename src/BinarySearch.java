import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("\nArray elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n\nEnter the targeted number to find their position: ");
        int target = scanner.nextInt();
        int index = BinarySearch.binarySearch(arr, target);
        if (index == -1) {
            System.out.println("\nOOPS!!" +
                    "\nThere is no number as "+target+" in the array.");
        } else {
            System.out.println("Hurray!!\nWe have found the position for number: "+target+"\nIt as: " + index);
        }
    }


    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // If the target value is not found, return -1
        return -1;
    }
}


