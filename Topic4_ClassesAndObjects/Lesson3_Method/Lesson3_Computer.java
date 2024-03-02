package Topic4_ClassesAndObjects.Lesson3_Method;

public class Lesson3_Computer {


// Method - функцията се създава и се изпълнява като действие(Behavior).
// За да създадем метод 
// Първо задаваме модификатор (public)
// Второ задаваме типа стойност която ще ни върне метода в случая не връща нищо (void)
// Трето задаваме името на метода (playMusic)
// Четвърто задаваме параметри на метода ако е нужно.
// В тялото на метода записваме алгоритъма, който ще изпълни се при извикването.

    public void playMusic(){
        System.out.println("Playing Music");
    }

    public int getMeNumberFive(){
        return 5;
    }

    public String getMePen(int cost){
        if (cost>=10) {
            return "Pen";  
        }else{
            return "No Pen";
        }
    }

}
