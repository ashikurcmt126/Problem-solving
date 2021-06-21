/* Link list Node 
struct Node
{
    int data;
    Node* next;
};*/
/*You are required to complete below method*/
Node* deleteNode(struct Node* head,int data)
{
    if(head==NULL){
        return NULL;
    }
    else if (data==1){
        struct Node* temp=head;
        //delete(head);
       return temp->next;
    }
    else{
        struct Node* temp=head;
        struct Node* head2;
        head2=temp;
    data--;
    data--;
    while(data--){
      temp=temp->next;
    }
    if(temp->next->next!=NULL){
       temp->next=temp->next->next;
       //delete(temp->next);
    }
    else{
      delete(temp->next);
        temp->next=NULL;
    }
    
    return head2;
    }

}