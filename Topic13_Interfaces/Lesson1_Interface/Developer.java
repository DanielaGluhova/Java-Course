package Topic13_Interfaces.Lesson1_Interface;

// Ще искаме програмиста да създаде приложение но
// за да го направи ще има нужда от вид компютър
public class Developer {
    public void develop(Computer computer) {
        System.out.print("Developing new application ");
        computer.code();
        
    }
    
}
