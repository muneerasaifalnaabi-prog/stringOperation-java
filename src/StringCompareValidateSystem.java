import java.util.Scanner;

public class StringCompareValidateSystem {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String text1 = sc.nextLine();
        System.out.println("Original:" + text1);
        System.out.println("Length:" + text1.length());

        System.out.println("Enter second string:");
        String text2=sc.nextLine();
        if(text1.equals(text2)){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are different");
        }


    }
}