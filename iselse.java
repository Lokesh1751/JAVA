import java.util.Scanner;

public class iselse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        boolean issunup=sc.nextBoolean();
        if(!issunup){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

        int age=20;
        String name="Sujal";
        if(age>18){
            System.out.println("Can Vote");
        }
        else{
            System.out.println("No");
        }


        if(age>20 && name.indexOf('S')==0){
System.out.println("haan");
        }
        else if(age>20 || name.indexOf('S')==0){
            System.out.println("Chala lege");
        }
        else{
            System.out.println("no");
        }

    }
}
