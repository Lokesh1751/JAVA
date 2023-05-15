public class permutationofstring{
    public static void per(String str,String newstr){
        if(str.length()==0){
            System.out.println(newstr);
            return;
        }
        for(int i=0;i<str.length();i++){
            char newchr=str.charAt(i);
            String newst=str.substring(0, i)+str.substring(i+1);
            per(newst, newstr+newchr);
        }
    }
    public static void main(String[] args){
        String str="abc";
        per(str,"");
    }
}
