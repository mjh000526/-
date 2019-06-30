import java.util.Scanner;
public class beak14{
         public static void main(String[] args){
             int a;
             int b;
             int c;
             Scanner num=new Scanner(System.in);
             a=num.nextInt();
             b=num.nextInt();
             c=num.nextInt();
             int A;
             int B;
             int C;
             int D;
             A=(a+b)%c;
             B=(a%c+b%c)%c;
             C=(a*b)%c;
             D=(a%c*b%c)%c;
             System.out.print(A+"\n"+B+"\n"+C+"\n"+D);
         }
}