
import java.util.Scanner;

class FairSplit {
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = s.nextInt();

        int[] a = new int[n];
        int t = 0;

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
            t += a[i];
        }

        int prefix = 0, count = 0;

        for (int i = 0; i < n - 1; i++) 
        {
            prefix += a[i];
            int suffix = t - prefix;

            if (Math.abs(prefix - suffix) % 2 == 0)
                count++;
        }

        System.out.println("Fair splits = " + count);
    }
}
