import java.util.Scanner;
public class Main1328A {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int i,a,b,count,N;
        N=input.nextInt();
        for(i=1;i<=N;i++){
            a=input.nextInt();
            b=input.nextInt();
          
                if(a%b==0){
                    System.out.println("0");
                   
                }else{
                    count=b-(a%b);
		    System.out.println(""+count);
 
                }
            }
        
    }
}
 
