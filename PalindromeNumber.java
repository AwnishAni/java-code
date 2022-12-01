import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("**Enter your Number**");
        int n=sc.nextInt();
        int reverseNumber=0;
        int remainder;
        for(int i=n;i!=0;i=i/10){
            remainder=i%10;
            reverseNumber=reverseNumber*10+remainder;
        }
        if(reverseNumber==n){
            System.out.println(n+" is a Palindrome Number");
        }else{
            System.out.println(n+" is not palindrome Number");
        }
        sc.close();
    }
}
