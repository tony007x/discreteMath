import java.util.Arrays;
import java.util.Scanner;

public class twoComplement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input_1: ");
        int x = sc.nextInt();
        System.out.print("Input_2: ");
        int y = sc.nextInt();

        
        calculate(x, y);

    }

    public static void calculate(int num1, int num2) {
        int[] box = new int[8];
        int[] box2 = new int[8];
        int[] sumBox = new int[8];

        int constNum1 = num1;
        int constNum2 = num2;
        int constTotal = constNum1 + constNum2;
        int sum = num1 + num2;

        // num1
        for (int i = box.length - 1; i >= 0; i--) {
            if (num1 % 2 == 0) {
                box[i] = 0;
            } else {
                box[i] = 1;
            }
            num1 /= 2;
        }
        // 2's complement of num1

        // num2
        for (int i = box.length - 1; i >= 0; i--) {
            if (num2 % 2 == 0) {
                num2 /= 2;
                box2[i] = 0;
            } else {
                num2 /= 2;
                box2[i] = 1;
            }
        }
        // sumValue
        for (int i = box.length - 1; i >= 0; i--) {
            if (sum % 2 == 0) {
                sum /= 2;
                sumBox[i] = 0;
            } else {
                sum /= 2;
                sumBox[i] = 1;
            }
        }
        System.out.println(constNum1 + " Input_1: " + Arrays.toString(box));
        System.out.println(constNum2 + " Input_2: " + Arrays.toString(box2));

        // rewite
        if (constNum1 < 0) {
            System.out.println("Input_1 is Negative value.");
            for (int i = 0; i < box.length; i++) {
                if (box[i] == 0) {
                    box[i] = 1;
                } else {
                    box[i] = 0;
                }
            }
            System.out.println("Rewrite Input_1: " + Arrays.toString(box));

            // Add 1 into box1
            for (int i = box.length - 1; i > 0; i--) {
                if (box[i] == 1) {
                    box[i] = 0;
                    if (box[i - 1] == 0) {
                        box[i - 1] = 1;

                        break;
                    }
                } else {
                    box[i] = 1;
                    break;
                }
            }
            System.out.println("Add 1 into Input_1: " + Arrays.toString(box));

        }

        if (constNum2 < 0) {
            System.out.println("Input_2 is Negative value.");
            for (int i = 0; i < box.length; i++) {
                if (box2[i] == 0) {
                    box2[i] = 1;
                } else {
                    box2[i] = 0;
                }
            }
            System.out.println("Rewrite Input_2: " + Arrays.toString(box2));

            for (int i = sumBox.length - 1; i > 0; i--) {
                if (box2[i] == 1) {
                    box2[i] = 0;
                    if (box2[i - 1] == 0) {
                        box2[i - 1] = 1;
                        break;
                    }
                } else {
                    box2[i] = 1;
                    break;
                }
            }
            
            System.out.println("Add 1 into Input_2: " + Arrays.toString(box2));
        }

        System.out.println("Sum: " + constTotal);

        //when sum < 0 rewrite SUM and Add one to SUM
        if(constTotal<0){
            System.out.println("Sum is Negative value.");
            for (int i = 0; i < sumBox.length; i++) {
                if (sumBox[i] == 0) {
                    sumBox[i] = 1;
                } else {
                    sumBox[i] = 0;
                }
            }
            //Add 1 to SUM
            for (int i = sumBox.length - 1; i > 0; i--) {
                if (sumBox[i] == 1) {
                    sumBox[i] = 0;
                    if (sumBox[i - 1] == 0) {
                        sumBox[i - 1] = 1;

                        break;
                    }
                } else {
                    sumBox[i] = 1;
                    break;
                }
            }
        }
        System.out.println("SumBox: " + Arrays.toString(sumBox));
    }
}