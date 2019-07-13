import java.util.Scanner;
public class beak31{
         public static void main(String[] args){
                 Scanner scan=new Scanner(System.in);
                 int a=-1,b=-1;
                 while(a!=0&&b!=0){
                        a=scan.nextInt();
                        b=scan.nextInt();
                        if(a!=0||b!=0)
                        {
                               System.out.print((a+b)+"\n");
                        }
                 }
         }
} 