package Topic4_ClassesAndObjects.Lesson3_Method;


public class Lesson3_Methods {
    public static void main(String[] args) {

        Lesson3_Computer computer = new Lesson3_Computer();

        computer.playMusic();
        int five = computer.getMeNumberFive();
        String str = computer.getMePen(8);


        System.out.println(five);
        System.out.println(str);
    }
}
