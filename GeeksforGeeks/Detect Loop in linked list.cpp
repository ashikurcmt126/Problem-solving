
/*The structure of linked list is the following
struct node
{
int data;
node* next;
};*/

int detectloop(struct node *list){

    struct node* temp1=list;
    struct node* temp2=list;

    while(temp1 && temp2 && temp2->next){
        temp1=temp1->next;
        temp2=temp2->next->next;

        if(temp1==temp2){
            return 1;
        }
    }
    return 0;
}