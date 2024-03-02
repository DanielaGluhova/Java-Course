package Topic7_StaticMembers.Lesson2_StaticBlock;

public class Lesson2_Mobile {

    String brand;
    int price;
    static String name;

    // Използване на статичен блок
    // При създаване на нов обект статичния блок ще се извика 1 път в програмата
    // И ще се извика преди конструктура независимо къде в кода на класа е записан
    // Това се получава защото първо зареждаме класа(В JVM има нещо наречено Class loader)
    //  и след това инстанцираме/създаваме обектите (извиква конструктура).
    //  
    static{

        name = "SmartPhone";
        System.out.println(" calling static block");
    }


    // Използване на конструктор
    // При всяко създаване на нов обект конструктура ще се извика 2 пъти
    public Lesson2_Mobile() {
        brand = "";
        price = 200;
        System.out.println(" calling constructor");
    }

    public void show(){

        System.out.println(brand + " " + price + " " + name);
    }
    
}
