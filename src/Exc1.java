public class Exc1 {

    public static void main(String[] args) {

        int number1 = 15;
        int number2 = 20;

        int numberOfPrimes = 0;

        int i;

        for (i = number1; i <= number2; i++) {
            int flag = 0;
            for (int k = 2; k < i; k++) {
                if (i % k == 0) {
                    flag = +1;
                }
            }
            if (flag == 0) {
                System.out.println(i + " is prime");
                numberOfPrimes++;

            }
        }
        System.out.println("There were " + numberOfPrimes + " prime numbers");


    }

}
