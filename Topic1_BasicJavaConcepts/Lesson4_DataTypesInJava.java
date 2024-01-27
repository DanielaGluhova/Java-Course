package Topic1_BasicJavaConcepts;

// Има два вида на данни в Java - примитивни(Primitives) и непримитивни(Non-Primitives).
// Примитивни - означава че са прости и лесни за използване.
// Разделяме ги на 4 категории - цели числа(byte, short, int, long), реални числа(double, float), булеви(boolean), символи(char).

// Integers - цели числа
//  byte   = 8 bits     = 1 byte;     => диапазон: -128 TO 127
//  short  = 16 bits    = 2 bytes;    => диапазон: -32768 TO 32767
//  int    = 32 bits    = 4 bytes;    => диапазон: -2147483648 TO 2147483647
//  long   = 64 bits    = 8 bytes;    => диапазон: -9223372036854775808 TO 9223372036854775807

// Floats - реални числа
//  float  = 32 bits    = 4 bytes     => диапазон: -3.4028235E38 TO 3.4028235E38
//  double = 64 bits    = 8 bytes     => диапазон: -1.7976931348623157E308 TO 1.7976931348623157E308

// Booleans - булеви
//  boolean = 1 bit     = 1 byte      => диапазон: true OR false

// Characters - символи
//  char    = 16 bits   = 2 bytes     => диапазон: 0 TO 65535 (UNICODE)

// Ако по случайност израза ни сформира стойност която е извън диапазона на някой от зададениятип 
// то това се нарича Overflow(препълване) а в противен случай акo е под диапазона на типа той се нарича Underflow(изпразване)


public class Lesson4_DataTypesInJava {
    public static void main(String[] args) {
        System.out.println("Byte Value Range ( " + Byte.MIN_VALUE + " TO " + Byte.MAX_VALUE + " ) and has width of 8 bits.");
        System.out.println("Short Value Range ( " + Short.MIN_VALUE + " TO " + Short.MAX_VALUE + " ) and has width of 16 bits.");
        System.out.println("Integer Value Range ( " + Integer.MIN_VALUE + " TO " + Integer.MAX_VALUE + " ) and has width of 32 bits.");
        System.out.println("Long Value Range ( " + Long.MIN_VALUE + " TO " + Long.MAX_VALUE + " ) and has width of 64 bits.");

        System.out.println("Float Value Range ( " + Float.MIN_VALUE + " TO " + Float.MAX_VALUE + " ) and has width of 32 bits.");
        System.out.println("Double Value Range ( " + Double.MIN_VALUE + " TO " + Double.MAX_VALUE + " ) and has width of 64 bits.");

        System.out.println("Boolean has width of 1 bit.");

        System.out.println("Character has width of 16 bits.");

        byte byte1 = 1;
        short short1 = 1_000;
        int int1 = 23_000;
        long long1 = 23_000_000_000L;

        float float1 = 1.23f;
        double double1 = 1.23;

        boolean boolean1 = true;

        char char1 = 'a';

        System.out.println(byte1);
        System.out.println(short1);
        System.out.println(int1);
        System.out.println(long1);

        System.out.println(float1);
        System.out.println(double1);

        System.out.println(boolean1);

        System.out.println(char1);

    }

}
