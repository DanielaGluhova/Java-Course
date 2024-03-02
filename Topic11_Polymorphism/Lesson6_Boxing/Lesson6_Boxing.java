package Topic11_Polymorphism.Lesson6_Boxing;

// Java не е ООП на 100% защото може да създава променливи от примитивен тип
// не само от тип обект

// Wrapper classes - Integer, String, Character, Boolean, Byte, Short, Long, Float, Double
// За всеки примитивен тип имаме клас. 


public class Lesson6_Boxing {
    public static void main(String[] args) {

        // primitive variable
        int num = 7;
        // reference variable
        // Integer num1 = new Integer(5); // boxing
        Integer num2 = 8; // autoboxing
        int num3 = num2.intValue(); // unboxing
        // int num3 = num2; // auto unboxing

        System.out.println(num);
        System.out.println(num2);
        System.out.println(num3);

        String str = "12";
        int num4 = Integer.parseInt(str); // unboxing

        System.out.println(num4*2);
        
    }
}
