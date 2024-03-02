package Topic11_Polymorphism.Lesson7_AbstractKeyword;

public class Lesson7_AbstractKeyword {
    public static void main(String[] args) {

            // Не можем да създадем обект на абстрактен клас.
            // Car car = new Car();

            Car car = new Wagon();
            car.drive();
            car.playMusic();


    }
}
