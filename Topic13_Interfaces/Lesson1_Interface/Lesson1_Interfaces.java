package Topic13_Interfaces.Lesson1_Interface;

// Ако можем да обобщим два класа с една дума 
// значи можем да създам общ интерфейс

// Интерфейсът е референтен тип, подобен на клас, който може да съдържа
// само константи, сигнатури на методи, методи по подразбиране,
// статични методи и вложени типове.
// Телата на метода съществуват само за методите по подразбиране и статичните методи.


public class Lesson1_Interfaces {
    
    public static void main(String[] args) {

        // Interface reference variable
        Computer desktop = new Desktop();
        Computer laptop = new Laptop();
        Developer mark = new Developer();

        mark.develop(laptop);
        mark.develop(desktop);
        
    }
}
