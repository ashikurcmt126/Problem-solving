/* Link list Node 
struct Node {
    int data;
    struct Node* next;
}; */
/* Should return data of intersection point of two linked
   lists head1 and head2.
   If there is no intersecting point, then return -1. */
int getcount(struct Node* head)
{
    struct Node* temp=head;
    int count=0;
    while(temp!=NULL){
        count++;
        temp=temp->next;
    }
    return count;
}
int intersectPoint(Node* head1, Node* head2)
{
    int length1=getcount(head1);
    int length2=getcount(head2);

    struct Node* temp=head1;
    struct Node* temp1=head2;
    for(int i=0;i<length1;i++){
        for(int j=0;j<length2;j++){
            if(temp==temp1){
                return temp->data;
            }
            temp1=temp1->next;
            if(temp1==NULL){
                temp1=head2;
            }
        }
        temp=temp->next;
    }
    return -1;
}