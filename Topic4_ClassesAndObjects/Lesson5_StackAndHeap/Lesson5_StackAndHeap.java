package Topic4_ClassesAndObjects.Lesson5_StackAndHeap;

// Нека се фокусираме върху JVM. 
// Там се изпълнява кода чрез runtime/runner.

// Паметта на JVM се категоризира на две части:

// Първата част (Stack - стек)- това е област в която се съхранява информация
// като реда е - FIFO - First In First Out
// Тоест ако се опитаме да вземем стойност (5,6,7) първо ще вземем 5
// тъй като е първото добавено число.

// Всеки метод използва Stack за да съхранява своите локални променливи.

// Втората част (Heap - хип) - това е област в която се съхранява информация
// като реда е - LIFO - Last In First Out
// Тоест ако се опитаме да вземем стояност (5,6,7) първо ще вземем 7
// тъй като е последното добавено число.


public class Lesson5_StackAndHeap {
    public static void main(String[] args) {

        // calculator е reference varialble (водеща до друг клас)
        // но деклариран в main() функцията.
        // Чрез new ще се създаде нов обект в heap паметта който 
        // притежава метода add() и променливата num = 5 тъй като тя е instance variable
        // A main метода ще може да достъпва само чрез адреса на обекта calculator
        Lesson5_Calculator calculator = new Lesson5_Calculator();   
        int result = calculator.add(5,6);
        System.out.println(result);


        calculator.num = 10;
        System.out.println(calculator.num);
    }
}
