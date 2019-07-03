import java.util.Scanner;
public class beak19{
        public static void main(String[] args){
                    Scanner scan=new Scanner(System.in);
                    int a=scan.nextInt();
                    int b=scan.nextInt();
                    int c=scan.nextInt();
                    if((a<=b&&a>=c)||(a>=b&&a<=c))
                    {
                                   System.out.print(a);
                    }
                    else if((b<=a&&b>=c)||(b>=a&&b<=c))
                    {
                                   System.out.print(b);
                    }
                    else System.out.print(c);
        }
} 