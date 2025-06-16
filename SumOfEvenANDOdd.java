public class SumOfEvenANDOdd {
    private static int sum=0;
    private static int sum1=0;
    public static int Even(int num){
        if (num>0){
            if(num%2==0){
                sum+=num;

            }
           num-=1;
            Even(num);

        }
        return sum;
    }
    public static int Odd(int num){

        if (num>0){
            if (num%2!=0)
            sum1+=num;
            num-=1;
            Odd(num);

        }
        return sum1;
    }
}
