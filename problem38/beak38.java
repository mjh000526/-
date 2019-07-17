import java.util.Scanner;
public class beak38{
         public static void main(String[] args){
                 Scanner scan=new Scanner(System.in);
                 int a=0,same=0;
                 int [] list=new int[10];
                 for(int i=0;i<10;i++)
                 {
                       list[i]=scan.nextInt()%42;
                       for(int j=0;j<i;j++)
                       {
                            if(list[j]==list[i])
                            {
                                    same=1;
                            }
                       }
                       if(same==0)
                       {
                             a+=1;
                       }
                       same=0;
                 }
                 System.out.print(a);
         }
}