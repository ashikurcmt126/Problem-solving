
void rotate(struct node **head_ref, int k)
{
    if (k == 0) 
       return; 
   struct node* temp=*head_ref;
   struct node* a=NULL,*b=NULL,*c=NULL;
   int count=0;
   while(temp!=NULL&&count<k){
    a=temp;
    temp=temp->next;
    count++;
   }
   if (temp == NULL) 
        return; 
   c=temp;
   while(temp!=NULL){
    b=temp;
    temp=temp->next;
   }
   b->next=*head_ref;
   *head_ref=c;
   a->next=NULL;


}