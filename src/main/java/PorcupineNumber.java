public class PorcupineNumber {

    public static int findPorcupineNumber(int n){

        while (true){
            if(isPrime(++n) && (n%10 == 9)){
                int j = n;
                while (true){
                    if(isPrime(++j)){
                        if(j%10 == 9){
                            return n;
                        }else {
                            break;
                        }
                    }
                }
            }
        }
    }


    public static boolean isPrime(int num){
        for (int i = 2; i<num;i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}
