public class UC7_StringJoin {
    public static void main(String[] args) {

        // Check if no arguments are passed
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Join all arguments with comma and space
            String names = String.join(", ", args);

            // Print greeting
            System.out.println("Hello " + names + "!");
        }
    }
}