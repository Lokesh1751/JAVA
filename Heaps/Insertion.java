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

    public void print() {
        for (int i = 1; i <= size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
// TIME COMPLEXITY:O(LOGN)

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

    }
}
