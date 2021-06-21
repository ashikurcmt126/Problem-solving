
/* struct Node
 {
   int data;
   Node* next;
 }; */
/* Should return data of n'th node from the end of linked list */
int getNthFromLast(Node *head, int n)
{
    
       int count=0;
       struct Node* temp=head;
       struct Node* temp1=head;
       while(temp!=NULL){
        temp=temp->next;
        count++;
       }
        if(n>count)return -1;
       int fcount=count-n;
       //int finalcount=count-fcount;
       while(fcount--&&temp1->next!=NULL){
        temp1=temp1->next;
       }
       return temp1->data;
}
