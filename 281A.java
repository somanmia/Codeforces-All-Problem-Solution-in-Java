import java.util.Scanner;
public class Main281A {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        String flatter=str.substring(0,1).toUpperCase();
        String x=flatter+str.substring(1,str.length());
        System.out.println(""+x);
    }
}
