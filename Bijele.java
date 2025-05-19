import java.util.*;
public class Bijele{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int kings = sc.nextInt();
        int queens= sc.nextInt();
        int rook= sc.nextInt();
        int bishop= sc.nextInt();
        int knights = sc.nextInt();
        int pawns = sc.nextInt();
        if(kings>1){
            kings=1-kings;

        }
        else if(kings<1){
            kings=1-kings;

        }
        else{
            kings=0;
        }

        if(queens>1){
            queens=1-queens;

        }
        else if(queens<1){
            queens=1-queens;
        }
        else{
            queens=0;
        }
  
       if(rook>2){
        rook=2-rook;
       }
       else if(rook<2){
        rook=2-rook;
       }
       else{
        rook=0;
       }
    

       if(bishop>2){
        bishop=2-bishop;
       }
       else if(bishop<2){
        bishop=2-bishop;
       }
       else{
        bishop=0;
       }
       if(knights>2){
        knights=2-knights;
       }
       else if(knights<2){
        knights=2-knights;
       }
       else{
        knights=0;
       }
       if(pawns>8){
        pawns=8-pawns;
       }
       else if(pawns<8){
        pawns=8-pawns;

       }
       else{
        pawns=0;

       }
       System.out.println(kings);
       System.out.println(queens);
       System.out.println(rook);
       System.out.println(bishop);
       System.out.println(knights);
       System.out.println(pawns);


}

}