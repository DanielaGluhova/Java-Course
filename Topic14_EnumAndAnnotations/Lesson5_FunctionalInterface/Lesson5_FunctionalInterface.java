package Topic14_EnumAndAnnotations.Lesson5_FunctionalInterface;

// Видове интерфейси:

// 1. Normal - няколко декларирани метода
// interface I {
//     public abstract void show();
//     public abstract void config();
// }

// 2. Functional (SAM - Single abstract method) - деклариран само един метод който е абстарктен
// interface I {
//     public abstract void show();
//}

// 3. Marker - няма методи (празен интерфейс). Използва се само за да предаде нещо на компилатора.
// * Сериализацията - е преобразуването на стойностите на Java обект в статичен поток (последователност) от байтове,
// които след това можем да запазим в база данни или да прехвърлим по мрежа.
// * Десериализацията - е преобразуването на статичен поток от байтове в стойностите на Java обект.

// Основното което знаем за интерфейса е че там можем да декларираме методи
// Всички методи са public abstract.

public class Lesson5_FunctionalInterface {
    public static void main(String[] args) {
        A obj = new A(){
            @Override
            public void show(){
                System.out.println("Class A in new show");
            }
        };
        obj.show();

        B obj2 = new B();
        obj2.show();
    }
    
}
