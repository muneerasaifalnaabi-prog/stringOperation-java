public class StringCheckDemo {
    public static void main(String[] args) {

        String messege ="This is for fun ";
        System.out.println(messege);

        System.out.println("extract part of messege" + messege.substring(10,13));

        System.out.println("replace fun with game"+messege.replace("fun","game"));
        System.out.println("game exits :"+messege.contains("game"));
        System.out.println(messege.charAt(0));


    }
}
