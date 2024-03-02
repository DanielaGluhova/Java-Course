package Topic9_Inheritance.Lesson4_MethodOverriding;

// Method Overriding
// В Java отмяната(overriding) на метода възниква, когато подклас
// има същия метод като родителския клас.
// Подкласът предоставя конкретна реализация на метод,
// деклариран от един от неговите родителски класове.

public class Lesson4_MethodOverriding {
    public static void main(String[] args) {

        // Lesson4_ClassA obj = new Lesson4_ClassA();
        // obj.show();

        Lesson4_ClassB obj = new Lesson4_ClassB();
        obj.show();


        Lesson4_AdvancedCalculator obj1 = new Lesson4_AdvancedCalculator();
        System.out.println(obj1.add(1, 2));
    }
    
}
