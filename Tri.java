import java.util.*;
public class Tri{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        String equation="";
        if(a+b==c){
            equation=a + "+" +b +"="+c;

        }
        if(a-b==c){
            equation= a+"-"+b+"="+c;
        }
        if(a*b==c){
            equation=a+"*"+b+"="+c;
        }
        if(a/b==c && a%b==0){
            equation=a+"/"+b+"="+c;
        }
        if(a==b+c){
            equation=a+"="+b+"+"+c;
        }
        if(a==b-c){
            equation=a+"="+b+"-"+c;
        }
        if(a==b*c){
            equation=a+"="+b+"*"+c;
        }
        if(b/c==a && b%c==0){
            equation=a+"="+b+"/"+c;
        }
        System.out.println(equation);
    }
}