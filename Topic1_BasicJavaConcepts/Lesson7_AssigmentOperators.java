package Topic1_BasicJavaConcepts;

// Assigment Operators - оператори за присвояване
//  =, +=, -=, *=, /=, %=, &=, |=, ^=, >>=, <<=, >>>=


public class Lesson7_AssigmentOperators {
    public static void main(String[] args) {
        
        int num1 = 10;
        int num2 = 5;
        
        int result = num1 + num2; // => 10+5 = 15
        System.out.println(result);

        num1+=6; // num1 = num1 + 6 => 10+6 = 16
        System.out.println(num1);

        // num1++; // num1 = num1 + 1 => 16+1 = 17 - Post Increment Operator
        // ++num1; // num1 = num1 + 1 => 17+1 = 18 - Pre Increment Operator 
        // Разликата между num1++ и ++num1 е, че ++num1 е префиксен, а num1++ е постфиксен.
        // Тоест num1++ ще се извърши след присвояването, а ++num1 ще се извърши преди присвояването.

        num1-=3; // num1 = num1 - 3 => 16-3 = 13
        System.out.println(num1);

        // num1--; // num1 = num1 - 1 => 13-1 = 12 - Post Decrement Operator
        // --num1; // num1 = num1 - 1 => 12-1 = 11 - Pre Decrement Operator
        // Разликата между num1-- и --num1 е, че --num1 е постфиксен, а num1-- е префиксен.
        // Тоест num1-- ще се извърши преди присвояването, а --num1 ще се извърши след присвояването.

        num1*=2; // num1 = num1 * 2 => 13*2 = 26
        System.out.println(num1);

        num1/=3; // num1 = num1 / 3 => 26/3 = 8
        System.out.println(num1);

        num1%=5; // num1 = num1 % 5 => 8%5 = 3
        System.out.println(num1);

        num1&=3; // num1 = num1 & 3 => 3&3 = 3 => 0011 & 0011 = 0011
        System.out.println(num1);

        num1|=4; // num1 = num1 | 4 => 3|4 = 7 => 0011 | 0100 = 0111
        System.out.println(num1);

        num1^=5; // num1 = num1 ^ 5 => 7^5 = 2 => 0111 ^ 0101 = 0010
        System.out.println(num1);

        num1>>=2; // num1 = num1 >> 2 => 2>>2 = 0 => 0010>>0010 = 0000 
        System.out.println(num1);

        num1 = 6;
        num1<<=2; // num1 = num1 << 2 => 6<<2 = 24 => 0110 << 0010 = 1100
        System.out.println(num1);

        num1>>>=2; // num1 = num1 >>> 2 => 24 >>> 2 = 6 => 1100 >>> 0010 = 0000
        System.out.println(num1);


    }
}
