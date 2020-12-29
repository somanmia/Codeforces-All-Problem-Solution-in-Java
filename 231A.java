import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x,y,z,i,win=0;
        int N=input.nextInt();
       for(i=0;i<N;i++){
             x=input.nextInt();
             y=input.nextInt();
             z=input.nextInt();
             if((x==1 && y==1) || (x==1 && y==1 && z==1) || (y==1 && z==1) ||(z==1 && x==1)){
               win++;
   }
            
        }
        System.out.println(win);
    }
}
