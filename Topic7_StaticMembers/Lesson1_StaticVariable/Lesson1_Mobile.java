package Topic7_StaticMembers.Lesson1_StaticVariable;

public class Lesson1_Mobile {


    // Тези променливи се наричат instance variables
    // (променливи на обекта/екземпляра).
    String brand;
    int price;

    // Тази променлива принадлежи на класа а не на обекта - class variable.
    // Искаме всички обекти да са с еднакво име. Ще спестим памет.
    static String name;

    // Статичните променливи могат да се използват в нестатични методи
    public void show(){
        System.out.println(brand + " " + price + " " + name);
    }
    
}
