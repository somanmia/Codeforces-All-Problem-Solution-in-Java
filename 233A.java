import java.util.Scanner;
public class Main233 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        if(x%2!=0){
            System.out.println("-1");
        }else{
            for(int i=1;i<=x;i++){
                if(i%2!=0){
                    System.out.print((i+1)+" ");
                }else{
                    System.out.print((i-1)+" ");
                }
            }
            System.out.println("");
        }
    }
}
