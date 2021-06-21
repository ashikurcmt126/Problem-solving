/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*
  Return the no. of times search_for data is there in a linked list.
  The input list will have at least one element  
  Node is defined as 
  struct node
  {
     int data;
     struct node *next;
  }
*/
int count(struct node* head, int search_for)
{
    struct node* temp=head;
    int count=0;
    while(temp!=NULL){
        if(search_for==temp->data)count++;
        temp=temp->next;
    }
    return count;
}