package Topic14_EnumAndAnnotations;

// Enum споменахме че е клас но разликата е че не може да 
// наследяваме. Всичко останало е както при класовете.


enum Status{
    Running, Failed, Pending, Success;
}

enum Laptop{
    Dell(2000), HP(), Apple(3500);

    private int price;

    // конструктор по подразбиране
    Laptop(){
        this.price = 500;
    }

    // конструктор
    Laptop(int price){
        this.price = price; 
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
}

public class Lesson3_EnumClass {
    public static void main(String[] args) {

        Status status = Status.Pending;

        // По подразбиране enum е наследник на Enum клас.
        System.out.println(status.getClass().getSuperclass());

        Laptop laptop = Laptop.Dell;
        System.out.println(laptop + " " + laptop.getPrice());

        for(Laptop lap : Laptop.values()){
            System.out.println(lap + " " + lap.getPrice());

        }
    }
}
