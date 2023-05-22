import java.util.*;

public class Basic {
    public static void main(String[] args) {

        // Store in Heap Memory
        // Dynamic Memory Allocation
        // it always store objects like Integer is a object but int is a primitive
        // datatype
        ArrayList<Integer> al = new ArrayList<Integer>();

        // Add Function -> to add a element
        al.add(2);
        al.add(3);
        al.add(12);

        // Print List
        System.out.println(al);

        // Get Function->To get the element by using a particular index
        System.out.println(al.get(2));

        // Add element in between the arraylist add(index,element)
        al.add(1, 14);
        System.out.println(al);

        // Set functionn-> to set the value at particular index
        al.set(0, 19);
        System.out.println(al);

        // Delete element->remove function -> remove(index)
        al.remove(2);
        System.out.println(al);

        // size function
        System.out.println(al.size());

        // isempty function -> return true or false
        System.out.println(al.isEmpty());

        // to remove all elements ->clear function
        al.clear();
        System.out.println(al);
        al.add(21);
        al.add(1);
        al.add(12);

        // contains function->return true or false
        System.out.println(al.contains(2));

        // loops in arraylist
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }
        System.out.println();

        // Sort funtion

        Collections.sort(al);
        System.out.println(al);
    }
}
