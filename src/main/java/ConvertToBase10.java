public class ConvertToBase10 {
    public static int convertToBase10(int [] a, int base){
        int isLegal = IsLegalNumber.isLegalNumber(a, base);
        if(isLegal == 0){
            return -1;
        }
        int sum = 0;
        for (int i = a.length-1;i >=0; i--){
            sum+= a[i]*Math.pow(base,i);
        }
        return sum;
    }

    public static void main(String[] args) {
        int [] arr = {1,0,1,1};
        int base = 2;
        System.out.println(convertToBase10(arr,base));
    }
}
