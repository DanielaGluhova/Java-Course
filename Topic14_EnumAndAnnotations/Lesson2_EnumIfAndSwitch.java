package Topic14_EnumAndAnnotations;

enum Status{
    Running, Failed, Pending, Success;
}

public class Lesson2_EnumIfAndSwitch {
    public static void main(String[] args) {
        
        Status status = Status.Pending;

        if(status == Status.Pending){
            System.out.println("Please wait");
        }else if(status == Status.Success){
            System.out.println("Done");
        }else if(status == Status.Failed){
            System.out.println("Try again");
        }else if(status == Status.Running){
            System.out.println("All good");
        }

        switch(status){
            case Running:
                System.out.println("All good");
                break;
            case Failed:
                System.out.println("Try Again");
                break;
            case Pending:
                System.out.println("Please wait");
                break;
            case Success:
                System.out.println("Done");
                break;

            default:
                System.out.println("Unknown Status");
        }
    }
    
}
 