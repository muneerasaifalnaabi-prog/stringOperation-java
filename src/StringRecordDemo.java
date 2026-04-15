public class StringRecordDemo {
    public static void main(String[] args) {
        String customerRecord ="  Order Confirmed  ";
        System.out.println(customerRecord);

        String cleanedRecord =customerRecord.trim();
        System.out.println("Cleaned"+ cleanedRecord);

        String str1 ="Order";
        String str2 ="order";
        System.out.println("Order equals order"+ str1.equalsIgnoreCase(str2));

        String[] parts =cleanedRecord.split(" ");
        System.out.println("Part 1"+ parts[0]);
        System.out.println("Part 2"+ parts[1]);

        System.out.println("Is empty"+ customerRecord.isEmpty());

        System.out.println("First char"+ cleanedRecord.charAt(0));




    }

}
