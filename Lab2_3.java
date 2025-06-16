import java.util.Scanner;

public class Lab2_3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str="The quick brown fox jumps over the lazy dog.";
        StringBuilder n=new StringBuilder(str);
        String str1="cat";
        int i=str.indexOf("fox");
        n.replace(i,(i+3),str1);
        System.out.println(n);
    }
}
