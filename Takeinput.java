import java.util.Scanner;

public class Takeinput {
    public static void main(String[] agrs){
        // Take input
        Scanner sc=new Scanner(System.in);
        System.out.println("Input ur age:");
        int age=sc.nextInt();
        float age2=sc.nextFloat();
        System.out.println("Age is:");
        System.out.println(age);

        Scanner sc1=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
        // take input of only one word
        String name=sc1.next();
        String name2=sc2.nextLine();
        System.out.println(name);
        System.out.println(name2);
    }
}
