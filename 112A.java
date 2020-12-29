import java.util.Scanner;
public class Main112A {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String x=input.nextLine();
        String y=input.nextLine();
        if(x.equalsIgnoreCase(y)){
            System.out.println("0");
        }else if(x.compareToIgnoreCase(y)>0){
            System.out.println("1");
        }else{
            System.out.println("-1");
        }
       
    }
}
 
