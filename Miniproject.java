import java.util.Scanner;

public class Miniproject {
 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int mynum=(int)(Math.random()*100);
    int usernumber;
    //System.out.println(mynum);
    do{
        System.out.println("Guess my number(1-100):");
         usernumber=sc.nextInt();
        if(usernumber==mynum){
            System.out.println("CONGRATS U GUESS THE NUMBER CORRECTLY");
            break;
        }
        else if(usernumber>mynum){
            System.out.println("YOUR NUMBBER IS LARGE");
        }
        else{
            System.out.println("YOUR NUMBER IS SMALL");
        }
        
    } while(usernumber>=0);
    System.out.println("MY ACTUAL NUMBER WAS:");
    System.out.println(mynum);
    System.out.println("MY GUESSED NUMBER WAS");
    System.out.println(usernumber);
 }   
}
