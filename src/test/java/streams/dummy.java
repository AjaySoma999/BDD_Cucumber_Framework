package streams;

public class dummy {
    String name;
    int age;
    String username;

    //no arg constuctor sample
    public dummy() {
        name = "ajay";
        age = 20;
        System.out.println("no arg constructor : " + name + age);
    }

    //with arg constuctor sample
    //constructor overloading
    public dummy(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("with arg constructor: " + name + age);
    }

    //with arg constructor sample
    //constructor overloading
    //constructor chaining **this
    public dummy(String name, int age, String username) {
        this("vijay", 23);
        this.name = name;
        this.age = age;
        this.username = username;
        System.out.println("with arg constructor: " + name + age + username);
    }
    //constructor chaining **super
    public static class dog extends dummy{
        public dog(){
            super();
        }
    }


    public static void dummy(int i, int j) {
        System.out.println(i + j);
    }

    public static void main(int i, int j) {
        System.out.println(i + j);
    }

    public static void main(String d, int j) {
        System.out.println(d + j);
    }


 /*   public static void main(String[] args) {
        dummy d = new dummy();
        dummy d1 = new dummy("ajay", 24);
        dummy d2 = new dummy("ganesh", 24, "lord");
        dog dog1=new dog();
        dummy(9, 9);
        main(4, 6);
        main("ajay", 1);
    }*/


}

