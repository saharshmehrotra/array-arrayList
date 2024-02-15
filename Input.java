import java.util.Scanner;

public class Input {
    public static int getNumberOfElements() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        sc.close();
        return n;
    }
}
