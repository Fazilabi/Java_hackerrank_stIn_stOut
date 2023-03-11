import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("how many numbers you want to enter? : ");
        int a  = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        int count = scan.nextInt();
        int[] list = new int[count];

            for (int k = 0; k < count; k++) {
                int number = scan.nextInt();
                list[k] = number;
            }
        for (int i = 0; i <count ; i++) {
        System.out.println(list[i]);
        }






    }
}