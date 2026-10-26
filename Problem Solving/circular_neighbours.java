
import java.util.Scanner;

class CircularNeighbours {
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = s.nextInt();

        int[] a = new int[n];

        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++)
            a[i] = s.nextInt();

        System.out.println("Output:");

        for (int i = 0; i < n; i++) 
        {
            int l = a[(i - 1 + n) % n];
            int r = a[(i + 1) % n];
            int count = 0;

            if (l > a[i])
                count++;

            if (r > a[i])
                count++;

            System.out.print(count + " ");
        }

    }
}
