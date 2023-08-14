public class IsDivisible {

    public static int isDivisible(int []a , int divisor){
        if(a== null || a.length<1){
            return 1;
        }

        for (int i =0; i<a.length;i++){
            if(a[i]%divisor != 0 ){
                return 0;
            }
        }
        return 1;
    }

}
