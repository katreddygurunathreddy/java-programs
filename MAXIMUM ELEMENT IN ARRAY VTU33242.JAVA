import java.util.Scanner;

public class MaximumElement {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter size: ");
        int n=sc.nextInt();

        int arr[]=new int[n];

        System.out.println("Enter elements:");

        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        int max=arr[0];

        for(int i=1;i<n;i++){

            if(arr[i]>max)
                max=arr[i];
        }

        System.out.println("Maximum Element = "+max);
    }
}


OUTPUT
Enter size: 5
Enter elements:
25
80
12
65
99
Maximum Element = 99
