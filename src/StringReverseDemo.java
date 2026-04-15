public class StringReverseDemo {

    public static void main(String[] args) {
        String text="Programming";
        System.out.println("Original string:"+text);

        System.out.println("Total characters:"+text.length());

        System.out.println("Forward char order :");
        for(int i=0;i<text.length();i++){
            System.out.println(text.charAt(i));
        }

        System.out.println("Reverse oreder char:");
        String reversed="";
        for(int i=text.length()-1;i>=0;i--){
            char ch=text.charAt(i);
            System.out.println(ch);
            reversed+=ch;
        }
        System.out.println("Reversed string:"+reversed);



    }
}
