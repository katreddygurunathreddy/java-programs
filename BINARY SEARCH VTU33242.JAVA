import java.util.Scanner;

public class BinarySearchExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter sorted array:");

        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        System.out.print("Enter element to search: ");
        int key=sc.nextInt();

        int low=0,high=n-1;

        while(low<=high){

            int mid=(low+high)/2;

            if(arr[mid]==key){
                System.out.println("Element found at index "+mid);
                return;
            }
            else if(arr[mid]<key)
                low=mid+1;
            else
                high=mid-1;
        }

        System.out.println("Element not found");
    }
}

OUTPUT
Enter size: 5
Enter sorted array:
10
20
30
40
50
Enter element to search: 40
Element found at index 3
