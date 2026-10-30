import java.util.Scanner;

class Main {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        System.out.print("Enter P: ");
        int p = sc.nextInt();

        System.out.print("Enter Q: ");
        int q = sc.nextInt();

        int buses = n / 80;
        int rem = n % 80;

        int shuttles = rem / 8;
        if (rem % 8 != 0)
            shuttles++;

        int bus_cost = buses * p * 75;
        int shuttle_cost = shuttles * q * 75;

        int total = bus_cost + shuttle_cost;

        System.out.println("Minimum Cost = " + total);
        sc.close();
    }
}