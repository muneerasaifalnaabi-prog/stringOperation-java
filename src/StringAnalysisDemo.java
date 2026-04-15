public class StringAnalysisDemo {
    public static void main(String[] args) {


        String customerFeedback = "Welcome to our store";
        System.out.println(customerFeedback);
        System.out.println("Length of feedback"+ customerFeedback.length());
        String customerFeedback2 ="Welcome to our store";
        System.out.println("Both feedbacks equal"+ customerFeedback.equals(customerFeedback2));
        System.out.println("Position of store"+ customerFeedback.indexOf("store"));



    }
}