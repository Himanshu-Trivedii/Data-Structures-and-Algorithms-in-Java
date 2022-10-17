/*

    Following is the Node class already written for the Linked List

    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;
    
        public LinkedListNode(T data) {
            this.data = data;
        }
    }

*/

public class Solution {

	private static int Helper(LinkedListNode<Integer>head,int n,int counter){
        if(head==null)return -1;
        if(head.data==n)return counter;
        return Helper(head.next,n,counter+1);
    } 
	public static int findNodeRec(LinkedListNode<Integer> head, int n) {
    	return Helper(head,n,0);
	}

}