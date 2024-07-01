package practicejava;

import org.openxmlformats.schemas.wordprocessingml.x2006.main.STRestartNumber;

import javax.xml.validation.SchemaFactoryConfigurationError;
import java.util.*;

public class StringType {
    public static void onlyxfromxyz(char c,String s){
        //print only a from java developer
        String str=s;

        int len=s.length();
        System.out.println("user given string: "+s +"\n"+"user given char: "+c+"\n"+"its total count: "+len);
        int count=0;
        for (int i=1;i<len;i++){
            char ch=s.toLowerCase().charAt(i);
            if (ch==c){
                System.out.println(ch);
                count++;
            }
        }System.out.println("its count: "+count);
    }
    //write a java program to reverse the string?
    public static void reverseString(String str){

      for(int i=str.length()-1;i>=0;i--){
          char ch=str.toLowerCase().charAt(i);
          System.out.println(ch);
      }
    }
    public static void onlysecondword(String str){
        String[] sp=str.split(" ");
        List<String> data=Arrays.stream(sp).toList();
        System.out.println(data.get(1));
    }


    public static void splitword(String str){
        //split a word and revers the the every char in word execpt first and last char in the woed ajay =>aajy
        String[] strr=str.split(" ");
        String sum="";
       List<String> n=new ArrayList<>();
        for (String sr:strr){
            System.out.println(sr);
            for(int i=sr.length()-1;i>=0;i--){

            }
        }
    }

    public static void Stringwordcahrrev(String string){
        String input = string;
        StringBuilder output=new StringBuilder();
        String[] words = input.split(" ");
        for(String word:words){
            for(int i=word.length()-1;i>=0;i--){
                output.append(word.charAt(i));
            }
            output.append(" ");
        }
        System.out.println(output);
    }

    public static void main(String args[]) {
       /* reverseString("soma ajay");
        onlysecondword("I am a java developer");*/
    /*  onlyxfromxyz('a',"java developer");
        onlyxfromxyz('s',"soma ajay kumar");*/
        // splitword("ajay");
//  Stringwordcahrrev("ajay kumar soma");
        String input="ajay kumar soma";
        Set s=new LinkedHashSet();
        int dupcount=0,unqcount=0;
        //print duplicate char and without duplicate
        char[] ch=input.toCharArray();
        for (char c:ch){
            s.add(c);
        }
        System.out.println(s+" duplicate char with count: "+s.size());

        int num[]={1,2,56,32,45,56};
        int max=num[0];
        int min=num[0];
        for(int i:num){
            if (i>max){
                max=i;
            }
            else if(i<min)
            min=i;
        }
        System.out.println(max +" max & min"+min);
    }
}

