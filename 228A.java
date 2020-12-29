import java.util.Arrays;
import java.util.Scanner;
public class Main228 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int array[]=new int[4];
        int i,count=0;
        for(i=0;i<4;i++){
            array[i]=input.nextInt();
        }
        Arrays.sort(array);
        for(i=0;i<3;i++){
            if(array[i]==array[i+1]){
                count++;
            }
        }
        System.out.println(""+count);
    }
}
