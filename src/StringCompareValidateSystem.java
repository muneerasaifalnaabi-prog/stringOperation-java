import java.util.Scanner;

public class StringCompareValidateSystem {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String text1 = sc.nextLine();
        System.out.println("Original Text :" + text1);
        System.out.println("Length:" + text1.length());

        System.out.println("Enter second string:");
        String text2=sc.nextLine();
        if(text1.equals(text2)){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are different");
        }

        System.out.println("Enter prefix:");
        String prefix=sc.next();
        if(text1.startsWith(prefix)){
            System.out.println("Starts with prefix");
        }
        else{
            System.out.println("Does not start with prefix");
        }

        System.out.println("Enter suffix:");
        String suffix=sc.next();
        if(text1.endsWith(suffix)){
            System.out.println("Ends with suffix");
        }
        else{
            System.out.println("Does not end with suffix");
        }

        if(text1.length()>8){
            System.out.println("String is long");
        }
        else{
            System.out.println("String is short");
        }



    }
}