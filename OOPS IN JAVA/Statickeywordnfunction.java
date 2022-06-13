class Student{
    String Name;
    // School to sbka same hi hoga 
   static String School;
   public static void changeschool(){
    System.out.println("School Change kro");
    School="St Joseph";
   }}
public class Statickeywordnfunction {
    public static void main(String[] args){
        // directly class k name se access kr skte hai hum
Student.School="BMS";
Student student1=new Student();
student1.Name="Sujal";
System.out.println(student1.School);
Student.changeschool();

    }
}
