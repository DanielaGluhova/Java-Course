package Topic9_Inheritance.Lesson1_Inhertance;

// Inheritance (Наследяване)
// Наследяването в Java е начин за създаване на йерархия между класове.
// Наследяването на Java е транзитивно - така че ако Sedan наследява Car
// и Car наседява Vehicle, тогава Sedan също се наследява от класа Vehicle.
// Превозното средство (Vehicle) се превръща в суперклас както на автомобил, така и на седан.

// Пример:
// Ако сме създали Калкулатор(Calculator) с базови функции (add, subtract, multiply, divide)
// но изискват от нас да създадем нов по-развит калкулатор(AdvancedCalculator) с нови функции.
// Може да използваме базовите функции на Calculator в AdvancedCalculator.
// Като наследим класа Calculator. 
// Calculator - Parent class(Клас-Родител, Super class(Суперклас))
// AdvancedCalculator - Child class(Клас-Дете, Sub class(Подклас))
// (Като проверка може да ползваме гразата: AdvancedCalculator е Calculator + функции.)


public class Lesson1_Inheritance {
    public static void main(String[] args) {

        Lesson1_Calculator calc = new Lesson1_Calculator();

        int result = calc.add(5,6);
        int result2 = calc.sub(5,6);

        System.out.println("Addition: " + result);
        System.out.println("Subtraction: " + result2);

        Lesson1_AdvancedCalculator advCalc = new Lesson1_AdvancedCalculator();

        int advAdd = advCalc.add(5, 7);
        int advSub = advCalc.sub(7, 3);
        int advMult = advCalc.multiply(5, 7);
        int advDiv = advCalc.divide(20, 2);

        System.out.println("Advanced Calculator Add: " + advAdd);
        System.out.println("Advanced Calculator Sub: " + advSub);
        System.out.println("Advanced Calculator Mult: " + advMult);
        System.out.println("Advanced Calculator Div: " + advDiv);

    }
    
}
