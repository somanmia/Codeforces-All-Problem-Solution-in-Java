import java.util.Scanner;
public class Main110A {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int i,count=0;
        String N=input.nextLine();
        for(i=0;i<N.length();i++){
              if(N.charAt(i)=='7' || N.charAt(i)=='4'){
                  count++;
              }
    }
        if(count==7 || count==4){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
