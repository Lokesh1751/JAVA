interface Animal{
    // by default abstract and public both
    void walk();
}
interface Heribivore{
void eats();
}
class Horse implements Animal,Heribivore{
    public void walk(){
        System.out.println("Walk on 4 legs");
    }
    public void eats(){
System.out.println("Eats only veg");
    }
} 
public class Interface {
    public static void main(String[] args){
Horse horse=new Horse();
horse.walk();
    }
}
