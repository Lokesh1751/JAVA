class Student{
    String name;
    int age;
    Student(String n,int a){
        this.name=n;
        this.age=a;
        System.out.println("CONSTRUCTOR CALLED");
    }
    public void printinfo(){
        // System.out.println(this.name);
        // System.out.println(this.age);

        System.out.println("My Name is"+" "+name+" "+"I am"+" "+age+" "+"years old!");
    }
}
public class Constructor {
    public static void main(String[] args){
Student s=new Student("Sujal", 19);
s.printinfo();
    }
}
