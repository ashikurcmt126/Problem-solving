/* The structure of the Linked list Node is as follows:
struct Node {
    int val;
    struct Node* next;
}; */
void intersection(Node **head1, Node **head2,Node **head3)
{
    struct Node* temp1=*head1;
    struct Node* temp2=*head2;
    struct Node** temp3=head3;

    while(temp1!=NULL&&temp2!=NULL){
        if(temp1->val==temp2->val){
            push(temp3,temp1->val);
            
            temp1=temp1->next;
            temp2=temp2->next;

        }
        else if(temp1->val<temp2->val){
            temp1=temp1->next;
        }else{
            temp2=temp2->next;
        }
    }

}