/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//function Template for C++
/* Linked List Node structure
   struct Node  {
     int data;
     Node *next;
  }
*/
// Should reverse list and return new head.
Node* reverse(Node *head)
{
    struct Node* temp=head;
    struct Node *pre=NULL,*next=NULL;
    while(temp!=NULL){
        next=temp->next;
        temp->next=pre;
        pre=temp;

        temp=next;
    }
    return pre;
}