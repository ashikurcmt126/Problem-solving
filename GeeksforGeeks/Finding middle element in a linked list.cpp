/* Link list Node 
struct Node {
    int data;
    Node* next;
}; */
/* Should return data of middle node. If linked list is empty, then  -1*/
int getMiddle(struct Node *head)
{
   struct Node* temp=head;
   struct Node* temp2=head;
   int count=0;
   while(temp!=NULL){
    temp=temp->next;
    count++;
   }
   int mid=count/2;
   int i=0;
   while(i!=mid){
    temp2=temp2->next;
    i++;
   }
   return temp2->data;
}