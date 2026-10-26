
import java.util.Scanner;

class SubarrayTriplets {
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = s.nextInt();

        int[] a = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            a[i] = s.nextInt();

        int count = 0;

        for (int i = 0; i < n - 2; i++) 
        {
            if (a[i] + a[i + 2] == a[i + 1])
                count++;
        }

        System.out.println("Subarrays = " + count);
    }
}
