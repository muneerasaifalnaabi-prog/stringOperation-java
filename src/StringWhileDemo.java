public class StringWhileDemo {
    public static void main(String[] args) {
        String text = "Hello World Java Programming";
        System.out.println("Original string:" + text);

        System.out.println("Total characters:" + text.length());

        int index = 0;
        System.out.println("Each character:");
        while (index < text.length()) {
            char ch = text.charAt(index);
            System.out.println(ch);
            index++;
        }
        index = 0;
        int spaces = 0;
        int uppercase = 0;

        while (index < text.length()) {
            char ch = text.charAt(index);
            if (ch == ' ') {
                spaces++;
            }
            if(ch>='A'&&ch<='Z'){
                uppercase++;
            }
            index++;
        }
        System.out.println("Total spaces:"+spaces);
        System.out.println("Total uppercase letters:"+uppercase);



        }
    }}
