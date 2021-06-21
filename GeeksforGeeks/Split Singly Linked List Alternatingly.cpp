/*
structure of node is as
struct node
{
	int data;
	struct node* next;
};
*/
void alternatingSplitList(struct node* headRef, struct node** aRef, struct node** bRef)
{
    struct node* temp,*prev,*point;
    prev=headRef;
    temp=prev->next;
    int g=0;
    while(temp!=NULL){
        prev->next=temp->next;
        prev=temp->next;
        if(g==0){
            *bRef=temp;
            point=temp;
            g=1;
        }
        else{
            point->next=temp;
            point=point->next;
        }
        if(prev==NULL)break;
        temp=prev->next;

    }
    point->next=NULL;
    *aRef=headRef;
}