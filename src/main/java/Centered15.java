

public class Centered15 {
    public static int isCentered15(int[] a) {

        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = i; j < a.length; j++) {
                    sum +=a[j];
                    if(sum == 15){
                        int beforeCount = i;
                        int afterCount = a.length-j-1;
                        if(beforeCount == afterCount){
                            return 1;
                        }
                    }
            }
        }
        return 0;
    }

}
