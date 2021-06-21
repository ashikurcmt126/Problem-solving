/*
The structure of linked list is the following
struct Node
{
int data;
Node* next;
};
*/
Node *removeDuplicates(Node *root)
{
    int a[100000]={0};
    struct Node* temp=root;
    struct Node* k=root;
    struct Node* top=root;
    a[temp->data]=1;
    temp=temp->next;
    while(temp!=NULL){

        if(a[temp->data]==0){
            top->next=temp;
            top=temp;
            a[temp->data]=1;
        }
        temp=temp->next;
    }
    top->next=NULL;
    return k;
}