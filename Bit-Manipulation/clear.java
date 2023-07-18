public class clearbit {
    public static void dectobin(int n) {
        int arr[] = new int[100];
        int i = 0;
        while (n != 0) {
            arr[i] = n % 2;
            n = n / 2;
            i++;

        }
        for (int j = 0; j < i; j++) {
            System.out.print(arr[j]);
        }
    }

    // clear the bit at particular position == means clear the pos from 1 to 0
    public static void main(String[] args) {
        // steps
        int n = 5;
        int pos = 2;
        int bitmask = 1 << pos;
        // now perform not of bitmask
        int notbitmask = ~(bitmask);
        // now perform notbitmask and with the n

        System.out.println(n & notbitmask);

    }
}
