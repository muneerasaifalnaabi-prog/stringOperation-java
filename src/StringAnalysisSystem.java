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

        System.out.println("Enter another string:");
        sc.nextLine();
        String text2=sc.nextLine();
        if(text.equalsIgnoreCase(text2)){
            System.out.println("Strings match");
        }
        else{
            System.out.println("not match");
        }

        System.out.println("First character:"+text.charAt(0));
        if(text.length()>10){
            System.out.println("String is long");
        }
        else{
            System.out.println("String is short");
        }

        //end




    }
}
