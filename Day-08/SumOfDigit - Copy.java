public class SumOfDigit {
    public static void main(String args[]) {

        int number = 123456789;


        int result = 0;
        while (number > 0) {
            int digit = number % 10;
            result += digit;
            number /= 10;
        }

        System.out.println(result);

    }

}
