import java.util.Scanner;

public class ArrayIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter index: ");
        int index=sc.nextInt();

        if(index>=0 && index<n)
            System.out.println("Element = "+arr[index]);
        else
            System.out.println("Invalid Index");
    }
}



OUTPUT

Enter array size: 5
Enter array elements:
10 20 30 40 50
Enter index: 3
Element = 40