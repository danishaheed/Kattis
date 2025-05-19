import java.util.*;
public class Shatteredcake{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum=0;
        for(int i=0; i<b; i++){
            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = c*d;
            sum+=e;     

        }
        int f = sum/a;
        System.out.println(f);
    }
}