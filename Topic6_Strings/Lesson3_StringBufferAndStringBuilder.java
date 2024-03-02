package Topic6_Strings;

// Разликата между StringBuffer и StringBuilder е че 
// StringBuffer е thread safe, а StringBuilder - не.

// Това означава, че две нишки не могат да извикват
// методите на StringBuffer едновременно. StringBuffer е синхронизиран.

//StringBuilder не е синхронизиран.


public class Lesson3_StringBufferAndStringBuilder {
    public static void main(String[] args) {

        // StringBuffer
        // Ще ни даде буферно място с размер 16 байта
        StringBuffer sb = new StringBuffer("Mark");

        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append(" Leon");

        sb.deleteCharAt(2);

        sb.insert(4, "Java ");

        System.out.println(sb);

        // String str = sb.toString();

    }
    
}
