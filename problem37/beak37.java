import java.util.Scanner;
public class beak37{
          public static void main(String[] args){
              Scanner scan=new Scanner(System.in);
              int a=scan.nextInt();
              int b=scan.nextInt();
              int c=scan.nextInt();
              int sum=a*b*c;
              int num1,num2;
              int [] list=new int[10];
              while(sum>0)
              {
                    num1=sum;
                    num2=sum/10*10;
                    num1=num1-num2;
                    list[num1]+=1;
                    sum=sum/10;
              }
              for(int i=0;i<10;i++)
              {
                 System.out.print(list[i]+"\n");
              }
          }
}