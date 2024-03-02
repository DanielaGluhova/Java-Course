package Topic12_InnerClasses.Lesson1_InnerClass;


public class Lesson1_InnerClass {
    public static void main(String[] args) {

        // За да достъпим метода show и променливата age 
        // ще ни е нужен объект на класа ClassA
        ClassA objA = new ClassA();
        objA.show();

        // За да създадем обект от B ще ни е нужен обект от A -> objA.new ClassB()
        // Класа B принадлежи на A -> ClassA.ClassB 
        // ClassA.ClassB objB = objA.new ClassB();
        // objB.config();

        // Ако Inner class е статичен 
        // Когато реферираме към статичен клас нямаме нужда от обект
        ClassA.ClassB objC = new ClassA.ClassB();
        objC.config();
    }

    
}
