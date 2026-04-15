public class StringProcessDemo {
    public static void main(String[] args) {
        String employeeRecord = "  Ahmed Ali, HR, ahmed.ali@company.com  ";

        System.out.println("Original employee record :"+ employeeRecord);

        String cleanedRecord = employeeRecord.trim();
        System.out.println("After trim :"+ cleanedRecord);

        String[] recordParts = cleanedRecord.split(",");

        System.out.println("Name part :"+ recordParts[0]);
        System.out.println("Department part :"+ recordParts[1]);
        System.out.println("Email part :"+ recordParts[2]);

        String dept1 = "HR";
        String dept2 = "hr";
        System.out.println("HR equals hr ignore case :"+ dept1.equalsIgnoreCase(dept2));

        String emptyField = "";
        System.out.println("Empty field check :"+ emptyField.isEmpty());

    }
}