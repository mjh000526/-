import java.io.BufferedReader;
import java.io.BufferedWriter;
public class beak23{
        public static void main(String[] args){
                BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.in));
                int a=Integer.parseInt(bf.readLine());
                int one,two;
                for(int i=0;i<a;i++)
                {
                       one=Integer.parseInt(bf.readLine());
                       two=Integer.parseInt(bf.readLine());
                       bw.write((one+two)+"\n");
                }
        }
}