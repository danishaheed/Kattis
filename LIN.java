import java.util.*;

 class LIN{
    public static void main(String[] args){
        LL a = new LL();
        a.add(14);
        a.add(16);
        a.add(13);
        a.print();
        System.out.println(a.size());



        

        
    }

}
  class LL{
    
    public class Node{
        int data;
        Node next;
        
         public Node(int data){
            this.data= data;
            this.next= null;
       


        }
 

       

    }
    Node head;
    Node temp;
    int count;
    public  void add(int data){
        Node toinsert= new Node(data);
        if (head==null){
            head=toinsert;


        }
        Node temp= head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=toinsert;
        
        
        
    }
    public  void print(){
        while(temp!=null){
        System.out.println(temp.data);
        temp=temp.next;
            
        }
    }
    public int size(){
     while(temp!=null){
        count++;
        temp=temp.next;


     }
     return count;


    }
    

    

    }



