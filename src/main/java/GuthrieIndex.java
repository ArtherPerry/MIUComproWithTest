public class GuthrieIndex {

    public static int guthrieIndex(int n){
        if( n < 2){
            return 0;
        }
        int indexCount = 0;
       while ( n!= 1){
           if(n%2 == 0){
               n /=2;
               indexCount++;
           }else {
               n= n*3+1;
               indexCount++;
           }
       }
        if(n == 1){
            return indexCount;
        }
        return 0;
    }
}
