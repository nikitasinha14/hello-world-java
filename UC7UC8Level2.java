public class UC7UC8Level2 {

    // Method to find maximum of three numbers
    public static int findMaximum(int number1, int number2, int number3) {
        int maximumValue = Math.max(number1, Math.max(number2, number3));
        return maximumValue;
    }

    public static void main(String[] args) {

        // Input values stored in variables
        int firstNumber = 25;
        int secondNumber = 40;
        int thirdNumber = 15;

        // Calling method
        int result = findMaximum(firstNumber, secondNumber, thirdNumber);

        // Display output
        System.out.println("Maximum value is: " + result);
    }
}