public class NUnique {

    public static  int isNUnique(int []a,int n){
        int count = 0;

        for (int i =0;i<a.length-1;i++){
            for (int j= i+1; j<a.length;j++){
                if(a[i]+ a[j] == n){
                    count++;
                }
            }
        }
        if(count == 1){
            return 1;
        }
        return 0;
    }


}
