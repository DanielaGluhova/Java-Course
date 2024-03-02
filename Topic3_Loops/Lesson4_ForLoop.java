package Topic3_Loops;

// for loop 

public class Lesson4_ForLoop {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            System.out.println("Hello "+i);
        }

        for (int i = 3; i >= 1; i--) {
            System.out.println("Hello "+i);
        }

        for (int i = 0; i <= 2; i++) {
            System.out.println("Hello "+i);	
        }


        for (int i = 1; i <= 7; i++) {
            System.out.println("Day : "+i);

            // for(int j = 9; j <= 18; j++) {
            //     System.out.println("Time : "+j);

            // }

            for (int j = 1; j <= 9; j++) {
                System.out.println("Time : "+(j+8)+" - " +(j+9));
            }
        }
    }
}
