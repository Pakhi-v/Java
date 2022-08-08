import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float eng, hin, maths, sst, sci;
        double total,percentage;
        Scanner ch = new Scanner(System.in);
        System.out.println("Enter marks of 5 subjects:");
        System.out.println("English:");
        eng = ch.nextFloat();
        System.out.println("Hindi:");
        hin = ch.nextFloat();
        System.out.println("Maths:");
        maths = ch.nextFloat();
        System.out.println("SST:");
        sst = ch.nextFloat();
        System.out.println("Science:");
        sci = ch.nextFloat();
        total = eng + sci + maths + sst + hin;
        percentage = (total/500.0) * 100;
        System.out.println("Percentage ="+percentage);





    }
}