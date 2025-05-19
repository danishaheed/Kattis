import java.util.*;
public class Sunandmoon{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int count =0;
        while(!(a==b && c==d)){
            a+=1;
            c+=1;
            if(a>b){
                a=1;
            }
            if(c>d){
                c=1;
            }
            
           count=count+1;

        }
        System.out.println(count);
    }
}