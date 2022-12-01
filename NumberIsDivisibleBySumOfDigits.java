import java.util.Scanner;

public class NumberIsDivisibleBySumOfDigits {
    public static void main(String[] args) {
        int num, remainder;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("***Enter the Digits***");
        int digits=sc.nextInt();
        num=digits;
        for(int i=digits; i!=0;i=i/10){
            remainder=i%10;
            sum=sum+remainder;
        }
        if(num%sum==0){
            System.out.println(num+" is divisible by sum of its digits");
        }else{
            System.out.println(num+" is not divisible by sum of its digits");
        }
        sc.close();
    }
}
