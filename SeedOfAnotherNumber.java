import java.util.Scanner;

public class SeedOfAnotherNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("***Enter a Seed Number***");
        int x=sc.nextInt();
        System.out.println("***Enter a Number***");
        int y=sc.nextInt();
        int seed=1;
        int n2=x;
        while(n2!=0){
            int digit=n2%10;
            seed=seed*digit;
            n2=n2/10;
        }
        int orginalSeed=x*seed;
        if(orginalSeed==y){
            System.out.println(x+" is seed of "+y);
        }else{
            System.out.println(x+" is not seed of "+y);
        }
        sc.close();
    }
}
