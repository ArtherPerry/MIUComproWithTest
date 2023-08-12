public class RepsEqual {

    public static int repsEqual(int [] a,int n){
        int num = n;
        int i =1;
        while (num > 0){
            int digit = num%10;
            if(a[a.length-i] != digit){
                return 0;
            }
            i++;
            num/=10;
        }
        return 1;
    }




}
