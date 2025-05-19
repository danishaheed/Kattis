import java.util.*;
public class Pokechat{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String message= sc.next();
        String id= sc.next();
        String[] t = id.split("");
        String result= "";
        HashMap<String,Character> map= new HashMap<>();
        for (int i=0; i<message.length();i++){
            String a = String.format("%03d", i+1);
            Character b= message.charAt(i);
            map.put(a, b);
            
        }
        for (String s : t) {
           char c= map.get(b);
           result+=c;


            
        }
        System.out.println(result);


  


        }
    }