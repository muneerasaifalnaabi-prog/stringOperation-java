public class StringSwitchDemo {
    public static void main(String[] args) {


        String role = "Admin";
        System.out.println("User role:" + role);

        switch(role){
            case "Admin":
                System.out.println("Full access granted");
                break;
            case "Manager":
                System.out.println("Manager access granted");
                break;
            case "User":
                System.out.println("User access granted");
                break;
            default:
                System.out.println("Unknown role");
        }


    }
}