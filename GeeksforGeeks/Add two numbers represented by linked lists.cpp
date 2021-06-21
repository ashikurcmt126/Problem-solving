
Node*  addTwoLists(Node* first, Node* second){
    
    struct Node* temp=NULL,*res=NULL,*prev=NULL;

    int carry=0,sum=0;
    while(first||second){
        sum = carry + (first? first->data: 0) + (second? second->data: 0);
        carry = (sum >= 10)? 1 : 0;
        sum = sum % 10;
        temp = newNode(sum);
        if(res == NULL)
            res = temp;
        else
            prev->next=temp;

            prev=temp;

        if (first) first = first->next;
        if (second) second = second->next;
    }
    if (carry > 0)
    prev->next=newNode(carry);

    return res;
}