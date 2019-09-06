public class Exc1 {

    public static void main(String[] args) {

        int number1 = 15;
        int number2 = 20;
        int primeCheck;

        for (int i = number1; i < number2; ) {

            int dividingNumbers = 2;


            while (dividingNumbers < 10) {
                int b = 1;

                primeCheck = i % dividingNumbers;
                if (primeCheck != 0) {
                    System.out.println(i + " is prime");
                    dividingNumbers++;
                    b++;
                }
            }
            i++;


        }


    }

}
