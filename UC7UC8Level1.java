public class UC7UC8Level1 {

    // Method to check even or odd
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {

        // Input value stored in variable
        int inputNumber = 17;

        // Calling method
        boolean result = isEven(inputNumber);

        // Display result
        if (result) {
            System.out.println(inputNumber + " is Even");
        } else {
            System.out.println(inputNumber + " is Odd");
        }
    }
}