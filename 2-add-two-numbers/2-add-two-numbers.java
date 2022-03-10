/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        int carry=0;
        ListNode answer = null,ret=null;
        while(l1!=null || l2!=null){
            int sum;
            if(l1!=null && l2==null) sum = l1.val+carry;
            else if(l2!=null && l1==null) sum = l2.val+carry;
            else sum = l1.val+l2.val+carry;
            if(sum>9){
                carry=sum/10;
                sum=sum%10;
            }else carry=0;
            //System.out.println("sum is "+sum +" carry is "+carry);
            ListNode node = new ListNode(sum);
            if(answer==null){
              answer=node;
                ret=answer;
            } 
            else{
              answer.next=node;
              answer=answer.next;
            } 
            if(l1!=null)l1=l1.next;
            if(l2!=null)l2=l2.next;
        }
        if(carry>0) answer.next=new ListNode(carry);
        return ret;
    }
}