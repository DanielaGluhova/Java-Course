package Topic12_InnerClasses.Lesson2_AnonymousInnerClass;

public class Lesson2_AnonymousInnerClass {
    public static void main(String[] args) {
        
        ClassA objA = new ClassA();
        objA.show();

        ClassB objB = new ClassB();
        objB.show();

        // ClassA objC = new ClassB();
        // objC.show();

        // Ако единствената финкция на class B е да пренапише метода
        // show() на Class A и да се използва само веднъж.
        // То няма нужда от това да създаваме нов клас можем просто
        // да пренапишем метода на Class A в самото тяло на новия обект.
        ClassA objD = new ClassA()
        { 
            // Anonymous inner class 

            // Override show() method
            public void show(){
                System.out.println("Class A in new show");
            }
        };
        objD.show();



    }
    
    
}
