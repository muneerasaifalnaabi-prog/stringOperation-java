import java.util.Scanner;

public class CompleteStringProcessingSystem {
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

        System.out.println("Enter another string:");

        sc.nextLine();
        String text2=sc.nextLine();
        if(text.equalsIgnoreCase(text2)){
            System.out.println("Strings match");
        }
        else{
            System.out.println("Strings do not match");
        }
        System.out.println("First character:"+text.charAt(0));

        System.out.println("Each character:");
        int vowels=0;
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            System.out.println(ch);
            ch=Character.toLowerCase(ch);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowels++;
            }
        }
        System.out.println("Total vowels:"+vowels);

        if(text.length()>10){
            System.out.println("String is long");
        }
        else{
            System.out.println("String is short");
        }





    }
}
