public class IsSquare {

    public static int isSquare(int n){
        int i = 0;
        while (i*i <= n){
            if(i*i == n){
                return 1;
            }
            i++;
        }
        return 0;
    }



}
