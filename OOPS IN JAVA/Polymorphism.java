// FUNCTIONAL OVERLOADING

class Student{
    String name;
    int age;
    public void printinfo(String name){
        System.out.println(name);
        System.out.println("Name function called");
    }
    public void printinfo(int age){
        System.out.println(age);
        System.out.println("Age function called");
    }
    public void printinfo(String name,int age){
        System.out.println(name+" "+age);
        System.out.println("for Both called");
    }
}
public class Polymorphism {
    public static void main(String[] args){
        // compile time polymorphism
        // function overloading
        Student s=new Student();
        s.name="Sujal";
        s.age=19;
Student s1=new Student();
s1.printinfo(s.name,s.age);
    }
}
