public class StringOperationsDemo {
    public static void main(String[] args) {
            String CustomerName = "Ali";

        System.out.println("The Length of name" +CustomerName.length() );
        System.out.println(" To uppercase :" +CustomerName.toUpperCase() );
        System.out.println(" To Lowercase  :" +CustomerName.toLowerCase() );

        String CompanyName = "Codeline ";
        String combined = CustomerName.concat(CompanyName);
        System.out.println("Customer Name : " + CustomerName + " Company :" + CompanyName);

        System.out.println(combined);

    }


}
