package Topic11_Polymorphism.Lesson5_UpcastingAndDowncasting;




public class Lesson5_UpcastingAndDowncasting {

    public static void main(String[] args) {
        
        // Typecasting
        double d = 10.5;
        System.out.println(d);
        int i = (int) d;
        System.out.println(i);

        ClassA objA = new ClassA();
        objA.show1();
        // Родителския клас не знае какво притежава класа наследник
        // и не може да използва методите му
        //objA.show2();

        // Upcasting
        ClassA objB = (ClassA) new ClassB();
        objB.show1();

        // Downcasting
        ClassB objC = (ClassB) objB;
        objC.show2();

    }
}
