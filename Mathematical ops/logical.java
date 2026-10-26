import java.util.Scanner;

class Logical {
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter A: ");
        int a = s.nextInt();

        System.out.print("Enter B: ");
        int b = s.nextInt();

        System.out.println("AND = " + (a & b));
        System.out.println("OR = " + (a | b));
        System.out.println("XOR = " + (a ^ b));
        System.out.println("NOT A = " + (~a));
        System.out.println("NOT B = " + (~b));
    }
}