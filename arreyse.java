import java.util.*;

public class arreyse {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Before Sorting: " + Arrays.toString(arr));

        // Selection Sort Algorithm
        for (int i = 0; i < arr.length - 1; i++) {
            // Find the index of the minimum element
            
            
            
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            
             
        }

       System.out.println("After Sorting : " + Arrays.toString(arr));
    }
}


