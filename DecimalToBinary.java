import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("**Enter a Decimal Number**");
        int number=sc.nextInt();
        int pow=1;
        int binary=0;
        while(number!=0){
        int remainder=number%2;
        number=number/2;
        binary=binary+(remainder*pow);
        pow=pow*10;
        }
        System.out.println("Binary Number is "+binary);
        sc.close();
    }
}
