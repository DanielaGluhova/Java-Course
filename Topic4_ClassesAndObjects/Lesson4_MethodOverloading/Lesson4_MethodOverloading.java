package Topic4_ClassesAndObjects.Lesson4_MethodOverloading;

public class Lesson4_MethodOverloading {
    public static void main(String[] args) {
        
        Lesson4_Calculator calculator = new Lesson4_Calculator();
        int resultTwoNumbers = calculator.addNumbers(3, 4);
        int resultTreeNumbers = calculator.addNumbers(3, 4, 5);

        System.out.println(resultTwoNumbers);
        System.out.println(resultTreeNumbers);
    }
}
