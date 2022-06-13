import java.util.Scanner;
public class Smalquestion {
    public static void main(String[] args){
        Scanner sc=new Scanner((System.in));
        int number;
        do{
            System.out.println("Inout a number:");
             number=sc.nextInt();
            System.out.println("Here is ur number: ");
            System.out.println(number);
        }while(number>=0);
        System.out.println("THE END!");
    }
}
