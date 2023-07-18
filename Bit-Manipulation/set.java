public class setbit {
    public static void main(String[] args){
        //set the bit at a particular position
        int n=5;
        int pos=1;
        int bitmask=1<<pos;
        // now perform OR operation between n and bitmask
        int ans=n | bitmask;
        System.out.println(ans);

    }
}
