/**
 * THis is the class for generate a Linked list
 */

import org.w3c.dom.Node;

import java.util.List;

public class LinkedList {
    public list Head=null;
    public list Tail=null;
    public list currentNode=null;
    public int size=0;

    /**
     * add element into list's tail
     * @param data
     */
    public void add(int data){
        list addNode=new list(data);
        if (Head==null){
            Head=addNode;
            currentNode=addNode;
            Tail=addNode;
        }
        else {
            currentNode.next=addNode;
            currentNode=addNode;
            size++;

        }
    }

    /**
     * This is used for insert a element into a list
     * @param data
     * @param position
     */
    public void insert(int data,int position){
        if (position>size){
        return;}
        else {
            list newNode=new list(data);
            if (position==0){
                newNode.next=Head;
                Head=newNode;
                if (Tail==null){
                    Tail=newNode;
                }
                size++;
                currentNode=newNode;
            }
            else if (position==size){
                add(data);
            }
            else {
                list tempPre=new list(0);
                //to find the former element of the insert position
                tempPre=Head;
                for (int i=0;i<position-1;i++){
                    tempPre=tempPre.next;
                }
                list tempPost=new list(0);
                //to find the later element of the insert position
                tempPost=tempPre.next;
                tempPre.next=newNode;
                newNode.next=tempPost;
            }

        }
    }

    /**
     * use string to display the Linked list
     * @param ListHead
     * @return
     */
    public static String displayList(list ListHead){
        int show=0;
        list testNode=new list(ListHead.data);
        if (testNode==null){
            show=00;
        }

        testNode=ListHead;
        String str="";
        String s="";

        while (testNode!=null){

            show=testNode.data;

            s=Integer.toString(show);
            str=str+" "+s;
            testNode=testNode.next;
        }
        return str;

    }

    /**
     * get the Linked list size
     * @param inputlistHead
     * @return
     */
    public static int getsize(list inputlistHead){
        list node=inputlistHead;
        int i=1;
        for(i=0;node!=null;i++){
            node = node.next;
        }
        return i;

    }

    /**
     * use fast & slow pointers with different traverse speed to determine the mid Node
     * @param inputlistHead
     * @return
     */
    public static list getMid(list inputlistHead){
        list fast = inputlistHead;
        list slow = inputlistHead;
        while (fast != null && slow != null) {
            if (fast.next==null||fast.next.next==null){
//                slow = slow.next;
                fast=fast.next;
            }else {
                slow = slow.next;
                fast = fast.next.next;
            }

        }

        return slow;
    }
    public static list toList(int[] arr){
        list Node =new list(0);
        LinkedList Llist=new LinkedList();
//        Llist.Head=Node;
        for (int i=0;i<arr.length;i++){
            Llist.add(arr[i]);
        }
        return Llist.Head;
    }

    public static void main(String[] args) {
        LinkedList test=new LinkedList();
        test.add(1);
        test.add(2);
        test.add(3);
        test.insert(0,1);
        test.add(6);
        test.displayList(test.Head);
        System.out.println(getsize(test.Head));
        System.out.println(test.getMid(test.Head).data);

    }
}
