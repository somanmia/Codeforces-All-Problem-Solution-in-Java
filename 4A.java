import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int N=input.nextInt();
        if(N%2==0 && N>2){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
