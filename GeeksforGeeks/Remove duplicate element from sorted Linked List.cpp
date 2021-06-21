/*The structure of linked list is the following
struct Node
{
int data;
Node* next;
};*/
Node *removeDuplicates(Node *root)
{
    struct Node* k=root;
    struct Node* top=root;
    struct Node* temp=root;

    while(temp->next!=NULL){
        if(top->data==temp->next->data){
            temp=temp->next;
        }
        else{
            top->next=temp->next;
            top=temp->next;
        }
    }
    top->next=temp->next;
    return k;
}