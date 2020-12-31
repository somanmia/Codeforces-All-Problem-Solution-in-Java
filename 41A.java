import java.util.Scanner;
public class Main41A {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();
        String t=input.nextLine();
        StringBuffer w=new StringBuffer(s);
        String n=String.valueOf( w.reverse()); 
       
        if(t.equals(n)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
