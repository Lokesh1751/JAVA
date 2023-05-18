public class nonrepeatedelement {
    public static void main(String[] args){
        String str="abcddaabdddddd";
        int []maping=new int[26];
        for(int i=0;i<str.length();i++){
            maping[str.charAt(i)-'a']++;
        }
        int maxi=Integer.MIN_VALUE;
        int ind=0;
        for(int i=0;i<maping.length;i++){
            if(maping[i]==1){
                ind=i;
                break;
            }
        }
        char ans=(char)(97+ind);
        System.out.println(ans);
    }
}
