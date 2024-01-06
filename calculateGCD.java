public class calculateGCD {

    public calculateGCD() {

    }
    public void genCode(int x, int y){

        System.out.println("gcd(" + x + "," + y + ")");
        System.out.println(">>");
        while (y!=0) {

            if(x>y){
                x-=y;
            }
            else if(x==y){
                y=0;
                System.out.println("\t gcd(" + x + "," + y + ")");
                // break;
            }
            else{
                int tmp = y;
                y=x;
                x=tmp;
                System.out.println("\t gcd(" + x + "," + y + ")");
            }
        }
        System.out.println(x);
    }
    
}
