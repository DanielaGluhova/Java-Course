package Topic12_InnerClasses.Lesson3_AbstractAndAnonymousClass;

public class Lesson3_AbstractAndAnonymousClass {
    public static void main(String[] args) {

        A obj = new A(){
            // Anonymous inner class	

            // Override show() method
            public void show() {
                System.out.println("Class A in new show");
            }

            public void config() {
                System.out.println("Class A in config");
            }
        };

        obj.show();
        obj.config();
    }
    
}
