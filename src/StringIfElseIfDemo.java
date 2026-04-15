public class StringIfElseIfDemo {
    public static void main(String[] args) {
        String text="Muneera Saif ";
        System.out.println("Original string:"+text);
        if(text.isEmpty()){
            System.out.println("String is empty");
        }
        else if(text.length()<5){
            System.out.println("String is short");
        }
        else if(text.startsWith("H")){
            System.out.println("String starts with H");
        }
        else if(text.endsWith("d")){
            System.out.println("String ends with d");
        }
        else if(text.equalsIgnoreCase("helloworld")){
            System.out.println("String matches helloworld");
        }

        else{
            System.out.println("Default case");
        }

        //end



    }





}
