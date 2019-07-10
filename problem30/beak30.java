import java.util.Scanner;
public class beak30{
         public static void main(String[] args){
                 Scanner scan=new Scanner(System.in);
                 int n=scan.nextInt();
                 int x=scan.nextInt();
                 int num;
                 for(int i=0;i<n;i++)
                 {
                      num=scan.nextInt();
                      if(num<x)
                      {
                           System.out.print(num+"\n");
                      }
                 }
         }
}