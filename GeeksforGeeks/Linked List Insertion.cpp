
/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*
Structure of the linked list node is as
struct node
{
    int data;
    struct node *next;
};
*/
// function inserts the data in front of the list
void insertAtBegining(struct node** headRef, int newData)
{
    struct node* temp;
    temp=new node;
    temp->data=newData;
    temp->next=*headRef;
    *headRef=temp;

}
void insertAtEnd(struct node** headRef,int newData)
{
    struct node* temp=*headRef;
    struct node* ode=new node;
    ode->data=newData;
    ode->next=NULL;


    if(*headRef==NULL){
        *headRef=ode;
        return;
    }
    while(temp->next!=NULL){
        temp=temp->next;
    }

    temp->next=ode;
}