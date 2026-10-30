import java.util.Scanner;

class Main {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter S1: ");
        String s1 = sc.next();

        System.out.print("Enter S2: ");
        String s2 = sc.next();

        int total = 0;

        for (char ch = 'A'; ch <= 'Z'; ch++) 
        {
            int n1 = 0, n2 = 0;

            for (int i = 0; i < s1.length(); i++) 
            {
                if (s1.charAt(i) == ch)
                    n1++;
            }

            for (int i = 0; i < s2.length(); i++) 
            {
                if (s2.charAt(i) == ch)
                    n2++;
            }

            if (n2 > n1)
                total += n2 - n1;
        }

        System.out.println("Total Cost = " + total);
        sc.close();
    }
}