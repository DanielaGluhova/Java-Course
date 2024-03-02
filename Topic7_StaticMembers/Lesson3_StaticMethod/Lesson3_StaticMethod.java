package Topic7_StaticMembers.Lesson3_StaticMethod;

public class Lesson3_StaticMethod {
    public static void main(String[] args) {
        
        Lesson3_Mobile mobile1 = new Lesson3_Mobile();
        mobile1.brand = "Apple";
        mobile1.price = 1500;
        Lesson3_Mobile.name = "SmartPhone";

        Lesson3_Mobile mobile2 = new Lesson3_Mobile();
        mobile2.brand = "Samsung";
        mobile2.price = 1200;
        Lesson3_Mobile.name = "SmartPhone";

        Lesson3_Mobile.name = "Phone";



        // Не е възможно да извикаме нестатичен метод чрез клас
        // затова използваме обекта
        // Lesson3_Mobile.show(); - ГРЕШНО!
        mobile1.show();
        mobile2.show();

        // Трябва да извикваме статичен метод чрез класа
        Lesson3_Mobile.showStaticMethod(mobile1);
        Lesson3_Mobile.showStaticMethod(mobile2);
    }
    
}
