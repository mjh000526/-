import java.util.Scanner;
public class beak12{
        public static void main(String[] args){
                       Scanner scan=new Scanner(System.in);
                       int first = scan.nextInt();
                       int second = scan.nextInt();
                       int one=second-(second/10*10);
                       int two=(second/10)-(second/100*10);
                       int three=second/100;
                       System.out.println(one*first+"\n"+two*first+"\n"+three*first+"\n"+first*second);
        }
}