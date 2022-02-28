import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("N ni kiriting: ");
        int n = scanner.nextInt();

        for (int i=0; i<=n; i++) {
            if (i%3 ==0) {
                System.out.println("");
            }
            System.out.print(i+" ");
        }
    }
}