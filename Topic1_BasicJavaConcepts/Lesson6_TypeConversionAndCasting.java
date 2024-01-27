package Topic1_BasicJavaConcepts;

// Преобразуване на типове - Type Conversion/Casting

// Всеки тип може да се преобразува в друг тип
// Стига да следва следната логика:
    // Не може да сложим голям продукт в малка кутия,
    // но бихме могли да сложим малък продукт в голяма кутия.



public class Lesson6_TypeConversionAndCasting {
    public static void main(String[] args) {
        byte b = 127;
        int a = 256;
        

        // Преобразуване на типове - Type Conversion
         // b=a; => ще даде грешка защото диапазона на byte е по-малък и не може да събере 256
         // a=b; => това е възможно тъй като int обхваща дори по-голям диапазн от 127
        a=b;

        // Кастване на типове - Casting
        a=12;
        b = (byte)a; 
        System.out.println(b);
         // b=12; кастваме типа на (a) в байт тъй като това е типа на променливата която приема стойност

        float f = 5.6f;
        int x = (int)f;
        System.out.println(x);
        // резултата ще е 5

        a=260;
        b=(byte)a;
        System.out.println(b);
         // ще изведе като резултат остатъка при деление на 260%256 = 4 


        // Type Promotions - тип данни с малък размер може да бъде повишен в голям размер
        byte byte1 = 10;
        byte byte2 = 30;
        int int1 = byte1 + byte2;
        System.out.println(int1);


    }
}
