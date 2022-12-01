import java.util.Scanner;

public class FindLuckyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("**Enter your number**");
        int num =sc.nextInt();
        int reverseNumber=0;
        for(int i=num;i>0;i=i/10){
            int remainder=i%10;
            reverseNumber=reverseNumber*10+remainder;
        }
       int count=1;
       int num2=reverseNumber;
       int sum=0;
       for(int i=num2;i!=0;i=i/10){
        if(count%2==0){
            sum=sum+(i%10)*(i%10);
        }
        count++;
       }
       if(sum%9==0){
        System.out.println(num+" is a Lucky Number");
       }else{
        System.out.println(num+" is not Lucky Number");
       }
       sc.close();
    }
}
