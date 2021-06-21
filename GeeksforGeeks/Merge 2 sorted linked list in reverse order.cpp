/*
The structure of linked list is the following
struct Node
{
int data;
Node* next;
};
*/
struct Node * mergeResult(Node *a,Node *b)
{
    if (a==NULL && b==NULL) return NULL; 
 
    Node *res = NULL; 
  
    while (a != NULL && b != NULL) 
    { 
         
        if (a->data <= b->data) 
        {  
            Node *temp = a->next; 
  
            a->next = res; 
            res = a; 

            a = temp; 
        } 
 
        else
        { 
            Node *temp = b->next; 
            b->next = res; 
            res = b; 
            b = temp; 
        } 
    } 

    while (a != NULL) 
    { 
        Node *temp = a->next; 
        a->next = res; 
        res = a; 
        a = temp; 
    } 

    while (b != NULL) 
    { 
        Node *temp = b->next; 
        b->next = res; 
        res = b; 
        b = temp; 
    } 
  
    return res; 
}