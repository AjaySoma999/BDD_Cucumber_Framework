package streams;

public class StringPro {

    public static void main(String ares[]){
        String glass1="water";
        System.out.println(glass1);
        String glass2="water";
        glass1="its water";
        System.out.println(glass1+"-->"+glass2);

        StringBuilder sb=new StringBuilder("hello");
        sb.append(" world");
        String data=sb.toString();
        System.out.println(data);

    }
}
