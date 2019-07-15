import java.util.Scanner;
public class beak34{
        public static void main(String[] args){
                Scanner scan=new Scanner(System.in);
                int a=scan.nextInt();
                int list []=new int[a];
                int max=-1000001,min=1000001;
                for(int i=0;i<a;i++)
                {
                     list[i]=scan.nextInt();
                     if(min>=list[i])
                     {
                          min=list[i];
                     }
                     if(max<=list[i])
                     {
                          max=list[i];
                     }       
                }
                System.out.print(min+" "+max);
        }
}