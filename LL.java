// PROGRAM TO REVERSE A SINGLLY LINKEDLIST 
import java.util.ArrayList;
import java.util.Scanner;
class Node{
  public int data;
  public Node next;
  public Node(){

  }
  public Node(int d){
    data=d;
    next=null;
  }
}
public class LL{
  public Node head;
  public LL(){
    head=null;
  }
  public boolean isEmpty(){
    if(this.head==null)
    return true;
    return false;
  }
  public void insert(int info){
     Node newnode=new Node(info);
    if(isEmpty()){
      this.head=newnode;
      return;
    }

  Node temp=this.head;
    while(temp.next!=null){
      temp=temp.next;
    }
    temp.next=newnode;
  }
  public void display(){
    if(isEmpty()){
      System.out.println("List is empty");
      return;
    }
    Node temp=new Node();
    temp=this.head;
    while(temp.next!=null){
      System.out.print(temp.data+"-->");
      temp=temp.next;
    }
    System.out.println(temp.data);
    }
  public static void reverse(LL list){
    ArrayList<Node> A=new<Node> ArrayList();
    Node n=new Node();
    LL newll=new LL(); //NEW LINKED LIST
    n=list.head;
    while(n.next!=null){
      A.add(n);
      n=n.next;
    }
    A.add(n);
    for(int i=A.size()-1;i>0;i--)
    A.get(i).next=A.get(i-1);
    A.get(0).next=null;
    newll.head=A.get(A.size()-1);
    newll.display();
  }

public static void main(String[] args) {
LL ll=new LL();
int n=new Scanner(System.in).nextInt();
for(int i=0;i<n;i++)
{
ll.insert((new Scanner(System.in)).nextInt());
}
ll.display();
reverse(ll);
}
}
