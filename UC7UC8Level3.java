public class UC7UC8Level3 {

    // Recursive method to find Fibonacci number
    public static int findFibonacci(int position) {
        
        // Base cases
        if (position == 0) {
            return 0;
        }
        if (position == 1) {
            return 1;
        }

        // Recursive case
        return findFibonacci(position - 1) + findFibonacci(position - 2);
    }

    public static void main(String[] args) {

        // Number of terms
        int totalTerms = 6;

        System.out.println("Fibonacci Series:");

        // Loop to print series
        for (int index = 0; index < totalTerms; index++) {
            int result = findFibonacci(index);
            System.out.print(result + " ");
        }
    }
}