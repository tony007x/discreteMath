import java.util.Scanner;

public class exersice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("input a: ");
        int a = sc.nextInt();
        System.out.print("input d: ");
        int d = sc.nextInt();
        int r = 0;
        int constA = a;
        while (a>=d) {
            a-=d;
            r++;
        }
        System.out.println(constA + " = " + "("+ d + "x" + r + ") + "+a );
    }   
}
