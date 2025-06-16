import java.util.Random;

public class Lab3_9 {
    public static void main(String[] args) {
        Random rand= new Random();
        int num= rand.nextInt(9999-1000+1)+1000;
        String plate="";
        for(int i=0;i<=2;i++){

            char letter = (char)(rand.nextInt(26) + 'A'); // 'A' is 65, so this gives A–Z
            plate = plate + letter;

        }
        String str=String.valueOf(num);
        System.out.println("Your number plate is "+plate+str);

    }
}
