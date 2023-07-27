public class Heapify {
    public static void heapify(int arr[], int n, int i) {
        int largest = i;
        int leftindex = 2 * i;
        int rightindex = 2 * i + 1;
        if (leftindex < n && arr[largest] < arr[leftindex]) {
            largest = leftindex;
        }
        if (rightindex < n && arr[largest] < arr[rightindex]) {
            largest = rightindex;
        }
        if (largest != i) {
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
            heapify(arr, n, largest);
        }
    }

    // TIME COMPLEXITY LOG(N)
    public static void main(String[] args) {
        int arr[] = { -1, 54, 53, 55, 52, 50 };
        int n = 5;
        for (int i = n / 2; i > 0; i--) {
            heapify(arr, n, i);
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
