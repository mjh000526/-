import java.util.Scanner;
public class beak35{
        public static void main(String[] args){
                 Scanner scan=new Scanner(System.in);
                 int max=0;
                 int num=0;
                 int [] list=new int[9];
                 for(int i=0;i<9;i++)
                 {
                          list[i]=scan.nextInt();
                          if(max<=list[i])
                          {
                                 max=list[i];
                                 num=i+1;
                          }
                 }
                 System.out.print(max+"\n"+num);
        }
}