class Pen{
    String color;
    String type;
    public void write(){
        System.out.println("Writting something" + " " +"with" +" " + color +" "+ type+" "+"Pen");
    }
    public void printcolor(){
        System.out.println(this.color);
    }
}
class Student{
    String name;
    int age;

    public void printinfo(){
        // System.out.println(this.name);
        // System.out.println(this.age);

        System.out.println("My Name is"+" "+name+" "+"I am"+" "+age+" "+"years old!");
    }
}
public class Basic{
public static void main(String[] args){
// Pen p1 = new Pen();
// p1.color="red";
// p1.type="gel";
// p1.printcolor();
// System.out.println(p1.color);
// p1.write();

// Pen pen2=new Pen();
// pen2.color="black";
// pen2.type="ball";
// pen2.printcolor();
// pen2.write();

Student s1=new Student();
s1.name="Sujal";
s1.age=19;
s1.printinfo();


}
}