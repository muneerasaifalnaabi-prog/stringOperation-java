public class tringNestedLoopDemo {
    public static void main(String[] args) {
        String text1="Hello";
        String text2="World";

        System.out.println("String 1:"+text1);
        System.out.println("String 2:"+text2);

        System.out.println("Length 1:"+text1.length());
        System.out.println("Length 2:"+text2.length());

        int matches=0;
        System.out.println("Matching characters:");
        for(int i=0;i<text1.length();i++){
            for(int j=0;j<text2.length();j++){
                if(text1.charAt(i)==text2.charAt(j)){
                    System.out.println(text1.charAt(i));
                    matches++;
                }
            }
        }
        System.out.println("Total matching characters:"+matches);

        String str1="Java";
        String str2="Cat";
        System.out.println("Word1:"+str1);
        System.out.println("Word2:"+str2);

        System.out.println("Character comparison:");

        for(int i=0;i<str1.length();i++){
            for(int j=0;j<str2.length();j++){
                System.out.println(str1.charAt(i) +str2.charAt(j));
            }
        }



    }


}
