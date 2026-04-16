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
        System.out.println("4. searsh in your string ");
        System.out.println("5. Compare with another string");

        int choice=sc.nextInt();

        switch(choice){
            case 1:
                System.out.println("Length:"+text.length());
                break;
            case 2:
                System.out.println("Uppercase:"+text.toUpperCase());
                break;
            case 3:
                System.out.println("Lowercase:"+text.toLowerCase());
                break;
            case 4:
                System.out.println("Enter word to searsh ");
                String searsh= sc.nextLine();
                sc.nextLine();
                if(text.contains(searsh)){
                    System.out.println("found it "+ searsh);
                }
                else{
                    System.out.println("Does not contain");
                }
                break;
            case 5:
                sc.nextLine();

                System.out.println("Enter another string:");
                String text2=sc.nextLine();
                if(text.equalsIgnoreCase(text2)){
                    System.out.println("Strings match");
                }
                else{
                    System.out.println("Strings do not match");
                }
                break;
            default:
                System.out.println("Invalid choice");
        }


    }
}

