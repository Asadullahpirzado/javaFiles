public class Lab2_6 {
    public static void main(String[] args) {
        int[] odds=new int[15];
        int j=0;
        for (int i = 0; i <31 ; i++) {
            if (i%2!=0)
                odds[j]=j;
            System.out.println(i+" ");

        }
    }
}
