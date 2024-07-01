package streams;

public class OnlyOneDayToGO {

    public void evenFrom1toUsergivenNum(int num){
        for(int i=1;i<=num;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
    public void oddFrom1toUsergivenNum(int num) {
        System.out.println();
    for(int i=1;i<=num;i++){
        if (i%2!=0){
            System.out.print(i+" ");
        }
    }
    }
    public void sumOf1ToUsergivenNum(int num){
        System.out.println();
        int sum=0;
        for(int i=1;i<=num;i++){
            sum=sum+i;
            System.out.print(i+"+");
        }
        System.out.print("Sum of this : "+sum);
    }

    public void maxOf1ToUsergivenNum(int a,int b,int c) {
        System.out.println();
        if (a > b && a > c) {
            System.out.println(a + " is max number from 3 input "+a+","+b+","+c);
        } else if (b > a && b > c) {
            System.out.println(b + " is max number from 3 input "+a+","+b+","+c);
        } else {
            System.out.println(c + " is max number from 3 input "+a+","+b+","+c);
        }
    }
    public void Proof1ToUsergivenNum(int num){
        System.out.println();
        int pro=1;
        for (int i=1;i<=num;i++){
            pro=pro*i;
            System.out.print(i+"*");
        }
        System.out.print("pro or multipule of this : "+pro);
    }
    public void digitCountofUsergivenNum(int num){
        System.out.println();
        int count=0;int sum=0;
        while(num>0){
            num=num/10;//it will give coffitint of number 123 =>12
            count++;
            sum=sum+num%10;//num%10 will give reminder 123 =>3
            System.out.print("rem :"+num%10+","+"cof :"+num);
        }
        System.out.print("Count of given digits : "+count+" sum rem :"+sum);
    }

    public void fibonociOfUsergivenNumber(int num){
        int f1=0,f2=1,f3;
        System.out.println();
        System.out.print(f1+","+f2);
        for(int i=0;i<=num;i++){
            f3=f1+f2;
            System.out.print(","+f3);
            f1=f2;
            f2=f3;
        }
    }
    public void checkPrimeornot(int num){
        System.out.println();
        int count=0;
        for(int i=1;i<=num;i++) {
            if (num % i == 0) {
                count++;
            }
        }
            if(count==2){
                System.out.println(num+" is prime number");
            }
            else{
                System.out.println(num+" is not prime number");
        }
    }

    public void checkUsergivenNumIsReverseOrPalindrome(int num){
        int rev=0,temp=num;
        while (num>0){
            rev=rev*10+num%10;
            num=num/10;
        }
        if(num==rev){
            System.out.println(rev+" Palindrome number of "+temp);
        }
        else{
            System.out.println(rev+" reverse number of "+temp);
        }

    }
    public void checkUseergivenNumIsAmstrongeNum(int num){
        int arm=0,temp=num,rem;
        while (num>0){
            rem=num%10;
            arm=arm+rem*rem*rem;
           // arm=arm+num%10*num%10*num%10;
            System.out.println(rem*rem*rem );
            num=num/10;
        }
        if(temp==arm){
            System.out.println(arm+" armstronge number of "+temp);
        }
        else System.out.println(arm+" is not a armstronge numbre of "+temp);

    }

    public static void main(String[] args) {
        OnlyOneDayToGO one=new OnlyOneDayToGO();
               one.evenFrom1toUsergivenNum(20);
               one.oddFrom1toUsergivenNum(20);
               one.sumOf1ToUsergivenNum(10);
               one.Proof1ToUsergivenNum(5);
               one.maxOf1ToUsergivenNum(100,20,30);
               one.digitCountofUsergivenNum(120);
               one.fibonociOfUsergivenNumber(6);
               one.checkPrimeornot(8);
               one.checkUsergivenNumIsReverseOrPalindrome(123);
               one.checkUseergivenNumIsAmstrongeNum(153);
    }
}
