package Topic14_EnumAndAnnotations.Lesson4_Annotations;

public class B extends A{

    // Overriding е build-in annotation(вградена анотация)
    // която компилатора ще засече и ще сравни за да открие проблем
    // ако например името на пренаписания метод не е същото с името на суперкласа
    @Override
    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("Class B in show");
    }
    
    
}
