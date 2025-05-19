import java.util.*;
public class Aa{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        int b = sc.nextInt();
        double area= 0;
        for(int i=0; i<b;i++){
            double c = sc.nextDouble();
            double d = sc.nextDouble();
            double e= c*d;
            area+=e;
        }
        double f= area*a;
        System.out.println(f);
  


    }
}