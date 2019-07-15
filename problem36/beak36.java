import java.util.Scanner;
public class beak36{
         public static void main(String[] args){
                   Scanner scan=new Scanner(System.in);
                   int [] list=new int[8];
                   int as=0,de=0;
                   list[0]=scan.nextInt();
                   for(int i=1;i<8;i++)
                   {
                        list[i]=scan.nextInt();
                        if(list[i-1]>list[i])
                        {
                             as=1;     
                        }
                        if(list[i]>list[i-1])
                        {
                             de=1;
                        }
                   }
                   if(as==0)
                   {
                        System.out.print("ascending");
                   }
                   else if(de==0)
                   {
                        System.out.print("descending");
                   }
                   else
                   {
                        System.out.print("mixed");
                   }
         }
}