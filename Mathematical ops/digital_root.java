
import java.util.Scanner;

class DigitalRoot {
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = s.nextInt();

        while (n >= 10) 
        {
            int a = 0;

            while (n > 0) 
            {
                int m = n % 10;
                a = a + m;
                n = n / 10;
            }

            n = a;
        }

        System.out.println("Digital Root = " + n);
    }
}
