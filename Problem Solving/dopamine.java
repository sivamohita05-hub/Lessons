
import java.util.Scanner;

class DopamineLevels {
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = s.nextInt();

        System.out.print("Enter L: ");
        int l = s.nextInt();

        System.out.print("Enter R: ");
        int r = s.nextInt();

        int[] a = new int[n];

        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++)
            a[i] = s.nextInt();

        int d = 0, maxi = 0, mini = 0;

        for (int i = 0; i < n; i++) 
        {
            if (l <= a[i] && a[i] <= r)
                d++;
            else
                d--;

            maxi = Math.max(maxi, d);
            mini = Math.min(mini, d);
        }

        System.out.println("Output:");
        System.out.println(maxi + " " + mini);
    }
}
