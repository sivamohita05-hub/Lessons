
import java.util.Scanner;

class CharacterTraversal {
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = s.next();

        String result = "";

        for (int i = 0; i < str.length(); i++) 
        {
            char ch = str.charAt(i);
            int count = str.indexOf(ch) + 1;

            for (int j = 0; j < count; j++)
                result += ch;

            if (i < str.length() - 1)
                result += "-";
        }

        System.out.println("Output: " + result);
    }
}
