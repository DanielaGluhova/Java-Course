package Topic11_Polymorphism.Lesson7_AbstractKeyword;

// Всеки абстрактен метод е притежание на абстрактен клас.
// Когато декларираме абстрактен метод поставяме задължението 
// на всеки негов наследник да има имплементация за този метод.
// Трябва наследника задължително да Override/пренапише този метод.
public abstract class Car {

    public abstract void drive();

    public void playMusic() {
        System.out.println("Car is playing music");
    }


    
}
