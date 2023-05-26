import java.util.*;

public class Arraysclass {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 2, 5, 6 };

        // BINARY SEARCH
        int index = Arrays.binarySearch(arr, 5);
        System.out.println(index);

        // SORT
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //FILL => fill a value to every index
        Arrays.fill(arr,12);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
