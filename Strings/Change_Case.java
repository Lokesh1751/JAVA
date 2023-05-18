public class lowerupper {
    public static void main(String[] args){
        String str="aAaBbCc";
        for(int i=0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i))){
                char ch=str.charAt(i);
                int ans=ch+32;
                char sol=(char)(ans);
                System.out.print(sol);
            }
            else{
                char ch=str.charAt(i);
                int ans=ch-32;
                char sol=(char)(ans);
                System.out.print(sol);
            }
        }        
    }
}
// if character is in lowercase then convert it to uppercase and if in uppercase then convert it into lowercase
