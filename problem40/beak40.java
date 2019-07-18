import java.util.Scanner;
public class beak40{
         public static void main(String[] args){
                  Scanner scan=new Scanner(System.in);
                  int a=scan.nextInt(),score=0,total=1;
                  for(int j=0;j<a;j++)
                  {
                    String str=scan.next();
                    char[] list=str.toCharArray();
                    total-=1;
                    for(int i=0;i<list.length;i++)
                    {
                          if(list[i]=='O')
                          {
                              score+=1;
                              total+=score;
                          }
                          else if(list[i]=='X')
                          {
                               score=0;
                          }
                     }
                     System.out.print(total+"\n");
                     total=1;
                     score=0; 
                  }
         }
}