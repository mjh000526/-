import java.util.Scanner;
public class beak33{
        public static void main(String[] args){
                Scanner scan=new Scanner(System.in);
                int num=scan.nextInt();
                int ten,one;
                int a=0;
                int sum=num;
                while(true){
                       ten=sum/10;
                       one=sum-(ten*10);
                       if((ten+one)>9){
                               ten=(one+ten)-((one+ten)/10*10);
                       }
                       else{
                               ten=ten+one;
                       }
                       sum=(one*10)+ten;
                       a+=1;
                       if(sum==num){
                             System.out.print(a);
                             break;
                       } 
                }
          }
}