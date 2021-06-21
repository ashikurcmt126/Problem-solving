
/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*
Structure of the node of the linked list is as
struct Node
{
	int data;
	struct Node *next;
};
*/
// Complete this function
// return true if two list are identical else return false
bool areIdentical(struct Node *head1, struct Node *head2)
{
    struct Node* temp=head1;
    struct Node* temp1=head2;
    while(temp!=NULL&&temp1!=NULL){
        if(temp->data!=temp1->data){
            return false;
        }
        temp=temp->next;
        temp1=temp1->next;
    }
    if(temp1!=NULL||temp!=NULL){
        return false;
    }
    
    return true;
}