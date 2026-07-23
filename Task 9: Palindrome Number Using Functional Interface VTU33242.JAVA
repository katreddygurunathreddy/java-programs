import java.util.Scanner;
import java.util.function.Predicate;

public class PalindromeNumber {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number: ");
        int num=sc.nextInt();

        Predicate<Integer> palindrome=n->{

            int temp=n;
            int rev=0;

            while(temp>0){
                rev=rev*10+temp%10;
                temp/=10;
            }

            return rev==n;
        };

        if(palindrome.test(num))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}

OUTPUT

Enter number: 121
Palindrome
