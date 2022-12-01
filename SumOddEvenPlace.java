import java.util.Scanner;

public class SumOddEvenPlace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("***Enter any Number***");
        int n=sc.nextInt();
        int remainder;
        int reverseNumber=0;
        for(int i=n;i>0;i=i/10){
            remainder=i%10;
            reverseNumber=reverseNumber*10+remainder;
        }
        int count=1;
        int num2=reverseNumber;
        int sumOfOdd=0;
        int sumOfEven=0;
        for(int i=num2;i!=0;i=i/10){
         if(count%2==0){
            sumOfEven=sumOfEven+(i%10);
         }else{
            sumOfOdd=sumOfOdd+(i%10);
         }
         count++;
        }
        System.out.println("Sum of Even place is "+sumOfEven+" And Sum of Odd Place is "+sumOfOdd);
        sc.close();
    }
}
