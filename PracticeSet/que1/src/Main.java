import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     System.out.println("Enter numbers:");
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        int c = Sc.nextInt();
        int sum = a + b + c;
        System.out.println("Sum is:"+sum);

    }
}