import java.util.Scanner;

interface DigitSum{
    int calculate(int n);
}

public class DigitSumLambda {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number: ");
        int num=sc.nextInt();

        System.out.print("Enter choice (even/odd): ");
        String ch=sc.next();

        DigitSum even=n->{
            int sum=0;
            while(n>0){
                int d=n%10;
                if(d%2==0)
                    sum+=d;
                n/=10;
            }
            return sum;
        };

        DigitSum odd=n->{
            int sum=0;
            while(n>0){
                int d=n%10;
                if(d%2!=0)
                    sum+=d;
                n/=10;
            }
            return sum;
        };

        if(ch.equalsIgnoreCase("even"))
            System.out.println(even.calculate(num));
        else
            System.out.println(odd.calculate(num));
    }
}

OUTPUT

Enter number: 123456
Enter choice (even/odd): even
12
