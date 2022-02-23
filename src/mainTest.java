
public class mainTest {
	
	public static class ListNode {
	    int val;
	    ListNode next;
	    ListNode() {}
	    ListNode(int val) { this.val = val; }
	    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
    public static ListNode addTwoNumbers(ListNode l1, ListNode m1) {
    	ListNode Result =new  ListNode ();
    	ListNode pointer =Result;
    	int remainder=0;
    	while((l1!=null)&&(m1!=null)) {
    		int sumNode=l1.val+m1.val+remainder;
			remainder=sumNode/10;
			pointer.val=sumNode%10;
    		if((l1.next!=null)||(m1.next!=null)) {
    			pointer.next=new  ListNode ();
    			pointer=pointer.next;	
			}
    		l1=l1.next;
    		m1=m1.next;	
    	}
    	ListNode remainderList = null;
    	if((l1!=null)||(m1!=null)) {
    		if(l1!=null) {
    			remainderList=l1;
    		}
    		else {
    			remainderList=m1;
    		}
    	}
    	if(remainderList!=null) {
    		while(remainderList!=null) {
    			int sumNode=remainderList.val+remainder;
    			remainder=sumNode/10;
    			pointer.val=sumNode%10;
        		if((remainderList.next!=null)) {
        			pointer.next=new  ListNode ();
        			pointer=pointer.next;	
    			}
        		remainderList=remainderList.next;
    		}
    		
    	}
    	if(remainder>0) {
			pointer.next=new  ListNode ();
			pointer=pointer.next;	
    		pointer.val=remainder;
    	}
    	
		return Result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode L1=new ListNode(9);
		ListNode L2=new ListNode(9);
		ListNode L3=new ListNode(9);
		ListNode L4=new ListNode(9);
		L1.next=L2;
		L2.next=L3;
		L3.next=L4;
		
		ListNode M1=new ListNode(9);
		ListNode M2=new ListNode(9);
		ListNode M3=new ListNode(9);
		ListNode M4=new ListNode(9);
		ListNode M5=new ListNode(9);
		ListNode M6=new ListNode(9);
		ListNode M7=new ListNode(9);
		M1.next=M2;
		M2.next=M3;
		M3.next=M4;
		M4.next=M5;
		M5.next=M6;
		M6.next=M7;
		
		
		ListNode Result=addTwoNumbers(L1,M1);
		while(Result!=null) {
			System.out.println(Result.val);
			Result=Result.next;
		}
	}

}
