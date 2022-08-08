import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Taking Input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1:");
        int a = sc.nextInt();
        System.out.println("Enter number 2:");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("Sum is:");
        System.out.println(sum);
    }
}