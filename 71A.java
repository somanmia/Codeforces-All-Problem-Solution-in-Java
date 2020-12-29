import java.util.Scanner;
public class Main71A {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int i,Len;
        String str;
        int N=input.nextInt();
        input.nextLine();
       
        for(i=1;i<=N;i++){
               str=input.nextLine();
               Len=str.length();
              if(10<Len){
                  
                  String fchar=str.substring(0,1);
                  String lchar=str.substring(Len-1,Len);
                  System.out.printf("%s%d%s\n",fchar,Len-2,lchar);
                
                 
            }else{
                
                  System.out.println(""+str);
              }   
              
        }
        
      
    }
}
