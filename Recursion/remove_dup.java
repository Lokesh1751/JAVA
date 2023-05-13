public class removeduplicates {
    public static boolean[] arr=new boolean[26];
    public static void removedp(String str,int i,String ans){
        if(i==str.length()){
         System.out.println(ans);
         return;
        }
char currchar=str.charAt(i);
if(arr[currchar-'a']==false){
    ans+=currchar;
    arr[currchar-'a']=true;
    removedp(str, i+1, ans);
}
else{
    removedp(str, i+1, ans);
}
    }
    public static void main(String[] args){
        String str="abcaabcdad";
        removedp(str,0,"");
    }
}
