import java.util.*;
public class Rating{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double sum=0;
        double nsum=0;
        double ans=0;
        double max=0;
        double min =0;
        for(int i=0; i<b; i++){
            int c = sc.nextInt();
            sum+=c;

        }
            nsum= sum+(3*(b-a));
            max= nsum/a;
            System.out.println(max);
            nsum=0;
            nsum= sum+(-3*(b-a));
            min= nsum/a;
            System.out.println(min);



        }


    }
