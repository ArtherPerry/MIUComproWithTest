public class PrimeCount {

    public static int primeCount(int start, int end){
        if(end <2){
            return 0;
        }
        if(start<2){
            start = 2;
        }
        int count =0;
        for (int i = start;i<=end;i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }


    public static boolean isPrime(int num){
        for (int i =2; i<num;i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(primeCount(10,30));
    }

}
