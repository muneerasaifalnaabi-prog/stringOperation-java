public class StringDoWhileDemo {
    public static void main(String[] args) {


        String text = "Hello World Java Programming";
        System.out.println("Original string:" + text);

        System.out.println("Total characters:"+text.length());
        int index=0;
        System.out.println("Each character:");
        do{
            char ch=text.charAt(index);
            System.out.println(ch);
            index++;
        }while(index<text.length());

    }
}
