import java.util.Scanner;
public class beak39{
          public static void main(String[] args){
                  Scanner scan=new Scanner(System.in);
                  int num=scan.nextInt();
                  double most=0;
                  double sum;
                  int total=0;
                  int [] grade=new int[num];
                  for(int i=0;i<num;i++)
                  {
                          grade[i]=scan.nextInt();
                          if(grade[i]>most)
                          {
                                most=grade[i];
                          }
                          total+=grade[i];
                  }
                  sum=100.0*total/most/num;
                  System.out.print(String.format("%.2f",sum));
          }
}