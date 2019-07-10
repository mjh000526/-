import java.util.Scanner;
public class beak29{
         public static void main(String[] args){
                 Scanner scan=new Scanner(System.in);
                 int num=scan.nextInt();
                 for(int i=1;i<=num;i++)
                 {
                       for(int j=num;j>i;j--)
                       {
                               System.out.print(" ");
                       }
                       for(int x=1;x<=i;x++)
                       {
                               System.out.print("*");       
                       }
                       System.out.print("\n");
                 }
         }
}