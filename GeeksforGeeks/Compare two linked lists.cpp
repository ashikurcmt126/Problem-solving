/*Linked List Node Structure 
struct Node
{
    char c;
    struct Node*next;
};
*/
int compare(struct Node*list1,struct Node*list2)
{
    struct Node* temp1=list1;
    struct Node* temp2=list2;
    while(temp1&&temp2&&temp1->c==temp2->c){
        temp1=temp1->next;
        temp2=temp2->next;
    }
    if(temp1&&temp2){
        if(temp1->c>temp2->c)return 1;
        else return -1;
    }
    if(temp1&&!temp2)return 1;
    
    
    if(temp2&&!temp1)return -1;
    
    
    return 0;
    
}