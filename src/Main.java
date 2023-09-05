import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, n2;
        int select;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        n1 = sc.nextInt();

        System.out.print("Enter the second number : ");
        n2 = sc.nextInt();

        System.out.println("Choose an operation\n1-)Summation\n2-)Extraction\n3-)Multiplication\n4-)Division");
        select = sc.nextInt();
        if (select < 1 || select > 4) {
            System.out.println("Make a valid selection !");
        }
        switch  (select) {
            case 1:
                System.out.println("Result = " + (n1 + n2));
                break;
            case 2:
                System.out.println("Result = " + (n1 - n2));
                break;
            case 3:
                System.out.println("Result = " + (n1 * n2));
                break;
            case 4:
                if (n2 == 0) {
                    System.out.println("Division by 0 is not possible!");
                } else{
                    System.out.println("Result = " + (n1 / n2));
                }

        }
    }
}
