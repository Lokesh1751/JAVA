public class towerofhanoi {
    public static void toh(int n,String S,String H,String D,int sum){
if(n==1){
    System.out.println("Transfer of "+n+ " from " + S +" to "+D );
    //System.out.println(sum);
    return;
}
        toh(n-1, S, D, H,sum+1);
        System.out.println("Transfer of "+n+ " from " + S +" to "+D );
        toh(n-1, H, S, D,sum+1);
        sum+=1;
    }
    public static void main(String[] args){
        int n=3;
        toh(n, "S", "H", "D",0);

    }
}
