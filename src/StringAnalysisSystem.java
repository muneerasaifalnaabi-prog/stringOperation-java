import java.util.Scanner;

public class StringAnalysisSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String text=sc.nextLine();

        System.out.println("Original:"+text);
        System.out.println("Length:"+text.length());

        System.out.println("Enter word to search:");
        String word=sc.next();
        if(text.contains(word)){
            System.out.println("Word found");
        }
        else{
            System.out.println("Word not found");
        }



    }
}
