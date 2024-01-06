import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {

        calculateGCD gcd = new calculateGCD();

        Scanner sc = new Scanner(System.in);
        System.out.print("Input1: ");
        int x = sc.nextInt();
        System.out.print("Input2: ");
        int y = sc.nextInt();
        gcd.genCode(x, y);
    }
}
