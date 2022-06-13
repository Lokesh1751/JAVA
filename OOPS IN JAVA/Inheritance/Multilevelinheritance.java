package Inheritance;
class Shape{
    public void area(){
     System.out.println("DISPLAYS AREA");   
    }
}
class Traingle extends Shape{
    public void area(int l,int b){
        System.out.println(1/2*l*b);
    }
}
class Equilateraltraingle extends Traingle{
    public void area(int l,int b){
        System.out.println(1/2*l*b);
    }
}
public class Multilevelinheritance {
    public static void main(String[] args){

    }
}

