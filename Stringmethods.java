public class Stringmethods {
    // Strings are immutable in nature -> kabhi change ni hoyegi string khud 
    public static void main(String[] args){
     //*1) Concatenate
        String name1="Sujal";
        String name2="Angi";
        //1)
        String name3=name1+ " " +name2;
        System.out.println(name3);
        //2)
     String name4=   name1.concat(name2);
     System.out.println(name4);

//*2) charat method
System.out.println(name1.charAt(0));

// *3) length
System.out.println(name1.length());

// *4) Replace 
System.out.println(name1.replace('S', 'L'));

// *5) Substring
System.out.println(name1.substring(0, 3));




    }
}
