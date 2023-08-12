public class SquarePair {

    public static int countSquarePair(int [] a){
        int count = 0;
        int sum = 0;
        if(a.length < 2){
            return 0;
        }
        for (int i = 0;i<a.length-1;i++){
            for (int j = i+1;j<a.length;j++){
                sum = a[i]+ a[j];
                if(a[i]>0 && a[j] >0 && isPerfectSquare(sum)){
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean isPerfectSquare(int num){
        int i = 0;
        while (i*i <= num){
            if(i*i == num){
                return true;
            }
            i++;
        }
        return false;
    }

    public static void main(String[] args) {
        int [] arr1  = {9, 0, 2, -5, 7};
        System.out.println(countSquarePair(arr1));
    }

}
