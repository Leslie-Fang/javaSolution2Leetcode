package org.intel.dcg;
class Solution {
	ListNode myListNode;
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	if(l1 == null){
    		return l2;
    	}else if(l2 == null){
    		return l1;
    	}
    	if(l1.val<l2.val){
			myListNode = l1;
			l1 = l1.next;
    	}else{
    		myListNode = l2;
    		l2 = l2.next;
    	}
    	//ListNode myListNode = new ListNode(Math.min(l1.val,l2.val));
    	ListNode cListNode = myListNode;
    	while(l1 != null && l2 != null){
    		if(l1.val<l2.val){
				cListNode.next = l1;
				l1 = l1.next;
				cListNode = cListNode.next;
    		}else{
    			cListNode.next = l2;
				l2 = l2.next;
				cListNode = cListNode.next;
    		}
    	}
    	if(l1 != null){
			cListNode.next = l1;
    	}else if(l2 != null){
    		cListNode.next = l2;

    	}
    	return myListNode;
    }
}