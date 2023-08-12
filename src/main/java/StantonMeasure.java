public class StantonMeasure {

    public static int stantonMeasure(int [] a){
        int count = 0;
        int result = 0;
        if(a == null || a.length<1){
            return 0;
        }

        for (int i: a){
            if(i == 1){
                count++;
            }
        }
        for (int j : a){
            if(count == j){
                result++;
            }
        }
        return result;
    }

}
