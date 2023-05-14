public class printkeywordcombination {
    public static String []mapping={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void print(String str,int i,String combination){
        if(i==str.length()){
            System.out.println(combination);
            return;
        }
        char currchr=str.charAt(i);
            String m=mapping[currchr-'0'];
            for(int j=0;j<m.length();j++){
                print(str, i+1, combination+m.charAt(j));
            }
    }
    public static void main(String[] args){
        String str="23";
        print(str, 0, "");

    }
}
// Time complexity=o(4^n)
