import java.util.Scanner;

public class CompleteStringProcessingSystem {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String text=sc.nextLine();

        System.out.println("Original:"+text);
        System.out.println("Length:"+text.length());
        System.out.println("Uppercase:"+text.toUpperCase());


    }
}
