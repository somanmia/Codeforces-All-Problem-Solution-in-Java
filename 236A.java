import java.util.Scanner;
public class Main236A{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       char ch[]=new char[100];
       char temp;
       String str=input.next();
       for(int i=0;i<str.length();i++){
           ch[i]=str.charAt(i);
       }
        for(int i=0;i<str.length();i++){
            for(int j=0;j<str.length()-1;j++){
                 if(ch[j]>ch[j+1]){
                     temp=ch[j];
                     ch[j]=ch[j+1];
                     ch[j+1]=temp;
                 }
            }
        }
        int count=0;
        for(int i=0;i<str.length();i++){
            if(ch[i]!=ch[i+1]){
                count++;
            }
        }
     if(count%2==0){
         System.out.println("CHAT WITH HER!");
     }else{
         System.out.println("IGNORE HIM!");
     }
    }
}
