package Topic8_ObjectOrientedProgrammingConcepts.Lesson6_ThisAndSuperMethod;

// всеки конструктор има метод super() дори да не го споменем


public class Lesson6_ThisAndSuperMethod {
    public static void main(String[] args) {
        
        // Ще принтира "Constructor A" и "Constructor B".
        // Lesson6_B b = new Lesson6_B();

        // Ще принтира "Constructor A" и "Constructor B with int".
        // Ще принтира "Constructor A with int" и "Constructor B with int"
        // след промяната на дефоултния super метод като му зададем n
        // Lesson6_B b2 = new Lesson6_B(5);


        // Ще принтира "Constructor A", "Constructor B" и "Constructor B with int".
        // Ако заместим super(n) в Constructor B (int n) с this() - ще извика 
        // непараметризирания конструктор на B
        // Lesson6_B b3 = new Lesson6_B(5);



    }
}
