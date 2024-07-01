package streams;

import org.checkerframework.checker.units.qual.C;

import java.util.ArrayList;
import java.util.List;

public class StringPro {
    public static void tochararray() {
        String name = "kairosteckkh";
        char[] chname = name.toCharArray();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            int count = 0;
            for (int i = 0; i < chname.length; i++) {
                if (ch == chname[i]) {
                    count++;
                }
            }
            if (count > 0) {
                System.out.println("to char : " + ch + " count : " + count);
            }
        }
    }
    public static void strcharlist(){
        String name="soma ajay kumar";
        List<Character> listname=new ArrayList<>();
        for(char ch:name.toCharArray()){
            listname.add(ch);
        }
        System.out.println(listname);
        List<Character> vowelsfilter=new ArrayList<>();
        for(char ch:listname){
            if("aeiouAEIOU".contains(String.valueOf(ch))){
             //   System.out.println(ch);
                vowelsfilter.add(ch);
            }
        }
        System.out.println(vowelsfilter);
    }

    public static void main(String ares[]) {
        strcharlist();
        tochararray();
        String glass1 = "water";
        System.out.println(glass1);
        String glass2 = "water";
        glass1 = "its water";
        System.out.println(glass1 + "-->" + glass2);
        StringBuilder sb = new StringBuilder("hello");
        sb.append(" world");
        String data = sb.toString();
        System.out.println(data);

    }
}
