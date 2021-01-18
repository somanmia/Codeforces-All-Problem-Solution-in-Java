import java.util.Scanner;
public class Main1283A {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int i,duration,hour,munit,T;
        T=input.nextInt();
        for(i=0;i<T;i++){
            hour=input.nextInt();
            munit=input.nextInt();
            duration=(24*60)-(hour*60+munit);
            System.out.println(""+duration);
        }
    }
}
