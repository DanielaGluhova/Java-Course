package Topic7_StaticMembers.Lesson2_StaticBlock;

public class Lesson2_StaticBlock {
    public static void main(String[] args) {

        // static block - код се изпълнява само веднъж за цялата програма
        // construrtor - изпълнява се 1 път при създаването на обекта
        Lesson2_Mobile mobile1 = new Lesson2_Mobile();

        // constructor - ще се изпълнява всеки път при създаването на нов обект
        Lesson2_Mobile mobile2 = new Lesson2_Mobile();

        Lesson2_Mobile mobiles[] = {mobile1, mobile2};

        for(Lesson2_Mobile m : mobiles){
            m.show(); 
        } 



        // Ако не създадем обект няма да се зареди и класа(няма да се изпълни static block дори)
        
        // Но ако искаме все пак да заредим класа:
        // Class.forName("Topic7_StaticMembers.Lesson2_StaticBlock.Lesson2_Mobile");
    }
    
}
