/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*
delete n nodes after m nodes
  The input list will have at least one element  
  Node is defined as 
  struct node
  {
     int data;
     struct node *next;
  }
*/
void linkdelete(struct node  *head, int M, int N)
{
    struct node* temp=head;
    int i=0,j=0,g=0;
    struct node* amar=NULL,*tomar=NULL;
    while(temp!=NULL){
        if(i<M){
            if(g==0){
                amar=temp;g=1;
            }
            else{
                amar->next=temp;
                amar=amar->next;
            }
            i++;
            temp=temp->next;
        }
        else if(j<N){
            j++;
            if(j==N){
                j=0;i=0;
            }
            temp=temp->next;
        }
        else{
            i=0;
        }
        
    }
    amar->next=NULL;
}