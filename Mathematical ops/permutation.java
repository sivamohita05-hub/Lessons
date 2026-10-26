import java.util.Scanner;

class Permutation {
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        String[] a = new String[n];
        String vowel = "aeiouAEIOU";
        int maxi = 0;

        for (int i = 0; i < n; i++)
            a[i] = s.next();

        for (int i = 0; i < n; i++) 
        {
            int count = 0;

            for (int j = 0; j < a[i].length(); j++)
            {
                char ch = a[i].charAt(j);

                if (vowel.indexOf(ch) == -1)
                    count++;
            }

            if (count > 1) 
            {
                int fact = 1;

                for (int j = 1; j <= count; j++)
                    fact = fact * j;

                if (fact > maxi)
                    maxi = fact;
            }
        }

        System.out.println(maxi);
    }
}