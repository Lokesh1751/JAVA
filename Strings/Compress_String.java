public class compressstring {
    public static void main(String[] args){
        String str="aaabbcc";
        int []maping=new int[26];
        for(int i=0;i<str.length();i++){
maping[str.charAt(i)-'a']++;

        }
        for(int i=0;i<maping.length;i++){
            if(maping[i]!=0){
                char ans=(char)(97+i);
                System.out.print(ans);
                System.out.print(maping[i]);
            }
        }
    }
}
