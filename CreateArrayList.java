import java.util.ArrayList;
import java.util.Scanner;

public class CreateArrayList {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<String> stringlist=new ArrayList<>();
         //stringlist=input.nextLine();
        for (int i = 0; i <5 ; i++) {
            stringlist.add(input.nextLine());

        }
        for(String nam : stringlist )
            System.out.println(nam);
    }
}
