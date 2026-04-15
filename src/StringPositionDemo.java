public class StringPositionDemo {
    public static void main(String[] args) {


    String emailAddress = "codline@gmail.com";
    System.out.println("Original Email :"+ emailAddress);

        System.out.println("Position of @ :"+ emailAddress.indexOf("@"));
        System.out.println("Position of gmail :"+ emailAddress.indexOf("gmail"));

        System.out.println("Email starts with support"+ emailAddress.startsWith("codline"));
        System.out.println("Email ends with .com"+ emailAddress.endsWith(".com"));

}
}



