public class StringDataDemo {
    public static void main(String[] args) {
        String employeeMessage ="Team meeting at 3PM";
        System.out.println(employeeMessage);
        System.out.println("Uppercase"+ employeeMessage.toUpperCase());
        System.out.println("Lowercase"+ employeeMessage.toLowerCase());
        System.out.println("Position of meeting"+ employeeMessage.indexOf("meeting"));
        System.out.println("Extract PM"+ employeeMessage.substring(16,18));

        System.out.println("Contains 3PM"+ employeeMessage.contains("3PM"));

    }
}
