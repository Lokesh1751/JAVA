import java.util.*;

class Heap {
    int arr[] = new int[100];
    int size = 0;

    void insert(int val) {
        size = size + 1;
        int idx = size;
        arr[idx] = val;
        while (idx > 1) {
            int parent = idx / 2;
            if (arr[parent] < arr[idx]) {
                int temp = arr[parent];
                arr[parent] = arr[idx];
                arr[idx] = temp;
                idx = parent;
            } else {
                return;
            }
        }

    }

    void deletefromheap() {
        if (size == 0) {
            System.out.println("Nothing to delete");
        }
        // Step 1=>place last node at root
        arr[1] = arr[size];
        // Step 2=>Delete Last Node
        size--;
        // Step 3 Take root to its correct position
        int i = 1;
        while (i < size) {
            int leftindex = 2 * i;
            int rightindex = 2 * i + 1;
            if (leftindex < size && arr[leftindex] > arr[i]) {
                int temp = arr[leftindex];
                arr[leftindex] = arr[i];
                arr[i] = temp;
                i = leftindex;
            } else if (rightindex < size && arr[rightindex] > arr[i]) {
                int temp = arr[rightindex];
                arr[rightindex] = arr[i];
                arr[i] = temp;
                i = rightindex;
            } else {
                return;

            }
        }
    }

    public void print() {
        for (int i = 1; i <= size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
// TIME COMPLEXITY:O(LOGN) for both inserion and deletion

public class Insertion {
    public static void main(String[] args) {
        // Heap is type of data structure which is a complete binary tree
        // Complete binary tree is that tree in which all nodes have two childs except
        // the last one
        Heap h = new Heap();
        h.insert(50);
        h.insert(55);
        h.insert(53);
        h.insert(52);
        h.insert(54);
        h.print();
        h.deletefromheap();
        h.print();

    }
}
