import java.util.Scanner;

public class StringLoopValidationSystem {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String text = sc.nextLine();

        System.out.println("Original:" + text);
        System.out.println("Length:" + text.length());

        System.out.println("Each character:");
        int vowels = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            System.out.println(ch);
            ch = Character.toLowerCase(ch);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }

        }
        System.out.println("Total vowels:"+vowels);
    }}