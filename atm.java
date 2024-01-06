public class atm {
    public static void main(String[] args) {
        int x = 500;

        int BANK1000 = 0;
        int BANK500 = 0;
        int BANK100 = 0;

        while (x > 0) {
            if (x > 1000) {
                x -= 1000;
                BANK1000++;
            } else if (x >= 500) {
                x -= 500;
                BANK500++;
            } else if (x < 500) {
                x/=100;
                BANK100+=x;
            }
        }
        System.out.println("Total: "+ x);
        System.out.println("1000:" + BANK1000);
        System.out.println("500:" + BANK500);
        System.out.println("100:" + BANK100);
    }
}
