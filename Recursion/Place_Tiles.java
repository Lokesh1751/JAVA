public class placetiles {
    // count ways to place 1*m tiles on n*m floor
    public static int plctiles(int n,int m){
if(n==m){
    return 2;
}
if(n<m){
    return 1;
}
        int vertical=plctiles(n-m, m);
        int horizontal=plctiles(n-1, m);
        return vertical+horizontal;
    }
    public static void main(String[] args){
int n=4,m=2;
System.out.println(plctiles(n, m));
    }
}
