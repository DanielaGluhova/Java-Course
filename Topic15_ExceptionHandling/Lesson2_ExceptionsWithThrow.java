package Topic15_ExceptionHandling;

import java.util.Scanner;

public class Lesson2_ExceptionsWithThrow {
    public static void main(String[] args) {
        
        // int i = 20;
        // int j = 0;
        
        // try {
        //     j = 18 / i;
        //     // Създаване на исключение
        //     if(j==0){
        //         throw new ArithmeticException("I dont want to print zero");
        //     }
        // } catch (ArithmeticException e) {
        //     j = 18/1;
        //     System.out.println("That is default output -> " + e);
        // } catch (Exception e) {
        //     System.out.println("Something went wrong");
        // }

        // System.out.println(j);


        // Custom Exception - Създаване на собствено изключение

        // int i = 20;
        // int j = 0;

        // try {
        //     j = 18 / i;
        //     // Създаване на исключение
        //     if(j==0){
        //         throw new Lesson2_CustomException("I dont want to print zero");
        //     }
        // } catch (Lesson2_CustomException e) {
        //     j = 18/1;
        //     System.out.println("That is default output -> " + e);
        // }


        // int i = 0;
        // int j = 0;


        // // try with finaly
        // try {
        //     j = 18 / i;
        // } catch (Exception e) {
        //     System.out.println("Something went wrong");
        // } finally {
        //     // този блок се изпълнява винаги 
        //     System.out.println("Done");
        // }


        int i = 0;
        int j = 0;
        Scanner sc = new Scanner(System.in);

        // try with finaly and user input
        try {
            System.out.println("Enter a number: ");
            i = sc.nextInt();
            j = 18 / i;
            
        } catch (Exception e) {
            System.out.println("Something went wrong");
        } finally {
            System.out.println(j);
            // този блок се изпълнява винаги 
            sc.close();
        }
    }
    
}
