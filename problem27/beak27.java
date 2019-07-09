import java.util.Scanner;
public class beak27{
          public static void main(String[] args){
                   Scanner scan=new Scanner(System.in);
                   int num=scan.nextInt();
                   int a,b;
                   for(int i=1;i<=num;i++)
                   {
                          a=scan.nextInt();
                          b=scan.nextInt();
                          System.out.print("Case #"+i+": "+a+" + "+b+" = "+(a+b)+"\n");
                   }      
          }
}