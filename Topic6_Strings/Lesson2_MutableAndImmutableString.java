package Topic6_Strings;

// String - immutable
// В heap паметта на JVM има нещо наречено String Constant Pool.
// Там всеки път когато създадем обект със стойност - стойността му
// се записва като константа и всеки път като създаваме нов обект
// ще се проверява дали стойността вече я има сред константите и ще 
// използва съществуващия вече адрес.


// Immutable String - нещо което не може да се променя
// По подразбиране String е immutable. Тоест когато създадем
// обект не е правилно да се променя стойността.

// Mutable String - нещо което може да се променя
// Ако искаме да можем да променяме стойността на String, ще използваме
// един от тези два класа StringBuffer и StringBuilder.


public class Lesson2_MutableAndImmutableString {
    public static void main(String[] args) {
        
        // Reference Variable - name се съхранява в stack паметта на JVM
        // а стойността се съхранява в heap паметта. За да я достъпи използва адреса.
        String name = "Mark";

        // Тук след като променим стойността на name в heap паметта 
        // garbage collector-а ще премахне "Mark" тъй като вече няма да се използва.
        name += " Leon";

        System.out.println("Hello " + name);

        // Ще се създаде само един обект тъй като стойността е еднаква
        // Това запазва паметта.
        String s1 = "mark";
        String s2 = "mark";

        System.out.println(s1 == s2); // true
    }
}
