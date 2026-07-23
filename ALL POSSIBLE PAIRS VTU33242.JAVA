import java.util.Scanner;

public class ArrayPairs {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter size: ");
        int n=sc.nextInt();

        int arr[]=new int[n];

        System.out.println("Enter elements:");

        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        System.out.println("Pairs:");

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                System.out.println(arr[i]+" "+arr[j]);
            }
        }
    }
}

OUTPUT
Enter size: 4
Enter elements:
1
2
3
4

Pairs:
1 2
1 3
1 4
2 3
2 4
3 4
