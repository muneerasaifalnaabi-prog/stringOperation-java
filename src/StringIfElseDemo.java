public class StringIfElseDemo {
    public static void main(String[] args) {
        String username="Muneera Saif ";

        System.out.println("Username:"+username);

        if(username.length()>5){
            System.out.println(" the condition is true ");
        }
        else{
            System.out.println("Username too short");
        }

        String password="Munee1234";

        if(password.equals("Munee1234")){
            System.out.println("Password correct");
        }
        else{
            System.out.println("Password incorrect");
        }

    }


}
