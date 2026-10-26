
import java.util.Scanner;

class GenerateSequence {
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of sequence to be generated: ");
        int n = s.nextInt();

        int[] a = new int[n];

        System.out.println("Enter six values:");
        for (int i = 0; i < 6; i++)
            a[i] = s.nextInt();

        for (int i = 6; i < n; i++)
            a[i] = a[i - 1] + a[i - 2];

        System.out.println("Generated Sequence:");
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}
