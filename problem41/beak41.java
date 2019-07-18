import java.util.Scanner;
public class beak41{
          public static void main(String[] args){
                 Scanner scan=new Scanner(System.in);
                 int c=scan.nextInt();
                 double sum=0,mid=0;
                 for(int i=0;i<c;i++)
                 {
                         int num=scan.nextInt();
                         int [] list=new int[num];
                         for(int x=0;x<num;x++)
                         {
                               list[x]=scan.nextInt();
                               mid+=list[x];
                         }
                         mid=mid/num;
                         for(int y=0;y<num;y++)
                         {
                              if(list[y]>mid)
                              {
                                     sum+=1;
                              }
                         }
                         sum=sum/num*100;
                         System.out.print(String.format("%.3f",sum)+"%\n");
                         sum=0;
                         mid=0;
                 }
          }
}