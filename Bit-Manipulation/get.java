public class first {
    // find position bit
    public static void main(String[] args) {
        // find the position of particular number n check whether the bit is one or zero
        int n = 5;
        int pos = 2;
        // now left shift the 1 with pos; 1<<pos called bitmask
        int bitmask = 1 << pos;
        // now perform and operation on bitmask and n
        if ((bitmask & n) == 0) {
            System.out.print("0 Bit");
        } else if ((bitmask & n) == 1) {
            System.out.print("1 Bit");
        }

    }
}
