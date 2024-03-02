package Topic15_ExceptionHandling;

// Exception -> Error
// Видове грешки:
// 1. Compile Time 
// - Грешки по време на компилиране възникват, когато има синтактични проблеми в кода на приложението,
// например липсващи точка и запетая или скоби, неправилно изписани ключови думи или
// използване на недекларирани променливи. Тези синтактични грешки се откриват от Java компилатора
// по време на компилиране и на екрана се показва съобщение за грешка.
// Пр.: System.out.PRINTLN();

// 2. Runtime - Exceptions
// - Грешка по време на изпълнение възниква, когато програмата е синтактично правилна, но съдържа проблем,
// който се открива само по време на изпълнение на програмата. Като знак тя спира да работи и не се изпълнява.
// Тези проблеми се откриват само от Java Virtual Machine (JVM), когато приложението работи.
// Пр.: При делене на 0. За да избегнем тази грешка може да направим проверка дали числото е 0.

// 3. Logical Error
// - Логическа грешка: Логическа грешка е, когато вашата програма се компилира и изпълнява,
// но прави нещо погрешно или връща неправилен резултат или няма изход, когато трябва да връща изход. 
// Тези грешки не се откриват нито от компилатора, нито от JVM.

// Exception hierarchy - Йерархия на грешките
// 1. Object - класа Object се наследява от всички класове в Java.
// 2. Throwable - класа Throwable се наследява от Object класа.
// 3. Exception - класа Exception се наследява от Throwable класа.
//    - Класа Exception има подкласове RuntimeException(Unchecked), IOException(Checked) и SQLException(Checked) и т.н.
//      Unchecked - компилатора няма да принуди програмиста да се справи с грешката.
//      Checked - компилатора ще ни принуди да се справим с грешката.
// 4. Error - класа Error се наследява от Throwable класа. 
//    (Грешка която не можем да прихванем)


public class Lesson1_Exception {
    public static void main(String[] args) {
        
        // Exception - divide by zero
        // int i = 0;
        // int j = 18 / i;
        // System.out.println(j);


        // Exception Handler - Arithmetic Exception
        //     int i = 0;
        //     int j = 0;

        //    try {
        //         j = 18 / i;
        //     } catch (Exception e) {
        //         System.out.println("Cannot divide by zero");
        //         System.out.println(e);
        //     }

        //     System.out.println(j);
        //     System.out.println("Done");

        // Exception Handler - ArrayIndexOutOfBoundsException and ArithmeticException
        int i = 2;
        int j = 0;

        int nums[] = new int[5];
        String str = null;

        try {
            j = 18 / i;
            System.out.println(str.length());
            System.out.println(nums[5]);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
            //System.out.println(e);
                            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
            //System.out.println(e);
        } catch (Exception e) {
            System.out.println("Something went wrong");
            System.out.println(e);
        }

        System.out.println(j);

    }
    
}
