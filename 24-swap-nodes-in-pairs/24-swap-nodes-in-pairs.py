# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def swapPairs(self, head: ListNode) -> ListNode:
        if head==None or head.next==None:
            return head
        newhead = head.next
        temp = head.next.next
        head.next.next = head
        head.next = self.swapPairs(temp)
        return newhead