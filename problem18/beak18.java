import java.util.Scanner;
public class beak18{
        public static void main(String[] args){
                  Scanner scan=new Scanner(System.in);
                  int h=scan.nextInt();
                  int m=scan.nextInt();
                  if(m<45)
                  {
                       h=h-1;
                       if(h==-1)
                       {
                             h=23;
                       }
                       System.out.println(h+" "+(m+15));
                  }
                  else if(m==45)
                  {
                            System.out.println(h+" 0");
                  }
                  else 
                  {
                        System.out.println(h+" "+(m-45));
                  }
        }
}