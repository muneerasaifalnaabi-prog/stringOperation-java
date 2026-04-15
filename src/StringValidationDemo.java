public class StringValidationDemo {
    public static void main(String[] args) {
        String username ="user_muneera@gmail.com";
        System.out.println(username);
        System.out.println("Starts with user"+ username.startsWith("user"));

        System.out.println("Ends with .com"+ username.endsWith(".com"));

        String updatedUser =username.replace("_"," ");
        System.out.println("After replace"+ updatedUser);

        System.out.println("Extract gmail part"+ username.substring(0,12));

        System.out.println("Username length"+ username.length());

    }
}
