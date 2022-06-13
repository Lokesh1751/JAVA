import java.util.Arrays;
public class Arraysmethods {
    public static void main(String[] args){
        int[] marks=new int[3];
     marks[0]=97;
     marks[1]=98;
     marks[2]=95;

     // length
     System.out.println(marks.length);

     // sort an array
     Arrays.sort(marks);
     System.out.println(marks[0]);

     // makes a new arrays
     int[] marks1={97,98,95};

    }
}
