import java.util.Scanner;

public class StringMenuDemo {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String text = sc.nextLine();

        System.out.println("Menu ==");
        System.out.println("Enter choice (1-5):");
        System.out.println("1. Length");
        System.out.println("2. To Uppercase");
        System.out.println("3. To Lowercase");
        System.out.println("4. Contains 'java'");
        System.out.println("5. Compare with another string");

        int choice=sc.nextInt();


    }
}

