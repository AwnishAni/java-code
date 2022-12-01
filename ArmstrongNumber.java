import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int orignalNumber,remainder;
        int sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("**Enter your Number**");
        int number=sc.nextInt();
        orignalNumber=number;
        while(number!=0){
        remainder=number%10;
        sum=sum+(remainder*remainder*remainder);
        //System.out.println(sum);
        number=number/10;
        }
        if(sum==orignalNumber){
            System.out.println("Yes it is a ArmStrong Number");
        }else{
            System.out.println(" it is not ArmStrong Number");
        }
        sc.close();
    }
}
