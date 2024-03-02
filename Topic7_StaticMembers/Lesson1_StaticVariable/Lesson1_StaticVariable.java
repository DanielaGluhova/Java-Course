package Topic7_StaticMembers.Lesson1_StaticVariable;

public class Lesson1_StaticVariable {
    public static void main(String[] args) {

        Lesson1_Mobile mobile = new Lesson1_Mobile();
        mobile.brand = "Apple";
        mobile.price = 1500;
        // Извикване на статична променлива чрез обект - ГРЕШНО!
        //mobile.name = "SmartPhone";
        // Извикване на статична променлива чрез клас - ПРАВИЛНО!
        Lesson1_Mobile.name = "SmartPhone";

        Lesson1_Mobile mobile1 = new Lesson1_Mobile();
        mobile1.brand = "Samsung";
        mobile1.price = 1200;
        // Извикване на статична променлива чрез обект - ГРЕШНО!
        //mobile1.name = "SmartPhone";
        // Извикване на статична променлива чрез клас - ПРАВИЛНО!
        Lesson1_Mobile.name = "SmartPhone";

        // Когато променливата е статична и се използва от всички обекти
        // при промяна на стойността - тя ще се промени за всички обекти
        // mobile1.name="Phone";
        // Lesson1_Mobile.name = "Phone";


        mobile.show();
        mobile1.show();
        
    }
    
}
