import java.util.Scanner;

public class Decimal {
    public static void main(String[] args) {
        int num, binaryVal, decimalVal = 0, base = 1, rem;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a binary num (1s and 0s): ");
        num = scanner.nextInt();
        binaryVal = num;
        System.out.println(binaryVal);
        while (num > 0) {
            rem = num % 10;
            decimalVal = decimalVal + rem * base;
            System.out.println(num = num / 10);
            //System.out.println(num);
            base = base * 2;
            //System.out.println(base);
        }

        System.out.println("Binary Value: " + binaryVal);
        System.out.println("Decimal Value: " + decimalVal);

        scanner.close();
    }
}
