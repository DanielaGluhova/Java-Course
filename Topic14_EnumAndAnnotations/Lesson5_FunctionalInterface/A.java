package Topic14_EnumAndAnnotations.Lesson5_FunctionalInterface;

// Functional Interface (SAM - Single Abstract Method) - деклариран само един метод
@FunctionalInterface
public interface A {

    public abstract void show();
    // Анотацията не ни позволява да създадем още методи
    //public void config();
    
}