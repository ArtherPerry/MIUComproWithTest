public class IsLegalNumber {
    public static int isLegalNumber(int [] a, int base){
       for (int i : a){
           if(i >= base){
               return 0;
           }
       }
       return 1;
    }

}
