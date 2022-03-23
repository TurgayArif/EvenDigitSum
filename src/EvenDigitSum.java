public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            return -1;
        }

        int remainder = 0;
        int originalNumber = number;
        int sum = 0;

        while (originalNumber > 0) {
            remainder = originalNumber % 10;
            if (remainder % 2 == 0) {
                sum = sum + remainder;
            }
            originalNumber /= 10;
        }
        return sum;
    }
}
