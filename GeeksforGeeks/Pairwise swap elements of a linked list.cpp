
void pairWiseSwap(struct node *head)
{
    struct node* temp=head;
    struct node* check;

    while(temp!=NULL&&temp->next!=NULL){
        int data=temp->data;
        temp->data=temp->next->data;
        temp->next->data=data;

        temp=temp->next->next;
    }

}