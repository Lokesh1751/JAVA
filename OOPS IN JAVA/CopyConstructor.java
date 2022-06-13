class Student{
    String name;
    int age;
    Student(Student s2){
        this.name=s2.name;
        this.age=s2.age;
        System.out.println("CONSTRUCTOR CALLED");
    }
    Student(){
        
    }
    public void printinfo(){
        // System.out.println(this.name);
        // System.out.println(this.age);

        System.out.println("My Name is"+" "+name+" "+"I am"+" "+age+" "+"years old!");
    }
}
public class CopyConstructor {
    public static void main(String[] args){
   
      Student s1=new Student();
      s1.name="sujal";
      s1.age=19;
      
      Student s2=new Student(s1);
      s2.printinfo();
      s1.printinfo();
    }
}
