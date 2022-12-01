import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("**Enter a Number**");
        double number=sc.nextInt();
        double sumOfSeries=1;
        for(double i=1;i<=number;i++){
            sumOfSeries=sumOfSeries+(1/i);
        }
        System.out.println("Sum of series is "+sumOfSeries);
        sc.close();
    }
}
