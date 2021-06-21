
/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*
Structure of the node of the binary tree
struct Node
{
	int data;
	struct Node *next;
};
*/
// Complete this function
void deleteAlt(struct Node *head){
    struct Node* temp=head;
    struct Node* check=NULL;
    while(temp->next!=NULL){
        check=temp->next;
        temp->next=temp->next->next;
        temp=check;
    }
}
