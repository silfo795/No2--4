import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        int n=in.nextInt();
        for(int i=0;i<str.length();i++)
            System.out.print((char)((int)str.charAt(i)+n));
        System.out.println();
    }
}
