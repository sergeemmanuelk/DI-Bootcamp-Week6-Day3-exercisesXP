public class Main {
    public static void main(String[] args) {

        System.out.println("Armstrong numbers between 1 and 500 are: ");
        for (int i = 1; i <= 500; i++) {

            int number = i;
            int sum = 0;

            while (number != 0) {
                int lastDigit = number % 10;
                sum += lastDigit * lastDigit * lastDigit;
                number /= 10;
            }
            if (sum == i) {
                System.out.print(i + " ");
            }
        }
    }
}