package Topic4_ClassesAndObjects.Lesson1_ClassAndObject;

// Какво е ООП? - Object Oriented Programming
// Когато говорим за обект в реалния свят всеки предмет,човек,животно
// може да бъде считан за обект. Обекта има описание и поведение.
// В програмирането всеки Object има - properties and behaviours.
// Нужен ни е клас за да създадем обекти. 
// Класа може да се възприеме като темплейт или чертеж по който JVM 
// създава различните обекти.

// Клас файла който създаваме се компилира в байт код този байткод стога до
// JVM и от там вече се създава обект.

// Създаване на обект - хей JVM искам нов обект (ключова дума - new). JVM казва добре 
// ще създам обект но ми кажи дизайна му(темплейта/ типа) => new Lesson1_Calculator().
// Този нов обект го възлагаме на променлива от тип Calculator 
//=> Lesson1_Calculator c = new Lesson1_Calculator();
// След като имаме тази препратка към обекта(c) можем да се възползваме и да извикаме
// методите от този клас.
// => c.add(num1,num2);


public class Lesson1_ClassAndObject {
    public static void main(String[] args) {
        int num1=4;
        int num2=5;

        // създаване на обект от клас Lesson1_Calculator
        Lesson1_Calculator c = new Lesson1_Calculator();

        int result = c.add(num1,num2); 

        //int result = num1 + num2;

        System.out.println(result);

    }
}
