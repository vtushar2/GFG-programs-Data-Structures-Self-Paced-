class Solution
{
    //Function to count nodes of a linked list.
    public static int getCount(Node head)
    {
        
        //Code here
        int n=0;
        while(head!=null)
        {
            n++;
            head=head.next;
        }
        return n;
    }
}
    
