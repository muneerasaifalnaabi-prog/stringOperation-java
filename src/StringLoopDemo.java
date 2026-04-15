public class StringLoopDemo {
    public static void main(String[] args) {


        String text = "Hello World 123";
        System.out.println("original string :" + text);
        System.out.println("  number of characters :" + text.length());
        for (int i =0; i<text.length();i++){
            char c = text.charAt(i);
            System.out.println(c);
        }

        int vowels=0;
        int consonants=0;
        int digits=0;

        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            ch=Character.toLowerCase(ch);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowels++;
            }
            else if(ch>='a'&&ch<='z'){
                consonants++;
            }
            else if(ch>='0'&&ch<='9'){
                digits++;
            }
        }
        System.out.println("Total vowels:"+vowels);
        System.out.println("Total consonants:"+consonants);
        System.out.println("Total digits:"+digits);


    }
}