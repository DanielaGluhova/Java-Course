package Topic7_StaticMembers.Lesson3_StaticMethod;

public class Lesson3_Mobile {
    // instance fields - полета на екземпляра/обекта
    String brand;
    int price;

    // static field - статична променлива (променлива на класа)
    static String name;

    // instance method - метод на екземпляра/обекта
    public void show() {
        System.out.println(brand + " " + price + " " + name);
    }

    // static method - статичен метод (метод на класа)
    // В статичен метод по подразбиране могат да се използват статични променливи
    // но не могат да се използват нестатични методи
    public static void showStaticMethod() {
        System.out.println("In static method : " + name);
    }


    // Но може да зададем като параметър да се поясни за кой обект 
    // да се използва статичния метод и така ще позволим дотъп до нестатичните 
    // променливи
    public static void showStaticMethod(Lesson3_Mobile mobile){
        System.out.println("Mobile : " + mobile.brand + " " + mobile.price);
    }



}
