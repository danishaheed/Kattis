import java.util.*;
public class Spavanc{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(b<45){
            if(a==0){
                a=24;
            }
            a-=1;
            b= b+15;

        }
        else{
            b=b-45;
        }
        System.out.println(a);
        System.out.println(b);

    }
}