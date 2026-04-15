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

        index=0;
        int lowercase=0;
        int spaces=0;

        do{
            char ch=text.charAt(index);
            if(ch>='a'&&ch<='z'){
                lowercase++;
            }
            if(ch==' '){
                spaces++;
            }
            index++;
        }while(index<text.length());

        System.out.println("Total lowercase letters:"+lowercase);
        System.out.println("Total spaces:"+spaces);





    }
}
