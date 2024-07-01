package streams;

abstract class calculater{

     abstract void emp(String str);

}
 class implementation extends calculater{
String name="ajay kumar soma";
    @Override
    public void emp(String data) {
        String[] words=name.split(" ");

        for (String word:words){

            if (word.equals(data)){
                System.out.println(data+" is present");
            }

        }
    }


}
public class Pracabstarct {

    public static void main(String[] args) {
       // String[] str={"9","2","1","6","4","0"};
        String[] str={"i","love","india","and","you","virat"};
        for(int i=0;i< str.length;i++){
             String  trmp;
            for(int j=i+1;j<str.length;j++){
                if (str[i].compareTo(str[j])<0){
                    trmp=str[i];
                    str[i]=str[j];
                    str[j]=trmp;
                }
            }
        }
        for(String st:str){
            System.out.println(st);
        }


        implementation imp=new implementation();
      //  imp.emp("ajay");

    }
}
