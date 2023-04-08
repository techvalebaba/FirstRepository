import java.util.Scanner;

public class PrintNNaturalNumber {
    public static void main(String[] args) {
        System.out.println("Hello World!!");

        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter any number: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++)
        {
            System.out.println("The value of i: "+i);
        }

    }
}
