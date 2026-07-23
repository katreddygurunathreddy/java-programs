import java.util.Scanner;
import java.util.function.BiFunction;

public class LastDigitSum {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a=sc.nextInt();

        System.out.print("Enter second number: ");
        int b=sc.nextInt();

        BiFunction<Integer,Integer,Integer> sum=(x,y)->(x%10)+(y%10);

        System.out.println("Sum = "+sum.apply(a,b));
    }
}

OUTPUT
Enter first number: 145
Enter second number: 278
Sum = 13
