import java.util.Scanner;

public class StringValidationSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a string:");
        String text=sc.nextLine();
        System.out.println("Original:"+text);
        System.out.println("Length:"+text.length());
        System.out.println("Uppercase:"+text.toUpperCase());
        System.out.println("Lowercase:"+text.toLowerCase());

        System.out.println("Enter word to search:");

        String word=sc.next();
        if(text.contains(word)){
            System.out.println("Word found");
        }
        else{
            System.out.println("Word not found");
        }

        System.out.println("Enter another string for comparison:");
        String text2=sc.nextLine();
        if(text.equalsIgnoreCase(text2)){
            System.out.println("Strings match");
        }
        else{
            System.out.println("Strings do not match");
        }





    }
}
