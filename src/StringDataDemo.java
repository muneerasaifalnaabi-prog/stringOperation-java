public class StringDataDemo {
    public static void main(String[] args) {
        String employeeMessage ="Team meeting at 3PM";
        System.out.println(employeeMessage);
        System.out.println("Uppercase"+ employeeMessage.toUpperCase());
        System.out.println("Lowercase"+ employeeMessage.toLowerCase());
        System.out.println("Position of meeting"+ employeeMessage.indexOf("meeting"));
    }
}
