public class Henry {

        public static int henry(int i, int j) {
            int count = 0;
            int num = 1;
            int sum = 0;

            while (count < j) {
                if (isPerfectNumber(num)) {
                    count++;
                    if (count == i || count == j) {
                        sum += num;
                    }
                }
                num++;
            }

            return sum;
        }

        public static boolean isPerfectNumber(int num) {
            int sumOfFactors = 0;

            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    sumOfFactors += i;
                }
            }

            return sumOfFactors == num;
        }

    }
