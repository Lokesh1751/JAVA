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
class Circle extends Shape{
    public void area(int radius){
        System.out.println((22/7)*radius*radius);
    }
}
public class Hierarichialinheritance {
    public static  void main(String[] args){

    }
}
