package Topic11_Polymorphism.Lesson4_ObjectClassEqualsToStringHashcode;

// Object class
// Всеки клас в Java е наследник на Object класа


public class Lesson4_ObjectClass {

    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.model = "Dell";
        laptop.price = 500;

        // всеки път когато се опитаме да изведем метода ще
        // извиква toString() дори да не сме го повикали
        System.out.println(laptop);
        // Ще върне името на класа + @ + шестнайсетичен код (шестнайсетичното представяне на hashcode)
        // hashcode() - обединява стринг от всичката информация която има
        System.out.println(laptop.toString());

        // Но когато презапишем (override) toString() метода 
        // ще изпълни метода на Laptop класа а не на Object вградения
        System.out.println(laptop);

        Laptop laptop2 = new Laptop();
        laptop2.model = "Dell";
        laptop2.price = 500;

        boolean r = laptop == laptop2; // false
        boolean r2 = laptop.equals(laptop2); // false
        System.out.println(r);
        System.out.println(r2);

        // Ако Override / пренапишем метода equals() ще върне true
        // когато са еднакви обекти и false ако са различни
        System.out.println(r);
        System.out.println(r2);
    }
    
}
