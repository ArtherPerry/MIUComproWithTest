public class Inertial {

    public static int isInertial(int [] a){
        Integer max = Integer.MIN_VALUE;
        boolean isContainedOdd = false;

        for (int i =0; i<a.length;i++){
            if(a[i]%2 != 0){
                isContainedOdd = true;
            }
            if(max < a[i]){
                max = a[i];
            }
        }

        if(!isContainedOdd || max%2 != 0){
            return 0;
        }

        for (int j = 0; j<a.length;j++){
            if(a[j]%2 == 0 && a[j] != max && !isOddGreater(a,a[j])){
                return 0;
            }
        }
        return 1;
    }


    public static boolean isOddGreater(int [] a, int evenNum){
        for (int i = 0;i<a.length;i++){
            if(a[i]%2 != 0 && evenNum> a[i]){
                return false;
            }
        }
        return true;
    }


}
