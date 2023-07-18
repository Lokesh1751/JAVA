import java.util.Scanner;

public class updatebit {
    public static void main(String[] args){
        // if we have to update 1 to 0 then steps are
        // 1) 1<<pos
        // 2) AND with not

         // if we have to update 0 to 1 then steps are
        // 1) 1<<pos
        // 2) OR 

       // int updatebit=0;
        Scanner sc=new Scanner(System.in);
        int updatebit=sc.nextInt();
      if(updatebit==0){
        int n=5;
        int pos=1;
        int bitmask=1<<pos;
        int notbitmask=~(bitmask);
        int ans= n & notbitmask;
        System.out.println(ans);
      }
      else{
        int n=5;
        int pos=1;
        int bitmask=1<<pos;
     //   int notbitmask=~(bitmask);
        int ans= n | bitmask;
        System.out.println(ans);
      }
    }
}
