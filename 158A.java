import java.util.Scanner;
public class Main158A {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int N,K,i,count=0;
        N=input.nextInt();
        K=input.nextInt();
        int array[]=new int[N];
        for(i=0;i<N;i++){
            array[i]=input.nextInt();
        }
        for(i=0;i<N;i++){
            if(array[i]>0 && array[K-1]<=array[i]){
                count++;
            }
        }
        System.out.println(""+count);
    }
}
