import java.util.Scanner;
public class beak32{
        public static void main(String[] args){
                Scanner scan=new Scanner(System.in);
                int a,b;
                while(scan.hasNextInt()){
                     a=scan.nextInt();
                     b=scan.nextInt();
                     System.out.print(a+b);
                }
        }
}