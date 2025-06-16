public class Factorial {
    public static int factorial(int num,int power){
        if (power >= 0) {
            return (int)(Math.pow(num,power)*factorial(num,(power-1)));

        }
        return -1;



    }

}
