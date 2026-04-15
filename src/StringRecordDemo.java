public class StringRecordDemo {
    public static void main(String[] args) {
        String customerRecord ="  Order Confirmed  ";
        System.out.println(customerRecord);

        String cleanedRecord =customerRecord.trim();
        System.out.println("Cleaned"+ cleanedRecord);

        String str1 ="Order";
        String str2 ="order";
        System.out.println("Order equals order"+ str1.equalsIgnoreCase(str2))

    }

}
