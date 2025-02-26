class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        """
        Merges two sorted linked lists.

        Args:
            list1: The head of the first sorted linked list.
            list2: The head of the second sorted linked list.

        Returns:
            The head of the merged sorted linked list.
        """
        dummy = ListNode()  # Dummy node to start the merged list
        tail = dummy

        while list1 and list2:
            if list1.val < list2.val:
                tail.next = list1
                list1 = list1.next
            else:
                tail.next = list2
                list2 = list2.next
            tail = tail.next

        if list1:
            tail.next = list1
        elif list2:
            tail.next = list2

        return dummy.next