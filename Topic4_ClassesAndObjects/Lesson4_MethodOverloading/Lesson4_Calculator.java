package Topic4_ClassesAndObjects.Lesson4_MethodOverloading;

public class Lesson4_Calculator {

    // В Java тази концепция се нарича Method Overloading
    // преизползване на методи с едно и също име но различен брой параметри
    // или с еднакъв брой параметри но от различен тип

    // Така според броя зададени стойности(две/три числа) ще се изпълни съответния метод
    public int addNumbers(int number1,int number2){
        return number1 + number2;
    }

    public int addNumbers(int number1, int number2, int number3){
        return number1 + number2 + number3;
    }

    // Може да се смени типа на параметъра и да се изпълни съответния метод
    public double addNumbers(double number1, double number2){
        return number1 + number2;
    }

    public double addNumbers(double number1, double number2, double number3){
        return number1 + number2 + number3;
    }

}
