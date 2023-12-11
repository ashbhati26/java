import java.util.*;

public class Question06 {
    // Method to insert an element at a specified index in an array
    private static int[] insertElement(int[] array, int element, int index) {
        int newSize = array.length + 1;
        int[] newArray = new int[newSize];

        // Copy elements before the insertion point
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }

        // Insert the new element
        newArray[index] = element;

        // Copy elements after the insertion point
        for (int i = index; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }

        return newArray;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Input element to insert
        System.out.print("Enter the element to insert: ");
        int elementToInsert = scanner.nextInt();

        // Input location to insert the element
        System.out.print("Enter the index to insert the element at: ");
        int insertIndex = scanner.nextInt();
    
        // Check if the index is valid
        if (insertIndex < 0 || insertIndex > size) {
            System.out.println("Invalid index. Insertion failed.");
        } else {
            // Resize the array
            array = insertElement(array, elementToInsert, insertIndex);

            // Display the updated array
            System.out.println("Array after insertion: " + Arrays.toString(array));
        }
    }
}