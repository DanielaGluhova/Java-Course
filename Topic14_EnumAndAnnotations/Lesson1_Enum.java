package Topic14_EnumAndAnnotations;

// Enums - именувани константи

// възприема се за клас
enum Status{
    // възприемат се като обекти
    Running, Failed, Pending, Success;
}

public class Lesson1_Enum {
    public static void main(String[] args) {
        Status status = Status.Success;
        System.out.println(status);
        System.out.println(status.ordinal()); // позицията

        Status[] statuses = Status.values();
        System.out.println(statuses[0]);

        for(Status s : statuses){
            System.out.println(s+" "+s.ordinal());

        }
       
    }
    
}
