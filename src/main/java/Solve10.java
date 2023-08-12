public class Solve10 {

    public static int [] solve10(){
        int [] result = new int [2];
        int target  = factorial(10);

        for (int x= 1; x<= 10; x++){
            for (int y =1; y<= 10;y++){
                if(factorial(x)+factorial(y) == target){
                    result[0] = x;
                    result[1] = y;
                    return result;
                }
            }
        }
        return result;
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int [] arr = solve10();
        System.out.println("x == " + arr[0] + " y == "+ arr[1]);

    }

}
