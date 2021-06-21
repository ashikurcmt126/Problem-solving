struct node *reverse (struct node *head, int k)
{
    struct node* temp=head;
    struct node* pre=NULL;
    struct node* next=NULL;
    int count=0;
    while(temp!=NULL&&count<k){
        next=temp->next;
        temp->next=pre;
        pre=temp;
        temp=next;
        count++;
    }
    if(temp!=NULL){
        head->next=reverse(temp,k);
    }
    return pre;
}