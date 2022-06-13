// ENCAPSULATION
class Account{
    private String name="Sujal";
    // getter n setter
    public String getname(){
        return this.name;
    }
    public void setname(String n){
        this.name=n;
    }
}
public class Getternsetter {
   public static void main(String[] args){
    Account a1=new Account();
    System.out.println(a1.getname());
    a1.setname(("Muskan"));
    System.out.println(a1.getname());
   }
    
}
